package com.cosyit.entity;

import java.sql.Timestamp;

/**
 * CommodityPriceChangeRecordInfo entity. @author MyEclipse Persistence Tools
 */

public class CommodityPriceChangeRecordInfo implements java.io.Serializable {

	// Fields

	private Integer commodityPriceChangeRecordId;
	private Integer commodityId;
	private Integer userTypeId;
	private Double pricePrevious;
	private Timestamp changeCurrentTime;

	// Constructors

	/** default constructor */
	public CommodityPriceChangeRecordInfo() {
	}

	/** minimal constructor */
	public CommodityPriceChangeRecordInfo(Double pricePrevious) {
		this.pricePrevious = pricePrevious;
	}

	/** full constructor */
	public CommodityPriceChangeRecordInfo(Integer commodityId,
			Integer userTypeId, Double pricePrevious,
			Timestamp changeCurrentTime) {
		this.commodityId = commodityId;
		this.userTypeId = userTypeId;
		this.pricePrevious = pricePrevious;
		this.changeCurrentTime = changeCurrentTime;
	}

	// Property accessors

	public Integer getCommodityPriceChangeRecordId() {
		return this.commodityPriceChangeRecordId;
	}

	public void setCommodityPriceChangeRecordId(
			Integer commodityPriceChangeRecordId) {
		this.commodityPriceChangeRecordId = commodityPriceChangeRecordId;
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

	public Double getPricePrevious() {
		return this.pricePrevious;
	}

	public void setPricePrevious(Double pricePrevious) {
		this.pricePrevious = pricePrevious;
	}

	public Timestamp getChangeCurrentTime() {
		return this.changeCurrentTime;
	}

	public void setChangeCurrentTime(Timestamp changeCurrentTime) {
		this.changeCurrentTime = changeCurrentTime;
	}

}