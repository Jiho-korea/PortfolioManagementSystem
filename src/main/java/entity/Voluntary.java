/*
========================================================================
파    일    명 : Voluntary.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.28
작  성  내  용 : voluntary 테이블 엔티티 객체
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
@Table(name = "voluntary")
@Setter
@Getter
public class Voluntary {

	@Id
	@Column(name = "voluntary_number")
	private Integer voluntaryNumber;

	@Column(name = "member_id")
	private String memberId;

	@Column(name = "voluntary_name")
	private String voluntaryName;

	public Voluntary(Integer voluntaryNumber, String memberId, String voluntaryName) {
		super();
		this.voluntaryNumber = voluntaryNumber;
		this.memberId = memberId;
		this.voluntaryName = voluntaryName;
	}

	public Voluntary() {
		super();
	}

	public Integer getVoluntaryNumber() {
		return voluntaryNumber;
	}

	public void setVoluntaryNumber(Integer voluntaryNumber) {
		this.voluntaryNumber = voluntaryNumber;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getVoluntaryName() {
		return voluntaryName;
	}

	public void setVoluntaryName(String voluntaryName) {
		this.voluntaryName = voluntaryName;
	}

}
