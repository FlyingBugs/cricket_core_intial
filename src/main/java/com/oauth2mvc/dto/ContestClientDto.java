package com.oauth2mvc.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @author Prashant
 *
 */
public class ContestClientDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3391999690653219945L;

	public ContestClientDto() {
		super();
	}
	
	private Long id;
	
	private String name;
	
	private BigDecimal totalWinningAmount;
	
	private Integer maxWinnerCount;
	
	private BigDecimal entryFees;
	
	private Integer maxContestent;
	
	private short contestType;
	
	private Integer totalNoOfCurrentParticipents;
	
	//////////////////////////////////////////////////////////////
	/////////////GETTERS AND SETTERS//////////////////////////////
	//////////////////////////////////////////////////////////////

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getTotalWinningAmount() {
		return totalWinningAmount;
	}

	public void setTotalWinningAmount(BigDecimal totalWinningAmount) {
		this.totalWinningAmount = totalWinningAmount;
	}

	public Integer getMaxWinnerCount() {
		return maxWinnerCount;
	}

	public void setMaxWinnerCount(Integer maxWinnerCount) {
		this.maxWinnerCount = maxWinnerCount;
	}

	public BigDecimal getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(BigDecimal entryFees) {
		this.entryFees = entryFees;
	}

	public Integer getMaxContestent() {
		return maxContestent;
	}

	public void setMaxContestent(Integer maxContestent) {
		this.maxContestent = maxContestent;
	}

	public short getContestType() {
		return contestType;
	}

	public void setContestType(short contestType) {
		this.contestType = contestType;
	}

	public Integer getTotalNoOfCurrentParticipents() {
		return totalNoOfCurrentParticipents;
	}

	public void setTotalNoOfCurrentParticipents(Integer totalNoOfCurrentParticipents) {
		this.totalNoOfCurrentParticipents = totalNoOfCurrentParticipents;
	}
	

}
