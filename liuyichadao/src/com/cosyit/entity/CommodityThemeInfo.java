package com.cosyit.entity;

import java.sql.Timestamp;

/**
 * CommodityThemeInfo entity. @author MyEclipse Persistence Tools
 */

public class CommodityThemeInfo implements java.io.Serializable {

	// Fields

	private CommodityThemeInfoId id;
	private Timestamp commodityThemeDate;

	// Constructors

	/** default constructor */
	public CommodityThemeInfo() {
	}

	/** full constructor */
	public CommodityThemeInfo(CommodityThemeInfoId id,
			Timestamp commodityThemeDate) {
		this.id = id;
		this.commodityThemeDate = commodityThemeDate;
	}

	// Property accessors

	public CommodityThemeInfoId getId() {
		return this.id;
	}

	public void setId(CommodityThemeInfoId id) {
		this.id = id;
	}

	public Timestamp getCommodityThemeDate() {
		return this.commodityThemeDate;
	}

	public void setCommodityThemeDate(Timestamp commodityThemeDate) {
		this.commodityThemeDate = commodityThemeDate;
	}

}