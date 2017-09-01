package com.oauth2mvc.services.fixtures;

import java.util.List;

import com.oauth2mvc.dto.FixturesClientDto;

/**
 * 
 * @author Prashant
 *
 */
public interface FixturesService {

	List<FixturesClientDto> returnAllMatchSchedule() throws Exception;
	
}
