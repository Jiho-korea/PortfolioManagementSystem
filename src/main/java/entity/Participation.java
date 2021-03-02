/*
========================================================================
파    일    명 : Participation.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.03.02
작  성  내  용 : participation 테이블 엔티티 객체
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
@Table(name = "participation")
@Setter
@Getter
public class Participation {

	@Id
	@Column(name = "participation_number")
	private Integer participationNumber;

	@Column(name = "member_id")
	private String memberId;

	@Column(name = "participation_name")
	private String participationName;

	public Participation(Integer participationNumber, String memberId, String participationName) {
		super();
		this.participationNumber = participationNumber;
		this.memberId = memberId;
		this.participationName = participationName;
	}

	public Participation() {
		super();
	}

	public Integer getParticipationNumber() {
		return participationNumber;
	}

	public void setParticipationNumber(Integer participationNumber) {
		this.participationNumber = participationNumber;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getParticipationName() {
		return participationName;
	}

	public void setParticipationName(String participationName) {
		this.participationName = participationName;
	}

}
