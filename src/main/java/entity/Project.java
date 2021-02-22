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
	private int projectNumber;

	@Column(name = "member_id")
	private String memberId;

	@Column(name = "project_name")
	private String projectName;

	@Column(name = "project_grade")
	private int projectGrade;

	public int getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(int projectNumber) {
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

	public int getProjectGrade() {
		return projectGrade;
	}

	public void setProjectGrade(int projectGrade) {
		this.projectGrade = projectGrade;
	}

	public Project(int projectNumber, String memberId, String projectName, int projectGrade) {
		super();
		this.projectNumber = projectNumber;
		this.memberId = memberId;
		this.projectName = projectName;
		this.projectGrade = projectGrade;
	}

	public Project() {
		super();
	}

}
