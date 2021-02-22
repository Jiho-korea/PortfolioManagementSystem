/*
========================================================================
파    일    명 : ProjectListServiceImpl.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.22
작  성  내  용 : projectRepository의 findProjectByMemberId메서드를 이용하는 서비스
========================================================================
*/
package service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.Project;
import repository.ProjectRepository;
import service.ProjectListService;

@Service("projectListService")
@Transactional
public class ProjectListServiceImpl implements ProjectListService {

	@Autowired
	ProjectRepository projectRepository;

	@Override
	public List<Project> listProject(String memberId) throws Exception {
		List<Project> projects;

		projects = projectRepository.findProjectByMemberId(memberId);
		if (projects == null) {
			projects = new ArrayList<Project>();
		}

		return projects;
	}

}
