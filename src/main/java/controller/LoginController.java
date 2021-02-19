package controller;

import java.security.PrivateKey;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Member;
import repository.MemberRepository;
import service.KeyGenerator;
import service.LoginService;

@Controller
public class LoginController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	@Autowired
	KeyGenerator keyGenerator;
	
	@Autowired
	LoginService loginService;
	
	
	
	@RequestMapping("/login")
	public String test(Model model, final HttpServletResponse response, final HttpServletRequest request, final HttpSession session) throws Exception{
		keyGenerator.generate(request, session);
		
		return "login/login";
	}
	
	@RequestMapping("/loginrequest")
	public String loginreq(String securedid, String securedpassword, final HttpSession session) throws Exception{

		PrivateKey privateKey = (PrivateKey) session.getAttribute("_RSA_PRIVATE_Key_");
		
		if (privateKey == null) {
            throw new RuntimeException("not found key");
        }
		
		try {
			String id = keyGenerator.decryptRsa(privateKey, securedid);
			String password = keyGenerator.decryptRsa(privateKey, securedpassword);
			
			loginService.login(id, password);
		
		}catch(Exception e) {
			throw new ServletException(e.getMessage(), e);
		}
		
		
		return "redirect:main";
	}
}
