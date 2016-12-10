package com.cosyit.entity;

/**
 * CommodityPriceInfoInfo entity. @author MyEclipse Persistence Tools
 */

public class CommodityPriceInfoInfo implements java.io.Serializable {

	// Fields

	private Integer commodityPriceId;
	private Integer commodityId;
	private Integer userTypeId;
	private Double price;

	// Constructors

	/** default constructor */
	public CommodityPriceInfoInfo() {
	}

	/** minimal constructor */
	public CommodityPriceInfoInfo(Double price) {
		this.price = price;
	}

	/** full constructor */
	public CommodityPriceInfoInfo(Integer commodityId, Integer userTypeId,
			Double price) {
		this.commodityId = commodityId;
		this.userTypeId = userTypeId;
		this.price = price;
	}

	// Property accessors

	public Integer getCommodityPriceId() {
		return this.commodityPriceId;
	}

	public void setCommodityPriceId(Integer commodityPriceId) {
		this.commodityPriceId = commodityPriceId;
	}

	public Integer getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}

	public Integer getUserTypeId() {
		return this.userTypeId;
	}

	public void setUserTypeId(Integer userTypeId) {
		this.userTypeId = userTypeId;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}