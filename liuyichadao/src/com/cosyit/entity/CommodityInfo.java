package com.cosyit.entity;

import java.sql.Timestamp;

/**
 * CommodityInfo entity. @author MyEclipse Persistence Tools
 */

public class CommodityInfo implements java.io.Serializable {

	// Fields

	private Integer commodityId;
	private String commodityName;
	private String commodityQuality;
	private String commodityUnitPrice;
	private String commodityPackageSpecification;
	private Integer commodityMakeCraft;
	private Integer commodityTypeId;
	private Integer commodityBuoyId;
	private Integer commodityPackageDesign;
	private Timestamp commodityEntryNetworkTime;
	private String commodityBirthSeason;
	private Integer commodityImageId;
	private String commodityImage;

	// Constructors

	/** default constructor */
	public CommodityInfo() {
	}

	/** minimal constructor */
	public CommodityInfo(String commodityName, String commodityUnitPrice) {
		this.commodityName = commodityName;
		this.commodityUnitPrice = commodityUnitPrice;
	}

	/** full constructor */
	public CommodityInfo(String commodityName, String commodityQuality,
			String commodityUnitPrice, String commodityPackageSpecification,
			Integer commodityMakeCraft, Integer commodityTypeId,
			Integer commodityBuoyId, Integer commodityPackageDesign,
			Timestamp commodityEntryNetworkTime, String commodityBirthSeason,
			Integer commodityImageId, String commodityImage) {
		this.commodityName = commodityName;
		this.commodityQuality = commodityQuality;
		this.commodityUnitPrice = commodityUnitPrice;
		this.commodityPackageSpecification = commodityPackageSpecification;
		this.commodityMakeCraft = commodityMakeCraft;
		this.commodityTypeId = commodityTypeId;
		this.commodityBuoyId = commodityBuoyId;
		this.commodityPackageDesign = commodityPackageDesign;
		this.commodityEntryNetworkTime = commodityEntryNetworkTime;
		this.commodityBirthSeason = commodityBirthSeason;
		this.commodityImageId = commodityImageId;
		this.commodityImage = commodityImage;
	}

	// Property accessors

	public Integer getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}

	public String getCommodityName() {
		return this.commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getCommodityQuality() {
		return this.commodityQuality;
	}

	public void setCommodityQuality(String commodityQuality) {
		this.commodityQuality = commodityQuality;
	}

	public String getCommodityUnitPrice() {
		return this.commodityUnitPrice;
	}

	public void setCommodityUnitPrice(String commodityUnitPrice) {
		this.commodityUnitPrice = commodityUnitPrice;
	}

	public String getCommodityPackageSpecification() {
		return this.commodityPackageSpecification;
	}

	public void setCommodityPackageSpecification(
			String commodityPackageSpecification) {
		this.commodityPackageSpecification = commodityPackageSpecification;
	}

	public Integer getCommodityMakeCraft() {
		return this.commodityMakeCraft;
	}

	public void setCommodityMakeCraft(Integer commodityMakeCraft) {
		this.commodityMakeCraft = commodityMakeCraft;
	}

	public Integer getCommodityTypeId() {
		return this.commodityTypeId;
	}

	public void setCommodityTypeId(Integer commodityTypeId) {
		this.commodityTypeId = commodityTypeId;
	}

	public Integer getCommodityBuoyId() {
		return this.commodityBuoyId;
	}

	public void setCommodityBuoyId(Integer commodityBuoyId) {
		this.commodityBuoyId = commodityBuoyId;
	}

	public Integer getCommodityPackageDesign() {
		return this.commodityPackageDesign;
	}

	public void setCommodityPackageDesign(Integer commodityPackageDesign) {
		this.commodityPackageDesign = commodityPackageDesign;
	}

	public Timestamp getCommodityEntryNetworkTime() {
		return this.commodityEntryNetworkTime;
	}

	public void setCommodityEntryNetworkTime(Timestamp commodityEntryNetworkTime) {
		this.commodityEntryNetworkTime = commodityEntryNetworkTime;
	}

	public String getCommodityBirthSeason() {
		return this.commodityBirthSeason;
	}

	public void setCommodityBirthSeason(String commodityBirthSeason) {
		this.commodityBirthSeason = commodityBirthSeason;
	}

	public Integer getCommodityImageId() {
		return this.commodityImageId;
	}

	public void setCommodityImageId(Integer commodityImageId) {
		this.commodityImageId = commodityImageId;
	}

	public String getCommodityImage() {
		return this.commodityImage;
	}

	public void setCommodityImage(String commodityImage) {
		this.commodityImage = commodityImage;
	}

}