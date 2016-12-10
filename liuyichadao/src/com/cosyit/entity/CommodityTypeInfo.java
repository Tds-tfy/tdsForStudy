package com.cosyit.entity;

/**
 * CommodityTypeInfo entity. @author MyEclipse Persistence Tools
 */

public class CommodityTypeInfo implements java.io.Serializable {

	// Fields

	private Integer commodityTypeId;
	private String commodityTypeName;
	private Integer commodityTypeRank;
	private Integer commodityTypeParentId;

	// Constructors

	/** default constructor */
	public CommodityTypeInfo() {
	}

	/** minimal constructor */
	public CommodityTypeInfo(String commodityTypeName, Integer commodityTypeRank) {
		this.commodityTypeName = commodityTypeName;
		this.commodityTypeRank = commodityTypeRank;
	}

	/** full constructor */
	public CommodityTypeInfo(String commodityTypeName,
			Integer commodityTypeRank, Integer commodityTypeParentId) {
		this.commodityTypeName = commodityTypeName;
		this.commodityTypeRank = commodityTypeRank;
		this.commodityTypeParentId = commodityTypeParentId;
	}

	// Property accessors

	public Integer getCommodityTypeId() {
		return this.commodityTypeId;
	}

	public void setCommodityTypeId(Integer commodityTypeId) {
		this.commodityTypeId = commodityTypeId;
	}

	public String getCommodityTypeName() {
		return this.commodityTypeName;
	}

	public void setCommodityTypeName(String commodityTypeName) {
		this.commodityTypeName = commodityTypeName;
	}

	public Integer getCommodityTypeRank() {
		return this.commodityTypeRank;
	}

	public void setCommodityTypeRank(Integer commodityTypeRank) {
		this.commodityTypeRank = commodityTypeRank;
	}

	public Integer getCommodityTypeParentId() {
		return this.commodityTypeParentId;
	}

	public void setCommodityTypeParentId(Integer commodityTypeParentId) {
		this.commodityTypeParentId = commodityTypeParentId;
	}

}