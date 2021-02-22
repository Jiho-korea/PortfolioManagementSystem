/*
========================================================================
파    일    명 : LogoutController.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.20
작  성  내  용 : 로그아웃시 세션 제거
========================================================================
*/
package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import vo.LoginRequest;

@Controller
public class LogoutController {
	@RequestMapping("/logout")
	public String logout(LoginRequest loginRequest, HttpSession session) {
		session.invalidate();
		return "redirect:/main";
	}
}
