/*
========================================================================
파    일    명 : StudentListController.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.03.08
작  성  내  용 : 관리자의 학생 리스트 Controller 
========================================================================
*/
package controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/list")
public class StudentListController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

//	@Resource(name = "loginService")
//	LoginService loginService;

	@GetMapping("/student")
	public String listStudent(Model model, final HttpServletResponse response, final HttpServletRequest request,
			final HttpSession session) throws Exception {

		return "list/student";
	}

}
