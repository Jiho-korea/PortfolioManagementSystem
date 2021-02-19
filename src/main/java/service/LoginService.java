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
	
	public void login(String id, String password) throws Exception{
		Member member;
		if((member=memberRepository.findById(id))==null)
			throw new RuntimeException("not found user");
		if(member.getPassword()==null||!member.getPassword().equalsIgnoreCase( sha256(password)))
			throw new RuntimeException("not match password");

	}
	
	// 단방향 해시 암호화
	private String sha256(String msg) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(msg.getBytes());
        
        return new java.math.BigInteger(md.digest()).toString(16);
    }


}
