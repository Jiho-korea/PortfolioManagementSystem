/*
========================================================================
파    일    명 : GetHighScoreServiceImpl.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.03.10
작  성  내  용 : HighRepository의 findHighByMemberId메서드를 이용하는 서비스
========================================================================
*/
package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.High;
import repository.HighRepository;
import service.GetHighScoreService;

@Service("getHighScoreService")
@Transactional
public class GetHighScoreServiceImpl implements GetHighScoreService {

	@Autowired
	private HighRepository highRepository;

	@Override
	public High getHighScore(String memberId) throws Exception {
		High high;

		high = highRepository.findHighByMemberId(memberId);
		if (high == null) {
			high = new High();
		}

		return high;
	}

}
