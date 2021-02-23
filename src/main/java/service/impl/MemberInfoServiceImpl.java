/*
========================================================================
파    일    명 : MemberInfoServiceImpl.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.22
작  성  내  용 : projectRepository의 findProjectByMemberId메서드를 이용하는 서비스
========================================================================
*/
package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import repository.MemberRepository;
import service.MemberInfoService;
import vo.MemberInfo;

@Service("memberInfoService")
@Transactional
public class MemberInfoServiceImpl implements MemberInfoService {

	@Autowired
	private MemberRepository memberRepository;

	@Override
	public MemberInfo getMemberInfo(String memberId) throws Exception {
		MemberInfo memberInfo = memberRepository.findExceptMemberPw(memberId);
		return memberInfo;

	}
}
