package com.oauth2mvc.dao.fixturesdao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oauth2mvc.dao.fixturesdao.FixturesDao;
import com.oauth2mvc.model.MatchSchedule;

@Component
public class FixturesdaoImpl implements FixturesDao{

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MatchSchedule> returnAllMatchSchedule() throws Exception{
		
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		
		List<MatchSchedule> result = new ArrayList<MatchSchedule>();
		result = session.createCriteria(MatchSchedule.class).list();
		
		tx.commit();
		session.close();
		return result;
		
	}

}
