package com.cosyit.entity;

/**
 * AgencyInfo entity. @author MyEclipse Persistence Tools
 */

public class AgencyInfo implements java.io.Serializable {

	// Fields

	private Integer agencyId;
	private String agencyName;
	private String agencyMobile;
	private String agencyQq;
	private String agencyWechat;
	private String agencyAddress;
	private Integer agencyRank;
	private Integer agencyParantId;
	private Integer areaId;

	// Constructors

	/** default constructor */
	public AgencyInfo() {
	}

	/** minimal constructor */
	public AgencyInfo(String agencyName, String agencyMobile, Integer agencyRank) {
		this.agencyName = agencyName;
		this.agencyMobile = agencyMobile;
		this.agencyRank = agencyRank;
	}

	/** full constructor */
	public AgencyInfo(String agencyName, String agencyMobile, String agencyQq,
			String agencyWechat, String agencyAddress, Integer agencyRank,
			Integer agencyParantId, Integer areaId) {
		this.agencyName = agencyName;
		this.agencyMobile = agencyMobile;
		this.agencyQq = agencyQq;
		this.agencyWechat = agencyWechat;
		this.agencyAddress = agencyAddress;
		this.agencyRank = agencyRank;
		this.agencyParantId = agencyParantId;
		this.areaId = areaId;
	}

	// Property accessors

	public Integer getAgencyId() {
		return this.agencyId;
	}

	public void setAgencyId(Integer agencyId) {
		this.agencyId = agencyId;
	}

	public String getAgencyName() {
		return this.agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getAgencyMobile() {
		return this.agencyMobile;
	}

	public void setAgencyMobile(String agencyMobile) {
		this.agencyMobile = agencyMobile;
	}

	public String getAgencyQq() {
		return this.agencyQq;
	}

	public void setAgencyQq(String agencyQq) {
		this.agencyQq = agencyQq;
	}

	public String getAgencyWechat() {
		return this.agencyWechat;
	}

	public void setAgencyWechat(String agencyWechat) {
		this.agencyWechat = agencyWechat;
	}

	public String getAgencyAddress() {
		return this.agencyAddress;
	}

	public void setAgencyAddress(String agencyAddress) {
		this.agencyAddress = agencyAddress;
	}

	public Integer getAgencyRank() {
		return this.agencyRank;
	}

	public void setAgencyRank(Integer agencyRank) {
		this.agencyRank = agencyRank;
	}

	public Integer getAgencyParantId() {
		return this.agencyParantId;
	}

	public void setAgencyParantId(Integer agencyParantId) {
		this.agencyParantId = agencyParantId;
	}

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

}