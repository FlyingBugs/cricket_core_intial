package com.oauth2mvc.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oauth2mvc.model.Employee;
import com.oauth2mvc.util.ServiceTemplate;

@RequestMapping("/mycontroller")
@RestController
public class MyRestController {

	static final Logger logger = Logger.getLogger(MyRestController.class);

	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ServiceTemplate> createNewEntry(
			@RequestBody Employee employee) {

		ServiceTemplate serviceTemplate = new ServiceTemplate(null, null, null, 1l);
		System.out.println("temp");
		
		return new ResponseEntity<ServiceTemplate>(serviceTemplate, HttpStatus.CREATED);
	}

}
