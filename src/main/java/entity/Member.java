/*
========================================================================
파    일    명 : Member.java
========================================================================
작    성    자 : 박민환
작    성    일 : 2021.02.19
작  성  내  용 : member 테이블 엔티티 객체
========================================================================
*/
package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "member")
@Setter
@Getter
public class Member {

	@Id
	@Column(name = "member_id")
	private String memberId;

	@Column(name = "member_pw")
	private String memberPw;

	@Column(name = "member_name")
	private String memberName;

	@Column(name = "member_mil")
	private Integer memberMil;

	@Column(name = "member_birth")
	private String memberBirth;

	@Column(name = "member_high")
	private String memberHigh;

	@Column(name = "member_address")
	private String memberAddress;

	@Column(name = "member_phone")
	private String memberPhone;

	@Column(name = "member_email")
	private String memberEmail;

	@Column(name = "member_level_code")
	private String memberLevelCode;

	@Column(name = "member_grade")
	private Integer memberGrade;

	public Member(String memberId, String memberPw, String memberName, Integer memberMil, String memberBirth,
			String memberHigh, String memberAddress, String memberPhone, String memberEmail, String memberLevelCode,
			Integer memberGrade) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
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

	public Member() {
		super();
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
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
