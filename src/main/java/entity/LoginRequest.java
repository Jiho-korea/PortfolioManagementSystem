/*
========================================================================
파    일    명 : LoginRequest.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.20
작  성  내  용 : 사용자로부터 입력받은 Login정보
========================================================================
*/
package entity;

import org.hibernate.validator.constraints.NotBlank;

public class LoginRequest {

	@NotBlank
	private String username;

	@NotBlank
	private String password;

	@NotBlank
	private String securedid;

	@NotBlank
	private String securedpassword;

	public LoginRequest(String username, String password, String securedid, String securedpassword) {
		super();
		this.username = username;
		this.password = password;
		this.securedid = securedid;
		this.securedpassword = securedpassword;
	}

	public LoginRequest() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecuredid() {
		return securedid;
	}

	public void setSecuredid(String securedid) {
		this.securedid = securedid;
	}

	public String getSecuredpassword() {
		return securedpassword;
	}

	public void setSecuredpassword(String securedpassword) {
		this.securedpassword = securedpassword;
	}

}
