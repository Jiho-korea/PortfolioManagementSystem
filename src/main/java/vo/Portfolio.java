/*
========================================================================
파    일    명 : Portfolio.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.22
작  성  내  용 : 포트폴리오에 띄울 정보를 가지고 있는 VO
========================================================================
수    정    자 : 강지호
수    정    일 : 2021.02.24
수  정  내  용 : memberInfo 프로퍼티 추가
========================================================================
수    정    자 : 강지호
수    정    일 : 2021.02.26
수  정  내  용 : certificates 프로퍼티 추가
========================================================================
수    정    자 : 강지호
수    정    일 : 2021.02.26
수  정  내  용 : voluntaries 프로퍼티 추가
========================================================================
수    정    자 : 강지호
수    정    일 : 2021.03.02
수  정  내  용 : participations 프로퍼티 추가
========================================================================
수    정    자 : 강지호
수    정    일 : 2021.03.10
수  정  내  용 : high 프로퍼티 추가
========================================================================
*/
package vo;

import java.util.List;

import entity.Certificate;
import entity.High;
import entity.Participation;
import entity.Project;
import entity.Voluntary;

public class Portfolio {
	private MemberInfo memberInfo;
	private List<Certificate> certificates;
	private List<Project> projects;
	private List<Voluntary> voluntaries;
	private List<Participation> participations;
	private High high;

	public Portfolio() {
		super();
	}

	public Portfolio(MemberInfo memberInfo, List<Certificate> certificates, List<Project> projects,
			List<Voluntary> voluntaries, List<Participation> participations, High high) {
		super();
		this.memberInfo = memberInfo;
		this.certificates = certificates;
		this.projects = projects;
		this.voluntaries = voluntaries;
		this.participations = participations;
		this.high = high;
	}

	public MemberInfo getMemberInfo() {
		return memberInfo;
	}

	public void setMemberInfo(MemberInfo memberInfo) {
		this.memberInfo = memberInfo;
	}

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Voluntary> getVoluntaries() {
		return voluntaries;
	}

	public void setVoluntaries(List<Voluntary> voluntaries) {
		this.voluntaries = voluntaries;
	}

	public List<Participation> getParticipations() {
		return participations;
	}

	public void setParticipations(List<Participation> participations) {
		this.participations = participations;
	}

	public High getHigh() {
		return high;
	}

	public void setHigh(High high) {
		this.high = high;
	}
}
