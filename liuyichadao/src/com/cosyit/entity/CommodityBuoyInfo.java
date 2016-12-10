package com.cosyit.entity;

/**
 * CommodityBuoyInfo entity. @author MyEclipse Persistence Tools
 */

public class CommodityBuoyInfo implements java.io.Serializable {

	// Fields

	private Integer commodityBuoyId;
	private String commodityBuoyName;
	private String commodityBuoyImg;

	// Constructors

	/** default constructor */
	public CommodityBuoyInfo() {
	}

	/** full constructor */
	public CommodityBuoyInfo(String commodityBuoyName, String commodityBuoyImg) {
		this.commodityBuoyName = commodityBuoyName;
		this.commodityBuoyImg = commodityBuoyImg;
	}

	// Property accessors

	public Integer getCommodityBuoyId() {
		return this.commodityBuoyId;
	}

	public void setCommodityBuoyId(Integer commodityBuoyId) {
		this.commodityBuoyId = commodityBuoyId;
	}

	public String getCommodityBuoyName() {
		return this.commodityBuoyName;
	}

	public void setCommodityBuoyName(String commodityBuoyName) {
		this.commodityBuoyName = commodityBuoyName;
	}

	public String getCommodityBuoyImg() {
		return this.commodityBuoyImg;
	}

	public void setCommodityBuoyImg(String commodityBuoyImg) {
		this.commodityBuoyImg = commodityBuoyImg;
	}

}