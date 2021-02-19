package entity;

import javax.persistence.*;

import lombok.*;


@Entity
@Table(name="member")
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
	private String memberMil;
	
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
	private String memberLevel;

	
	public String getMemberId() {
		return memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getMemberMil() {
		return memberMil;
	}

	public String getMemberBirth() {
		return memberBirth;
	}

	public String getMemberHigh() {
		return memberHigh;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public String getMemberLevel() {
		return memberLevel;
	}
	
	
	
}
