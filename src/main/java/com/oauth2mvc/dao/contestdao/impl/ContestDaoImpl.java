package com.oauth2mvc.dao.contestdao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.oauth2mvc.dao.contestdao.ContestDao;
import com.oauth2mvc.model.Contest;

@Component
public class ContestDaoImpl implements ContestDao{

	@Override
	public List<Contest> getAllContestForAMatch(Long matchId) throws Exception {
		
		return null;
	}

}
