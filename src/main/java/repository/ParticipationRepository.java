/*
========================================================================
파    일    명 : ParticipationRepository.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.03.02
작  성  내  용 : Participation 테이블 가져오는 Repository객체
========================================================================
*/
package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Participation;

@Repository
public interface ParticipationRepository extends JpaRepository<Participation, String> {
	public List<Participation> findParticipationByMemberId(String memberId);
}
