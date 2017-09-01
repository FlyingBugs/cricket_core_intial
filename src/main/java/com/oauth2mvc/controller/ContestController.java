package com.oauth2mvc.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oauth2mvc.dto.ContestClientExposedObjectDto;
import com.oauth2mvc.services.contest.ContestService;
import com.oauth2mvc.util.Constants;
import com.oauth2mvc.util.ServiceTemplate;

/**
 * 
 * @author Prashant
 *
 */
@RestController
@RequestMapping("/restapi/contest")
public class ContestController {

	
	static final Logger LOGGER = Logger.getLogger(ContestController.class);
	
	@Autowired
	ContestService contestService;
	
	@RequestMapping(value = "/getAllContestForAMatch/{userId}/{matchId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ServiceTemplate> getAllContestForAMatch(@PathVariable Long userId, @PathVariable Long matchId){
		
		ServiceTemplate serviceTemplate = null;
		List<ContestClientExposedObjectDto> result = null;
		
		try{
			result = contestService.getAllContestForAMatch(userId, matchId);
			serviceTemplate = new ServiceTemplate(Constants.TYPE_SUCCESS, result, Constants.STATUS_SUCCESS, 1l);
		} catch(Exception e){
			serviceTemplate = new ServiceTemplate(Constants.TYPE_FAILURE, e.getMessage(), Constants.STATUS_FAILURE, 0l);
			LOGGER.info("Exception in getAllContestForAMatch of ContestController : ",e);
		}
		
		
		return new ResponseEntity<ServiceTemplate>(serviceTemplate, HttpStatus.OK);
	}
	
}
