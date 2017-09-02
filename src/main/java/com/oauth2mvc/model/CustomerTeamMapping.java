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


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}


	public String getTeamId() {
		return teamId;
	}


	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	
	@Override
	public String toString() {
		return "CustomerTeamMapping [id=" + id + ", customerId=" + customerId + ", teamId=" + teamId + "]";
	}

}
