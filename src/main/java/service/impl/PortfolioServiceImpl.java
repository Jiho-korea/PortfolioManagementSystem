/*
========================================================================
파    일    명 : PortfolioServiceImpl.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.22
작  성  내  용 : 프로젝트, 자격증, 행사참여, 봉사활동 목록을 모아 리턴해주는 서비스 클래스
========================================================================
*/
package service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.Project;
import service.PortfolioService;
import service.ProjectListService;
import vo.Portfolio;

@Service("portfolioService")
@Transactional
public class PortfolioServiceImpl implements PortfolioService {

	@Resource(name = "projectListService")
	ProjectListService projectListService;

	@Override
	public Portfolio getPortfolio(String memberId) throws Exception {
		Portfolio portfolio = new Portfolio();
		List<Project> projects = projectListService.listProject(memberId);

		portfolio.setProjects(projects);
		return portfolio;
	}

}
