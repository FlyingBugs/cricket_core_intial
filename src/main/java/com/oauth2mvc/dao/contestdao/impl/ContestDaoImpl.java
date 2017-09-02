package com.oauth2mvc.dao.contestdao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oauth2mvc.dao.contestdao.ContestDao;

@Component
public class ContestDaoImpl implements ContestDao{

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;
	
	
	@Override
	public List<Object[]> getAllContestForAMatch(Long matchId) throws Exception {
	
		String query = "select cont.id as id, cont.name as name, cont.totalWinningAmount as totalWinningAmount,  "
					+ "count(*) as totalNoOfCurrentParticipents, cont.maxContestent as maxContestent, "
					+ "cont.maxWinnerCount as maxWinnerCount, cont.contestType as contestType, "
					+ "cont.entryFees as entryFees from Contest as cont, ContestTeamMapping as ctm "
					+ "where cont.matchId = :matchId and cont.id = ctm.contestId group by cont.id";
		
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		
		List<Object[]> ContestListAndCount = (List<Object[]>) session.createQuery(query).setLong("matchId", matchId).list();
		
		return ContestListAndCount;
	}

}
