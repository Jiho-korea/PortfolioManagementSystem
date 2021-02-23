/*
========================================================================
파    일    명 : LoginService.java
========================================================================
작    성    자 : 박민환
작    성    일 : 2021.02.19
작  성  내  용 : Id와 PW를 통해 사용자를 검색하는 메서드 선언 인터페이스
========================================================================
*/
package service;

import vo.MemberInfo;

public interface LoginService {
	public MemberInfo login(String memberId, String memberPw) throws Exception;
}
