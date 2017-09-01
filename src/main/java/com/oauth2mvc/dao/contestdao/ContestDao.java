package com.oauth2mvc.dao.contestdao;

import java.util.List;

import com.oauth2mvc.model.Contest;

/**
 * 
 * @author Prashant
 *
 */
public interface ContestDao {

	List<Contest> getAllContestForAMatch(Long matchId) throws Exception;
	
}
