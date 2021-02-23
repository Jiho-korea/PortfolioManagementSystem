/*
========================================================================
파    일    명 : MemberInfo.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.19
작  성  내  용 : 세션에 담길 로그인 정보, 비밀번호를 제외한 멤버정보
========================================================================
*/
package vo;

public class MemberInfo {

	private String memberId;
	private String memberName;
	private Integer memberMil;
	private String memberBirth;
	private String memberHigh;
	private String memberAddress;
	private String memberPhone;
	private String memberEmail;
	private String memberLevelCode;
	private Integer memberGrade;

	public MemberInfo(String memberId, String memberName, Integer memberMil, String memberBirth, String memberHigh,
			String memberAddress, String memberPhone, String memberEmail, String memberLevelCode, Integer memberGrade) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberMil = memberMil;
		this.memberBirth = memberBirth;
		this.memberHigh = memberHigh;
		this.memberAddress = memberAddress;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.memberLevelCode = memberLevelCode;
		this.memberGrade = memberGrade;
	}

	public MemberInfo() {
		super();
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

	public Integer getMemberMil() {
		return memberMil;
	}

	public void setMemberMil(Integer memberMil) {
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

	public String getMemberLevelCode() {
		return memberLevelCode;
	}

	public void setMemberLevelCode(String memberLevelCode) {
		this.memberLevelCode = memberLevelCode;
	}

	public Integer getMemberGrade() {
		return memberGrade;
	}

	public void setMemberGrade(Integer memberGrade) {
		this.memberGrade = memberGrade;
	}

}