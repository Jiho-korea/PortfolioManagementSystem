/*
========================================================================
파    일    명 : ViewPortfolioController.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.21
작  성  내  용 : 포트폴리오 확인 페이지 Controller
========================================================================
*/
package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.PortfolioService;
import vo.Portfolio;

@Controller
public class ViewPortfolioController {

	private static final Logger logger = LoggerFactory.getLogger(ViewPortfolioController.class);

	@Resource(name = "portfolioService")
	PortfolioService portfolioService;

	@RequestMapping("/view/portfolio")
	public String viewPortfolio(@RequestParam(value = "memberId", required = false) String memberId,
			HttpSession session, Model model) {
		// 포트폴리오 조회 코드 작성 (다른 사람의 portfolio는 못보게 하는 인터셉터 필요)
		if (memberId == null) {
			return "redirect:/main";
		}

		try {
			Portfolio portfolio = portfolioService.getPortfolio(memberId);
			model.addAttribute("portfolio", portfolio);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "portfolio/portfolio";
	}

}
