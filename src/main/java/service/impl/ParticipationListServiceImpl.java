/*
========================================================================
파    일    명 : ParticipationListServiceImpl.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.03.02
작  성  내  용 : ParticipationRepository의 findParticipationByMemberId메서드를 이용하는 서비스
========================================================================
*/
package service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.Participation;
import repository.ParticipationRepository;
import service.ParticipationListService;

@Service("participationListService")
@Transactional
public class ParticipationListServiceImpl implements ParticipationListService {

	@Autowired
	private ParticipationRepository participationRepository;

	@Override
	public List<Participation> listParticipation(String memberId) throws Exception {
		List<Participation> participations;

		participations = participationRepository.findParticipationByMemberId(memberId);
		if (participations == null) {
			participations = new ArrayList<Participation>();
		}

		return participations;
	}

}
