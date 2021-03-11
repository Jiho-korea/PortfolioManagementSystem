/*
========================================================================
파    일    명 : High.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.03.10
작  성  내  용 : high 테이블 엔티티 객체
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
@Table(name = "high")
@Setter
@Getter
public class High {

	@Id
	@Column(name = "member_id")
	private String memberId;

	@Column(name = "high_score")
	private Float highScore;

	public High() {
		super();
	}

	public High(String memberId, Float highScore) {
		super();
		this.memberId = memberId;
		this.highScore = highScore;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public Float getHighScore() {
		return highScore;
	}

	public void setHighScore(Float highScore) {
		this.highScore = highScore;
	}

}
