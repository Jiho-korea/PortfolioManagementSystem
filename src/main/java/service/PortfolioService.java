/*
========================================================================
파    일    명 : ProfolioService.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.22
작  성  내  용 : 프로젝트, 자격증, 행사참여, 봉사활동 목록을 모아 리턴해주는 서비스 인터페이스
========================================================================
*/
package service;

import vo.Portfolio;

public interface PortfolioService {
	public Portfolio getPortfolio(String memberId) throws Exception;
}
