package com.oauth2mvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 
 * @author Prashant Sharma
 *
 */
@Entity
@Table(name = "customer_team_mapping")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CustomerTeamMapping extends CreateAndUpdateEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public CustomerTeamMapping() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "customer_id")
	private Long customerId;

	@Column(name = "team_id")
	private String teamId;

	//////////////////////////////////////////////////////////////
	/////////////GETTERS AND SETTERS//////////////////////////////
	//////////////////////////////////////////////////////////////


}
