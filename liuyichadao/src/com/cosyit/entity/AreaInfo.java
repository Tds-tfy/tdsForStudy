package com.cosyit.entity;

/**
 * AreaInfo entity. @author MyEclipse Persistence Tools
 */

public class AreaInfo implements java.io.Serializable {

	// Fields

	private Integer areaId;
	private String areaName;
	private Integer areaLevel;
	private Integer areaParentId;

	// Constructors

	/** default constructor */
	public AreaInfo() {
	}

	/** minimal constructor */
	public AreaInfo(String areaName) {
		this.areaName = areaName;
	}

	/** full constructor */
	public AreaInfo(String areaName, Integer areaLevel, Integer areaParentId) {
		this.areaName = areaName;
		this.areaLevel = areaLevel;
		this.areaParentId = areaParentId;
	}

	// Property accessors

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getAreaLevel() {
		return this.areaLevel;
	}

	public void setAreaLevel(Integer areaLevel) {
		this.areaLevel = areaLevel;
	}

	public Integer getAreaParentId() {
		return this.areaParentId;
	}

	public void setAreaParentId(Integer areaParentId) {
		this.areaParentId = areaParentId;
	}

}