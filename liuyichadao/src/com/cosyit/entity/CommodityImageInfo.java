package com.cosyit.entity;

/**
 * CommodityImageInfo entity. @author MyEclipse Persistence Tools
 */

public class CommodityImageInfo implements java.io.Serializable {

	// Fields

	private Integer commodityImageId;
	private String commodityImageUrl;
	private Integer commodityId;
	private Integer commodityImageType;

	// Constructors

	/** default constructor */
	public CommodityImageInfo() {
	}

	/** minimal constructor */
	public CommodityImageInfo(String commodityImageUrl) {
		this.commodityImageUrl = commodityImageUrl;
	}

	/** full constructor */
	public CommodityImageInfo(String commodityImageUrl, Integer commodityId,
			Integer commodityImageType) {
		this.commodityImageUrl = commodityImageUrl;
		this.commodityId = commodityId;
		this.commodityImageType = commodityImageType;
	}

	// Property accessors

	public Integer getCommodityImageId() {
		return this.commodityImageId;
	}

	public void setCommodityImageId(Integer commodityImageId) {
		this.commodityImageId = commodityImageId;
	}

	public String getCommodityImageUrl() {
		return this.commodityImageUrl;
	}

	public void setCommodityImageUrl(String commodityImageUrl) {
		this.commodityImageUrl = commodityImageUrl;
	}

	public Integer getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}

	public Integer getCommodityImageType() {
		return this.commodityImageType;
	}

	public void setCommodityImageType(Integer commodityImageType) {
		this.commodityImageType = commodityImageType;
	}

}