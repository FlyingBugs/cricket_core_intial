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
@Table(name = "contest_team_mapping")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ContestTeamMapping extends CreateAndUpdateEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public ContestTeamMapping() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name="contest_id")
	private Long contestId;
	
	@Column(name="team_id")
	private Long teamId;

	//////////////////////////////////////////////////////////////
	/////////////GETTERS AND SETTERS//////////////////////////////
	//////////////////////////////////////////////////////////////
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getContestId() {
		return contestId;
	}

	public void setContestId(Long contestId) {
		this.contestId = contestId;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	@Override
	public String toString() {
		return "ContestTeamMapping [id=" + id + ", contestId=" + contestId + ", teamId=" + teamId + "]";
	}

}
