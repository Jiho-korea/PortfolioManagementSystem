/*
========================================================================
파    일    명 : MemberRepositoryCustom.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.24
작  성  내  용 : Member 테이블 SELECT쿼리 커스텀을 위한 인터페이스
========================================================================
*/
package repository.custom;

import vo.MemberInfo;

public interface MemberRepositoryCustom {
	MemberInfo findExceptMemberPw(String memberId) throws Exception;
}
