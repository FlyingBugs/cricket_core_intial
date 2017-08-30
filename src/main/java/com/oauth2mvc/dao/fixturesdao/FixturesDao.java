package com.oauth2mvc.dao.fixturesdao;

import java.util.List;

import com.oauth2mvc.model.MatchSchedule;


/**
 * 
 * @author Prashant
 *
 */
public interface FixturesDao {
	
	public List<MatchSchedule> returnAllMatchSchedule() throws Exception;

}
