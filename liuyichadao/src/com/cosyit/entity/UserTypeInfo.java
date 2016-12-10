package com.cosyit.entity;

/**
 * UserTypeInfo entity. @author MyEclipse Persistence Tools
 */

public class UserTypeInfo implements java.io.Serializable {

	// Fields

	private Integer userTypeId;
	private String userTypeName;

	// Constructors

	/** default constructor */
	public UserTypeInfo() {
	}

	/** full constructor */
	public UserTypeInfo(String userTypeName) {
		this.userTypeName = userTypeName;
	}

	// Property accessors

	public Integer getUserTypeId() {
		return this.userTypeId;
	}

	public void setUserTypeId(Integer userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getUserTypeName() {
		return this.userTypeName;
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}

}