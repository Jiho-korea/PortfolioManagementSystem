package service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.AuthInfo;
import entity.Member;
import exception.MemberNotFoundException;
import repository.MemberRepository;

@Service
public class LoginService {

	@Autowired
	MemberRepository memberRepository;

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
