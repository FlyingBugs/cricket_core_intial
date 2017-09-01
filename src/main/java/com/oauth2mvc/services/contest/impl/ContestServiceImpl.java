package com.oauth2mvc.services.contest.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.oauth2mvc.dto.ContestClientExposedObjectDto;
import com.oauth2mvc.services.contest.ContestService;

/**
 * 
 * @author Prashant
 *
 */
@Service
public class ContestServiceImpl implements ContestService{
	
	static final Logger LOGGER = Logger.getLogger(ContestServiceImpl.class);

	@Override
	public List<ContestClientExposedObjectDto> getAllContestForAMatch(Long userId, Long matchId) {
		
		LOGGER.info("inside getAllContestForAMatch");
		System.out.println("inside getAllContestForAMatch");
		
		return null;
	}

}
