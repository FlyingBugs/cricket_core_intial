package com.oauth2mvc.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Prashant
 *
 */
public class FixturesClientDto implements Serializable {
	
	public FixturesClientDto() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String season;
	
	private Long id;
	
	private String team1;
	
	private String team2;
	
	private String status;
	
	private Date matchStartTime;
	
	private String team1Image;
	
	private String team2Image;
	
	private boolean isUserActiveForMatch;

	//////////////////////////////////////////////////////////////
	/////////////GETTERS AND SETTERS//////////////////////////////
	//////////////////////////////////////////////////////////////
	
	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getMatchStartTime() {
		return matchStartTime;
	}

	public void setMatchStartTime(Date matchStartTime) {
		this.matchStartTime = matchStartTime;
	}

	public String getTeam1Image() {
		return team1Image;
	}

	public void setTeam1Image(String team1Image) {
		this.team1Image = team1Image;
	}

	public String getTeam2Image() {
		return team2Image;
	}

	public void setTeam2Image(String team2Image) {
		this.team2Image = team2Image;
	}

	public boolean isUserActiveForMatch() {
		return isUserActiveForMatch;
	}

	public void setUserActiveForMatch(boolean isUserActiveForMatch) {
		this.isUserActiveForMatch = isUserActiveForMatch;
	}

	@Override
	public String toString() {
		return "FixturesClientDto [season=" + season + ", id=" + id + ", team1=" + team1 + ", team2=" + team2
				+ ", status=" + status + ", matchStartTime=" + matchStartTime + ", team1Image=" + team1Image
				+ ", team2Image=" + team2Image + ", isUserActiveForMatch=" + isUserActiveForMatch + "]";
	}
	

	

}
