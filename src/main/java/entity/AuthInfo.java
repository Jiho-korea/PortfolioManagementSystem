/*
========================================================================
파    일    명 : AuthInfo.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.19
작  성  내  용 : 세션에 담길 로그인 정보
========================================================================
*/
package entity;

public class AuthInfo {

	private String memberId;
	private String memberName;
	private String memberMil;
	private String memberBirth;
	private String memberHigh;
	private String memberAddress;
	private String memberPhone;
	private String memberEmail;
	private String memberLevel;

	public AuthInfo(String memberId, String memberName, String memberMil, String memberBirth, String memberHigh,
			String memberAddress, String memberPhone, String memberEmail, String memberLevel) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberMil = memberMil;
		this.memberBirth = memberBirth;
		this.memberHigh = memberHigh;
		this.memberAddress = memberAddress;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.memberLevel = memberLevel;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberMil() {
		return memberMil;
	}

	public void setMemberMil(String memberMil) {
		this.memberMil = memberMil;
	}

	public String getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}

	public String getMemberHigh() {
		return memberHigh;
	}

	public void setMemberHigh(String memberHigh) {
		this.memberHigh = memberHigh;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

}