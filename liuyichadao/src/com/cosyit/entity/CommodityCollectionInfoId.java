package com.cosyit.entity;

/**
 * CommodityCollectionInfoId entity. @author MyEclipse Persistence Tools
 */

public class CommodityCollectionInfoId implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Integer commodityId;

	// Constructors

	/** default constructor */
	public CommodityCollectionInfoId() {
	}

	/** full constructor */
	public CommodityCollectionInfoId(Integer userId, Integer commodityId) {
		this.userId = userId;
		this.commodityId = commodityId;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CommodityCollectionInfoId))
			return false;
		CommodityCollectionInfoId castOther = (CommodityCollectionInfoId) other;

		return ((this.getUserId() == castOther.getUserId()) || (this
				.getUserId() != null && castOther.getUserId() != null && this
				.getUserId().equals(castOther.getUserId())))
				&& ((this.getCommodityId() == castOther.getCommodityId()) || (this
						.getCommodityId() != null
						&& castOther.getCommodityId() != null && this
						.getCommodityId().equals(castOther.getCommodityId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37
				* result
				+ (getCommodityId() == null ? 0 : this.getCommodityId()
						.hashCode());
		return result;
	}

}