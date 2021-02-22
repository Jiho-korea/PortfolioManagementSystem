/*
========================================================================
파    일    명 : ProjectRepository.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.22
작  성  내  용 : project 테이블 가져오는 Repository객체
========================================================================
*/
package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {
	public List<Project> findProjectByMemberId(String memberId);
}
