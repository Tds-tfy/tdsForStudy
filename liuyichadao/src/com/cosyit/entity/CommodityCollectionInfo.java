package com.cosyit.entity;

/**
 * CommodityCollectionInfo entity. @author MyEclipse Persistence Tools
 */

public class CommodityCollectionInfo implements java.io.Serializable {

	// Fields

	private CommodityCollectionInfoId id;

	// Constructors

	/** default constructor */
	public CommodityCollectionInfo() {
	}

	/** full constructor */
	public CommodityCollectionInfo(CommodityCollectionInfoId id) {
		this.id = id;
	}

	// Property accessors

	public CommodityCollectionInfoId getId() {
		return this.id;
	}

	public void setId(CommodityCollectionInfoId id) {
		this.id = id;
	}

}