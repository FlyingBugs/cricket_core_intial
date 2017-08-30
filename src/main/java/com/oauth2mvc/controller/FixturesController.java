package com.oauth2mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oauth2mvc.dto.FixturesClientDto;
import com.oauth2mvc.model.MatchSchedule;
import com.oauth2mvc.services.DataServices;
import com.oauth2mvc.services.fixtures.FixturesService;
import com.oauth2mvc.util.Constants;
import com.oauth2mvc.util.ServiceTemplate;

@RestController
@RequestMapping("/restapi/fixtures")
public class FixturesController {
	
/*	@Autowired
	DataServices dataServices;*/
	
	@Autowired
	FixturesService fixturesService;
	
	@RequestMapping(value = "/getAllScheduledMatches/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ServiceTemplate> getAllScheduledMatches(@PathVariable Long userId){
		
		List<FixturesClientDto> result = null;
		ServiceTemplate serviceTemplate = null;
		try {
			result = fixturesService.returnAllMatchSchedule();
			serviceTemplate = new ServiceTemplate(Constants.TYPE_SUCCESS, result, Constants.STATUS_SUCCESS, 1l);
		} catch (Exception e) {
			serviceTemplate = new ServiceTemplate(Constants.TYPE_FAILURE, e.getMessage(), Constants.STATUS_FAILURE, 0l);
			e.printStackTrace();
		}
		
		return new ResponseEntity<ServiceTemplate>(serviceTemplate, HttpStatus.OK);
	}

}
