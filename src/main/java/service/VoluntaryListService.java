/*
========================================================================
파    일    명 : VoluntaryListService.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.28
작  성  내  용 : memberId를 통해 학생의 봉사활동 리스트를 검색하는 메서드 선언 인터페이스
========================================================================
*/
package service;

import java.util.List;

import entity.Voluntary;

public interface VoluntaryListService {
	public List<Voluntary> listVoluntary(String memberId) throws Exception;
}
