/*
========================================================================
파    일    명 : VoluntaryListServiceImpl.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.28
작  성  내  용 : voluntaryRepository의 findVoluntaryByMemberId메서드를 이용하는 서비스
========================================================================
*/
package service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.Voluntary;
import repository.VoluntaryRepository;
import service.VoluntaryListService;

@Service("voluntaryListService")
@Transactional
public class VoluntaryListServiceImpl implements VoluntaryListService {

	@Autowired
	private VoluntaryRepository voluntaryRepository;

	@Override
	public List<Voluntary> listVoluntary(String memberId) throws Exception {
		List<Voluntary> voluntaries;

		voluntaries = voluntaryRepository.findVoluntaryByMemberId(memberId);
		if (voluntaries == null) {
			voluntaries = new ArrayList<Voluntary>();
		}

		return voluntaries;
	}

}
