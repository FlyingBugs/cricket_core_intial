package com.oauth2mvc.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Prashant
 *
 */
public class ContestClientExposedObjectDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7488184539836396975L;

	
	public ContestClientExposedObjectDto() {
		super();
	}

	private Long matchId;
	
	private Date matchCloseTime;
	
	private String firstContestant;
	
	private String secondContestant;
	
	List<ContestClientDto> listOfContest;
	
	//////////////////////////////////////////////////////////////
	/////////////GETTERS AND SETTERS//////////////////////////////
	//////////////////////////////////////////////////////////////

	public Long getMatchId() {
		return matchId;
	}

	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}

	public Date getMatchCloseTime() {
		return matchCloseTime;
	}

	public void setMatchCloseTime(Date matchCloseTime) {
		this.matchCloseTime = matchCloseTime;
	}

	public String getFirstContestant() {
		return firstContestant;
	}

	public void setFirstContestant(String firstContestant) {
		this.firstContestant = firstContestant;
	}

	public String getSecondContestant() {
		return secondContestant;
	}

	public void setSecondContestant(String secondContestant) {
		this.secondContestant = secondContestant;
	}

	public List<ContestClientDto> getListOfContest() {
		return listOfContest;
	}

	public void setListOfContest(List<ContestClientDto> listOfContest) {
		this.listOfContest = listOfContest;
	}
	
}
