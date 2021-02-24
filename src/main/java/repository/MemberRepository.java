/*
========================================================================
파    일    명 : MemberRepository.java
========================================================================
작    성    자 : 박민환
작    성    일 : 2021.02.19
작  성  내  용 : member 테이블 가져오는 Repository객체
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.24
작  성  내  용 : MemberRepositoryCustom를 다중 상속 받아 커스텀한 조회쿼리 사용가능 하도록 변경
========================================================================
*/
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Member;
import repository.custom.MemberRepositoryCustom;

@Repository
public interface MemberRepository extends JpaRepository<Member, String>, MemberRepositoryCustom {
	public Member findByMemberId(String memberId);

	public Member findByMemberIdAndMemberPw(String memberId, String memberPw);

}
