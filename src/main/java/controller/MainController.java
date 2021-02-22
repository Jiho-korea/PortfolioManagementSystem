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
수  정  내  용 : 세션의 MEMBER LEVEL 값에 따라 다른 컨트롤러로 리다이렉트 하도록 변경
========================================================================
*/
package controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vo.AuthInfo;

@Controller
public class MainController {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@RequestMapping("/main")
	public String main(HttpSession session, Model model) {
		AuthInfo authInfo = null;
		if (session != null) {
			authInfo = (AuthInfo) session.getAttribute("authInfo");
		}
		switch (authInfo.getMemberLevel()) {
		case "ML01":
			return "redirect:/view/portfolio?memberId=" + authInfo.getMemberId();
		case "ML02":
			return "redirect:/view/portfolio?memberId=" + authInfo.getMemberId();
		case "ML03":
			return "redirect:/view/portfolio?memberId=" + authInfo.getMemberId();
		case "ML04":
			return "redirect:/view/portfolio?memberId=" + authInfo.getMemberId();
		}
		return "redirect:/login";

	}

}
