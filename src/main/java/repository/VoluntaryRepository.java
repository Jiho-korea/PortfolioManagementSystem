/*
========================================================================
파    일    명 : VoluntaryRepository.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.28
작  성  내  용 : Voluntary 테이블 가져오는 Repository객체
========================================================================
*/
package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Voluntary;

@Repository
public interface VoluntaryRepository extends JpaRepository<Voluntary, String> {
	public List<Voluntary> findVoluntaryByMemberId(String memberId);
}
