/*
========================================================================
파    일    명 : PortfolioServiceImpl.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.22
작  성  내  용 : 프로젝트, 자격증, 행사참여, 봉사활동 목록을 모아 리턴해주는 서비스 클래스
========================================================================
수    정    자 : 강지호
수    정    일 : 2021.02.24
수  정  내  용 : member 정보 조회 기능 추가
========================================================================
수    정    자 : 강지호
수    정    일 : 2021.02.26
수  정  내  용 : certificate 정보 조회 기능 추가
========================================================================
*/
package service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.Certificate;
import entity.Project;
import entity.Voluntary;
import service.CertificateListService;
import service.MemberInfoService;
import service.PortfolioService;
import service.ProjectListService;
import service.VoluntaryListService;
import vo.MemberInfo;
import vo.Portfolio;

@Service("portfolioService")
@Transactional
public class PortfolioServiceImpl implements PortfolioService {

	@Resource(name = "memberInfoService")
	MemberInfoService memberInfoService;

	@Resource(name = "certificateListService")
	CertificateListService certificateListService;

	@Resource(name = "projectListService")
	ProjectListService projectListService;

	@Resource(name = "voluntaryListService")
	VoluntaryListService voluntaryListService;

	@Override
	public Portfolio getPortfolio(String memberId) throws Exception {
		Portfolio portfolio = new Portfolio();

		MemberInfo memberInfo = memberInfoService.getMemberInfo(memberId);
		List<Certificate> certificates = certificateListService.listCertificate(memberId);
		List<Project> projects = projectListService.listProject(memberId);
		List<Voluntary> voluntaries = voluntaryListService.listVoluntary(memberId);
		portfolio.setMemberInfo(memberInfo);
		portfolio.setCertificates(certificates);
		portfolio.setProjects(projects);
		portfolio.setVoluntaries(voluntaries);
		return portfolio;
	}

}
