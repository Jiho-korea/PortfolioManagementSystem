/*
========================================================================
파    일    명 : HighRepository.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.03.10
작  성  내  용 : high 테이블 가져오는 Repository객체
========================================================================
*/
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.High;

@Repository
public interface HighRepository extends JpaRepository<High, String> {
	public High findHighByMemberId(String memberId);
}
