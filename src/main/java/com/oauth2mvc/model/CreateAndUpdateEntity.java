package com.oauth2mvc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * 
 * @author Prashant Sharma
 *
 */
@MappedSuperclass
public class CreateAndUpdateEntity implements Serializable{

	@Column( updatable=false ,  name = "created_by")
	private Long createdBy;
	
	@Column(name = "modified_by")
	private Long modifiedBy;
	
	@Column(updatable=false , name = "created_time")
	private Date createdTime;
	
	@Column(name = "modified_time")
	private Date modifiedTime;
	
	
	//////////////////////////////////////////////////////////////
	/////////////GETTERS AND SETTERS//////////////////////////////
	//////////////////////////////////////////////////////////////

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	
}
