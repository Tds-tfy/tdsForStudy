package com.cosyit.entity;

import java.sql.Timestamp;

/**
 * UserCommentOnCommodityInfo entity. @author MyEclipse Persistence Tools
 */

public class UserCommentOnCommodityInfo implements java.io.Serializable {

	// Fields

	private UserCommentOnCommodityInfoId id;
	private Timestamp userCommentOnCommodityDate;
	private String userCommentOnCommodityText;
	private Integer userCommentOnCommodityType;

	// Constructors

	/** default constructor */
	public UserCommentOnCommodityInfo() {
	}

	/** minimal constructor */
	public UserCommentOnCommodityInfo(UserCommentOnCommodityInfoId id,
			Timestamp userCommentOnCommodityDate,
			String userCommentOnCommodityText) {
		this.id = id;
		this.userCommentOnCommodityDate = userCommentOnCommodityDate;
		this.userCommentOnCommodityText = userCommentOnCommodityText;
	}

	/** full constructor */
	public UserCommentOnCommodityInfo(UserCommentOnCommodityInfoId id,
			Timestamp userCommentOnCommodityDate,
			String userCommentOnCommodityText,
			Integer userCommentOnCommodityType) {
		this.id = id;
		this.userCommentOnCommodityDate = userCommentOnCommodityDate;
		this.userCommentOnCommodityText = userCommentOnCommodityText;
		this.userCommentOnCommodityType = userCommentOnCommodityType;
	}

	// Property accessors

	public UserCommentOnCommodityInfoId getId() {
		return this.id;
	}

	public void setId(UserCommentOnCommodityInfoId id) {
		this.id = id;
	}

	public Timestamp getUserCommentOnCommodityDate() {
		return this.userCommentOnCommodityDate;
	}

	public void setUserCommentOnCommodityDate(
			Timestamp userCommentOnCommodityDate) {
		this.userCommentOnCommodityDate = userCommentOnCommodityDate;
	}

	public String getUserCommentOnCommodityText() {
		return this.userCommentOnCommodityText;
	}

	public void setUserCommentOnCommodityText(String userCommentOnCommodityText) {
		this.userCommentOnCommodityText = userCommentOnCommodityText;
	}

	public Integer getUserCommentOnCommodityType() {
		return this.userCommentOnCommodityType;
	}

	public void setUserCommentOnCommodityType(Integer userCommentOnCommodityType) {
		this.userCommentOnCommodityType = userCommentOnCommodityType;
	}

}