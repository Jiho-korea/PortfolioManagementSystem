/*
========================================================================
파    일    명 : MainController.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.01.02
작  성  내  용 : 메인 페이지 Controller
========================================================================
*/
package controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@RequestMapping("/main")
	public String main(HttpSession session, Model model) {
		model.addAttribute("level", "student");
		return "main/main";
	}
	
	
	

}
