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
@Table(name = "team_detail")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TeamDetail extends CreateAndUpdateEntity{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2658462268161832868L;

	public TeamDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "team_key")
	private String teamKey;

	//////////////////////////////////////////////////////////////
	/////////////GETTERS AND SETTERS//////////////////////////////
	//////////////////////////////////////////////////////////////
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamKey() {
		return teamKey;
	}

	public void setTeamKey(String teamKey) {
		this.teamKey = teamKey;
	}
	


}
