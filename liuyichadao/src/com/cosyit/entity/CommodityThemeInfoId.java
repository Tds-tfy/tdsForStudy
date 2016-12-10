package com.cosyit.entity;

/**
 * CommodityThemeInfoId entity. @author MyEclipse Persistence Tools
 */

public class CommodityThemeInfoId implements java.io.Serializable {

	// Fields

	private Integer themeId;
	private Integer commodityId;

	// Constructors

	/** default constructor */
	public CommodityThemeInfoId() {
	}

	/** full constructor */
	public CommodityThemeInfoId(Integer themeId, Integer commodityId) {
		this.themeId = themeId;
		this.commodityId = commodityId;
	}

	// Property accessors

	public Integer getThemeId() {
		return this.themeId;
	}

	public void setThemeId(Integer themeId) {
		this.themeId = themeId;
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
		if (!(other instanceof CommodityThemeInfoId))
			return false;
		CommodityThemeInfoId castOther = (CommodityThemeInfoId) other;

		return ((this.getThemeId() == castOther.getThemeId()) || (this
				.getThemeId() != null && castOther.getThemeId() != null && this
				.getThemeId().equals(castOther.getThemeId())))
				&& ((this.getCommodityId() == castOther.getCommodityId()) || (this
						.getCommodityId() != null
						&& castOther.getCommodityId() != null && this
						.getCommodityId().equals(castOther.getCommodityId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getThemeId() == null ? 0 : this.getThemeId().hashCode());
		result = 37
				* result
				+ (getCommodityId() == null ? 0 : this.getCommodityId()
						.hashCode());
		return result;
	}

}