/*
========================================================================
파    일    명 : ParticipationListService.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.03.02
작  성  내  용 : memberId를 통해 학생의 행사참여 리스트를 검색하는 메서드 선언 인터페이스
========================================================================
*/
package service;

import java.util.List;

import entity.Participation;

public interface ParticipationListService {
	public List<Participation> listParticipation(String memberId) throws Exception;
}
