package com.arun.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;



@Entity
@Table(name="RESOURCE_DTLS")
public class ResourceDtls {
	@Id
	@GeneratedValue
	@Column(name="RESOURCE_ID")
	private Integer resourceId;
	
	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceSkills() {
		return resourceSkills;
	}

	public void setResourceSkills(String resourceSkills) {
		this.resourceSkills = resourceSkills;
	}

	public String getResourceExp() {
		return resourceExp;
	}

	public void setResourceExp(String resourceExp) {
		this.resourceExp = resourceExp;
	}

	@Column(name="RESOURCE_NAME")
	private String resourceName;
	
	@Column(name="RESOURCE_SKILLS")
	private String resourceSkills;
	
	@Column(name="RESOURCE_EXP")
	private String resourceExp;

}
