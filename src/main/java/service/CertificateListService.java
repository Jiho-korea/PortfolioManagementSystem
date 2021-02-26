/*
========================================================================
파    일    명 : CertificateListService.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.26
작  성  내  용 : memberId를 통해 학생의 자격증 리스트를 검색하는 메서드 선언 인터페이스
========================================================================
*/
package service;

import java.util.List;

import entity.Certificate;

public interface CertificateListService {
	public List<Certificate> listCertificate(String memberId) throws Exception;
}
