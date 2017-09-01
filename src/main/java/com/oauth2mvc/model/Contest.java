package com.oauth2mvc.model;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name = "contest")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Contest extends CreateAndUpdateEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public Contest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "total_winning_amount")
	private BigDecimal totalWinningAmount;
	
	@Column(name = "max_contestent")
	private Integer maxContestent; 
	
	@Column(name = "max_winner")
	private Integer maxWinnerCount;	
	
	// Foreign key from match_schedule table
	@Column(name = "match_id")
	private Integer matchId;	

	@Column(name = "contest_type")
	private Short contestType;	
	
	@Column(name = "entry_fees")
	private BigDecimal entryFees;

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

	public BigDecimal getTotalWinningAmount() {
		return totalWinningAmount;
	}

	public void setTotalWinningAmount(BigDecimal totalWinningAmount) {
		this.totalWinningAmount = totalWinningAmount;
	}

	public Integer getMaxContestent() {
		return maxContestent;
	}

	public void setMaxContestent(Integer maxContestent) {
		this.maxContestent = maxContestent;
	}

	public Integer getMaxWinner() {
		return maxWinnerCount;
	}

	public void setMaxWinner(Integer maxWinner) {
		this.maxWinnerCount = maxWinner;
	}

	public Integer getMatchId() {
		return matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public Short getContestType() {
		return contestType;
	}

	public void setContestType(Short contestType) {
		this.contestType = contestType;
	}

	public BigDecimal getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(BigDecimal entryFees) {
		this.entryFees = entryFees;
	}	

}
