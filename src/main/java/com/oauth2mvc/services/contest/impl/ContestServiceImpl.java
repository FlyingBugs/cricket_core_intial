package com.oauth2mvc.services.contest.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oauth2mvc.dao.contestdao.ContestDao;
import com.oauth2mvc.dto.ContestClientDto;
import com.oauth2mvc.dto.ContestClientExposedObjectDto;
import com.oauth2mvc.model.Contest;
import com.oauth2mvc.services.contest.ContestService;

/**
 * 
 * @author Prashant
 *
 */
@Service
public class ContestServiceImpl implements ContestService{
	
	static final Logger LOGGER = Logger.getLogger(ContestServiceImpl.class);
	
	@Autowired
	ContestDao contestDao;

	@Override
	public List<ContestClientExposedObjectDto> getAllContestForAMatch(Long userId, Long matchId) throws Exception {
		
		List<Contest> contestList = null;
		List<ContestClientDto> contestListClient = null;
		
		try{
			contestList = contestDao.getAllContestForAMatch(matchId);
		}catch(Exception e){
			LOGGER.error("Found error inside contestDao.getAllContestForAMatch : ",e);
		}
		
		if(contestList == null || contestList.isEmpty()){
			
		}
		
		
		
		return null;
	}

}
