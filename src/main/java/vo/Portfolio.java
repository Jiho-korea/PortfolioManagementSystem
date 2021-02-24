/*
========================================================================
파    일    명 : Portfolio.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.22
작  성  내  용 : 포트폴리오에 띄울 정보를 가지고 있는 VO
========================================================================
*/
package vo;

import java.util.List;

import entity.Project;

public class Portfolio {
	private MemberInfo memberInfo;
	private List<Project> projects;

	public Portfolio(MemberInfo memberInfo, List<Project> projects) {
		super();
		this.memberInfo = memberInfo;
		this.projects = projects;
	}

	public Portfolio() {
		super();
	}

	public MemberInfo getMemberInfo() {
		return memberInfo;
	}

	public void setMemberInfo(MemberInfo memberInfo) {
		this.memberInfo = memberInfo;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
