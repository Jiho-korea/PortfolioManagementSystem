package service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Member;
import repository.MemberRepository;

@Service
public class LoginService {
	
	@Autowired
	MemberRepository memberRepository;
	
	public Member login(String memberId, String memberPw) throws Exception{
		Member member;
		if((member=memberRepository.findByMemberId(memberId))==null)
			throw new RuntimeException("not found user");
		if(member.getMemberPw()==null||!member.getMemberPw().equalsIgnoreCase( sha256(memberPw)))
			throw new RuntimeException("not match password");
		
		return member;
	}
	
	// 단방향 해시 암호화
	private String sha256(String msg) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(msg.getBytes());
        
        return new java.math.BigInteger(md.digest()).toString(16);
    }


}
