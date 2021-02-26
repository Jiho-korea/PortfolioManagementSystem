/*
========================================================================
파    일    명 : CertificateListServiceImpl.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.26
작  성  내  용 : certificateRepository의 findCertificateByMemberId메서드를 이용하는 서비스
========================================================================
*/
package service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.Certificate;
import repository.CertificateRepository;
import service.CertificateListService;

@Service("certificateListService")
@Transactional
public class CertificateListServiceImpl implements CertificateListService {

	@Autowired
	private CertificateRepository certificateRepository;

	@Override
	public List<Certificate> listCertificate(String memberId) throws Exception {
		List<Certificate> certificates;

		certificates = certificateRepository.findCertificateByMemberId(memberId);
		if (certificates == null) {
			certificates = new ArrayList<Certificate>();
		}

		return certificates;
	}

}
