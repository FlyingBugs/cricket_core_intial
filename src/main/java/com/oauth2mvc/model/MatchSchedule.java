package com.oauth2mvc.model;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "match_schedule")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MatchSchedule extends CreateAndUpdateEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public MatchSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "status")
	private Short status;

	@Column(name = "related_name")
	private String relatedName;

	@Column(name = "name")
	private String name;

	@Column(name = "short_name")
	private String shortName;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "season")
	private String season;
	
	@Column(name = "format")
	private String format;
	
	@Column(name = "venue")
	private String venue;
	
	@Column(name = "first_contestent")
	private Long firstContestent;
	
	@Column(name = "second_contestent")
	private Long secondContestent;
	
	@Column(name = "winner_team")
	private Long winnerTeam;
	
	@Column(name = "match_start_time")
	private Date matchStartTime;
	
	
	//////////////////////////////////////////////////////////////
	/////////////GETTERS AND SETTERS//////////////////////////////
	//////////////////////////////////////////////////////////////
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getRelatedName() {
		return relatedName;
	}

	public void setRelatedName(String relatedName) {
		this.relatedName = relatedName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Long getFirstContestent() {
		return firstContestent;
	}

	public void setFirstContestent(Long firstContestent) {
		this.firstContestent = firstContestent;
	}

	public Long getSecondContestent() {
		return secondContestent;
	}

	public void setSecondContestent(Long secondContestent) {
		this.secondContestent = secondContestent;
	}

	public Long getWinnerTeam() {
		return winnerTeam;
	}

	public void setWinnerTeam(Long winnerTeam) {
		this.winnerTeam = winnerTeam;
	}

	public Date getMatchStartTime() {
		return matchStartTime;
	}

	public void setMatchStartTime(Date matchStartTime) {
		this.matchStartTime = matchStartTime;
	}



}
