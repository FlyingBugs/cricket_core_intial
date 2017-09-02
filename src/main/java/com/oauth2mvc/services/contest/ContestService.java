package com.oauth2mvc.services.contest;


import com.oauth2mvc.dto.ContestClientExposedObjectDto;

/**
 * 
 * @author Prashant
 *
 */
public interface ContestService {

	ContestClientExposedObjectDto getAllContestForAMatch(Long userId, Long matchId) throws Exception;
	
}
