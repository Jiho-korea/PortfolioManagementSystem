package service;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;

import javax.crypto.Cipher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

@Service
public class KeyGenerator {
	
	// 비대칭 키 생성
	public void generate(final HttpServletRequest request, final HttpSession session) throws NoSuchAlgorithmException, InvalidKeySpecException {
		KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");

		generator.initialize(2048);

		KeyPair keyPair = generator.genKeyPair();
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");


		PublicKey publicKey = keyPair.getPublic();
		PrivateKey privateKey = keyPair.getPrivate();


		// private key -> session
		session.setAttribute("_RSA_PRIVATE_Key_", privateKey);


		RSAPublicKeySpec publicSpec = keyFactory.getKeySpec(publicKey, RSAPublicKeySpec.class);
		String publicKeyModulus = publicSpec.getModulus().toString(16);
		String publicKeyExponent = publicSpec.getPublicExponent().toString(16);
		
		// public key -> request
		request.setAttribute("publicKeyModulus", publicKeyModulus);
		request.setAttribute("publicKeyExponent", publicKeyExponent);
	}
	
	// 복호화
	public String decryptRsa(PrivateKey privateKey, String securedValue) throws Exception {
        
        Cipher cipher = Cipher.getInstance("RSA");
        byte[] encryptedBytes = new java.math.BigInteger(securedValue, 16).toByteArray();
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        String decryptedValue = new String(decryptedBytes, "utf-8"); 
        
        System.out.println(decryptedValue);
        return decryptedValue;
    }
	

}
