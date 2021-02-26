/*
========================================================================
파    일    명 : CertificateRepository.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.26
작  성  내  용 : Certificate 테이블 가져오는 Repository객체
========================================================================
*/
package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Certificate;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, String> {
	public List<Certificate> findCertificateByMemberId(String memberId);
}
