/*
========================================================================
파    일    명 : Certificate.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.26
작  성  내  용 : certificate 테이블 엔티티 객체
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
@Table(name = "certificate")
@Setter
@Getter
public class Certificate {

	@Id
	@Column(name = "certificate_number")
	private Integer certificateNumber;

	@Column(name = "member_id")
	private String memberId;

	@Column(name = "certificate_name")
	private String certificateName;

	public Certificate(Integer certificateNumber, String memberId, String certificateName) {
		super();
		this.certificateNumber = certificateNumber;
		this.memberId = memberId;
		this.certificateName = certificateName;
	}

	public Certificate() {
		super();
	}

	public Integer getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(Integer certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

}
