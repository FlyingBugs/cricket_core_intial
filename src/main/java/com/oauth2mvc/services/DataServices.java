package com.oauth2mvc.services;

import java.util.List;

import com.oauth2mvc.model.Employee;
import com.oauth2mvc.model.MatchSchedule;

public interface DataServices {
	public boolean addEntity(Employee employee) throws Exception;
	public Employee getEntityById(long id) throws Exception;
	public List<Employee> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
	public List<MatchSchedule> returnAllMatchSchedule() throws Exception;
}
