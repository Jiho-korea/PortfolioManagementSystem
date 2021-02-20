/*
========================================================================
파    일    명 : KeyGenerator.java
========================================================================
작    성    자 : 박민환
작    성    일 : 2021.02.20
작  성  내  용 : 키생성, 복호화 서비스 객체 인터페이스
========================================================================
*/
package service;

import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface KeyGenerator {

	// 비대칭 키 생성
	public void generate(final HttpServletRequest request, final HttpSession session)
			throws NoSuchAlgorithmException, InvalidKeySpecException;

	// 복호화
	public String decryptRsa(PrivateKey privateKey, String securedValue) throws Exception;
}
