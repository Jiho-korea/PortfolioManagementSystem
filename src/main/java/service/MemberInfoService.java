/*
========================================================================
파    일    명 : MemberInfoService.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.24
작  성  내  용 : memberId를 통해 학생의 개인정보를 조회하는 인터페이스
========================================================================
*/
package service;

import vo.MemberInfo;

public interface MemberInfoService {
	public MemberInfo getMemberInfo(String memberId) throws Exception;
}
