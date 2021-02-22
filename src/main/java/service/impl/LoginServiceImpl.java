/*
========================================================================
파    일    명 : LoginServiceImpl.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.20
작  성  내  용 : memberRepository의 findByMemberId메서드를 이용하는 서비스
========================================================================
*/
package service.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.Member;
import exception.MemberNotFoundException;
import repository.MemberRepository;
import service.LoginService;
import vo.AuthInfo;

@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	MemberRepository memberRepository;

	@Override
	public AuthInfo login(String memberId, String memberPw) throws Exception {
		Member member;
		if ((member = memberRepository.findByMemberId(memberId)) == null)
			throw new MemberNotFoundException("not found user");
		if (member.getMemberPw() == null || !member.getMemberPw().equalsIgnoreCase(sha256(memberPw)))
			throw new MemberNotFoundException("not match password");

		return new AuthInfo(member.getMemberId(), member.getMemberName(), member.getMemberMil(),
				member.getMemberBirth(), member.getMemberHigh(), member.getMemberAddress(), member.getMemberPhone(),
				member.getMemberEmail(), member.getMemberLevel());
	}

	// 단방향 해시 암호화
	private String sha256(String msg) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(msg.getBytes());

		return new java.math.BigInteger(md.digest()).toString(16);
	}

}
