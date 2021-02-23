/*
========================================================================
파    일    명 : Project.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.24
작  성  내  용 : project 테이블 엔티티 객체
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
@Table(name = "project")
@Setter
@Getter
public class Project {

	@Id
	@Column(name = "project_number")
	private Integer projectNumber;

	@Column(name = "member_id")
	private String memberId;

	@Column(name = "project_name")
	private String projectName;

	@Column(name = "project_grade")
	private Integer projectGrade;

	public Project(Integer projectNumber, String memberId, String projectName, Integer projectGrade) {
		super();
		this.projectNumber = projectNumber;
		this.memberId = memberId;
		this.projectName = projectName;
		this.projectGrade = projectGrade;
	}

	public Project() {
		super();
	}

	public Integer getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(Integer projectNumber) {
		this.projectNumber = projectNumber;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Integer getProjectGrade() {
		return projectGrade;
	}

	public void setProjectGrade(Integer projectGrade) {
		this.projectGrade = projectGrade;
	}

}
