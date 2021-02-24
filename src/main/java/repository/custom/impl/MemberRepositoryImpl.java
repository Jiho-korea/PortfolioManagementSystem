/*
========================================================================
파    일    명 : MemberRepositoryImpl.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.24
작  성  내  용 : Member테이블 SELECT쿼리 커스텀 구현 객체
========================================================================
*/
package repository.custom.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;
import org.springframework.transaction.annotation.Transactional;

import com.mysema.query.Tuple;
import com.mysema.query.jpa.impl.JPAQuery;

import entity.Member;
import entity.QMember;
import exception.MemberNotFoundException;
import repository.custom.MemberRepositoryCustom;
import vo.MemberInfo;

@Transactional(readOnly = true)
public class MemberRepositoryImpl extends QueryDslRepositorySupport implements MemberRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;

	public MemberRepositoryImpl() {
		super(Member.class);
	}

	@Override
	public MemberInfo findExceptMemberPw(String memberId) throws Exception {
		JPAQuery query = new JPAQuery(entityManager);
		QMember qMember = QMember.member;
		// uniqueResult : 조회 결과 레코드가 하나 일때 (매개변수로 조회할 칼럼을 넣어줌)
		Tuple tuple = query.from(qMember).where(qMember.memberId.eq(memberId)).uniqueResult(qMember.memberId,
				qMember.memberName, qMember.memberMil, qMember.memberBirth, qMember.memberHigh, qMember.memberAddress,
				qMember.memberPhone, qMember.memberEmail, qMember.memberLevelCode, qMember.memberGrade);

		if (tuple == null) {
			throw new MemberNotFoundException("not found member");
		}

		return new MemberInfo(tuple.get(qMember.memberId), tuple.get(qMember.memberName), tuple.get(qMember.memberMil),
				tuple.get(qMember.memberBirth), tuple.get(qMember.memberHigh), tuple.get(qMember.memberAddress),
				tuple.get(qMember.memberPhone), tuple.get(qMember.memberEmail), tuple.get(qMember.memberLevelCode),
				tuple.get(qMember.memberGrade));
	}

}
