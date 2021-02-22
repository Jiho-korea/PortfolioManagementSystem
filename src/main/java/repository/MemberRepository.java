/*
========================================================================
파    일    명 : MemberRepository.java
========================================================================
작    성    자 : 박민환
작    성    일 : 2021.02.19
작  성  내  용 : member 테이블 가져오는 Repository객체
========================================================================
*/
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
	public Member findByMemberId(String memberId);

	public Member findByMemberIdAndMemberPw(String memberId, String memberPw);

}
