package com.oauth2mvc.services.contest;

import java.util.List;

import com.oauth2mvc.dto.ContestClientExposedObjectDto;

/**
 * 
 * @author Prashant
 *
 */
public interface ContestService {

	List<ContestClientExposedObjectDto> getAllContestForAMatch(Long userId, Long matchId) throws Exception;
	
}
