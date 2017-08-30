package com.oauth2mvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.oauth2mvc.dao.DataDao;
import com.oauth2mvc.model.Employee;
import com.oauth2mvc.model.MatchSchedule;

public class DataServicesImpl implements DataServices {

	@Autowired
	DataDao dataDao;
	
	@Override
	public boolean addEntity(Employee employee) throws Exception {
		return dataDao.addEntity(employee);
	}

	@Override
	public Employee getEntityById(long id) throws Exception {
		return dataDao.getEntityById(id);
	}

	@Override
	public List<Employee> getEntityList() throws Exception {
		return dataDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return dataDao.deleteEntity(id);
	}

	@Override
	public List<MatchSchedule> returnAllMatchSchedule() throws Exception {
		// TODO Auto-generated method stub
		return dataDao.returnAllMatchSchedule();
	}

}
