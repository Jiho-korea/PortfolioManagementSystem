/*
========================================================================
파    일    명 : LoginController.java
========================================================================
작    성    자 : 박민환
작    성    일 : 2021.02.19
작  성  내  용 : 로그인 Controller 
========================================================================
*/
package controller;

import java.security.PrivateKey;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import exception.MemberNotFoundException;
import service.KeyGenerator;
import service.LoginService;
import vo.LoginRequest;
import vo.MemberInfo;

@Controller
public class LoginController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@Resource(name = "keyGenerator")
	KeyGenerator keyGenerator;
	@Resource(name = "loginService")
	LoginService loginService;

	@GetMapping("/login")
	public String login(LoginRequest loginRequest, Model model, final HttpServletResponse response,
			final HttpServletRequest request, final HttpSession session) throws Exception {
		keyGenerator.generate(request, session);

		return "login/login";
	}

	@PostMapping("/login")
	public String loginreq(@Valid LoginRequest loginRequest, Errors errors, final HttpServletRequest request,
			final HttpSession session) throws Exception {
		if (errors.hasErrors()) {
			keyGenerator.generate(request, session);
			return "login/login";
		}

		PrivateKey privateKey = (PrivateKey) session.getAttribute("_RSA_PRIVATE_Key_");
		MemberInfo memberInfo = null;
		if (privateKey == null) {
			throw new RuntimeException("not found key");
		}

		try {
			String memberId = keyGenerator.decryptRsa(privateKey, loginRequest.getSecuredid());
			String memberPw = keyGenerator.decryptRsa(privateKey, loginRequest.getSecuredpassword());

			memberInfo = loginService.login(memberId, memberPw);
			session.setAttribute("login", memberInfo);

		} catch (MemberNotFoundException e) {
			errors.reject("notFoundMember");
			keyGenerator.generate(request, session);
			return "login/login";
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e.getMessage(), e);
		}
		return "redirect:/main";
	}

	@ExceptionHandler(ServletException.class)
	public String handleServletException() {
		return "redirect:/login";
	}
}
