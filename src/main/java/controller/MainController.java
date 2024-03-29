/*
========================================================================
파    일    명 : MainController.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.01.02
작  성  내  용 : 메인 페이지 Controller
========================================================================
수    정    자 : 강지호
수    정    일 : 2021.02.21
수  정  내  용 : 세션의 member level 값에 따라 다른 컨트롤러로 리다이렉트 하도록 변경
========================================================================
*/
package controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vo.MemberInfo;

@Controller
public class MainController {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@RequestMapping("/main")
	public String main(HttpSession session, Model model) {
		MemberInfo memberInfo = null;
		if (session != null) {
			memberInfo = (MemberInfo) session.getAttribute("login");
		}

		if ("ML03".equals(memberInfo.getMemberLevelCode())) {
			return "redirect:/view/portfolio?memberId=" + memberInfo.getMemberId();
		} else {
			return "redirect:/admin/list/student";
		}
	}
}
