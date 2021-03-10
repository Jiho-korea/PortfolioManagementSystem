/*
========================================================================
파    일    명 : GetHighScoreService.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.03.10
작  성  내  용 : memberId를 통해 학생의 고등학교 성적을 검색하는 메서드 선언 인터페이스
========================================================================
*/
package service;

import entity.High;

public interface GetHighScoreService {
	public High getHighScore(String memberId) throws Exception;
}
