package com.cosyit.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String userPassword;
	private Integer userSex;
	private Date userBirthday;
	private String userNickname;
	private String userMobile;
	private String userQq;
	private String userEmail;
	private Timestamp userJoinDate;
	private Integer userLockedState;
	private Integer userTypeId;

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** minimal constructor */
	public UserInfo(String userPassword, Date userBirthday, String userMobile,
			Timestamp userJoinDate) {
		this.userPassword = userPassword;
		this.userBirthday = userBirthday;
		this.userMobile = userMobile;
		this.userJoinDate = userJoinDate;
	}

	/** full constructor */
	public UserInfo(String userName, String userPassword, Integer userSex,
			Date userBirthday, String userNickname, String userMobile,
			String userQq, String userEmail, Timestamp userJoinDate,
			Integer userLockedState, Integer userTypeId) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userSex = userSex;
		this.userBirthday = userBirthday;
		this.userNickname = userNickname;
		this.userMobile = userMobile;
		this.userQq = userQq;
		this.userEmail = userEmail;
		this.userJoinDate = userJoinDate;
		this.userLockedState = userLockedState;
		this.userTypeId = userTypeId;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getUserSex() {
		return this.userSex;
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}

	public Date getUserBirthday() {
		return this.userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUserNickname() {
		return this.userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserQq() {
		return this.userQq;
	}

	public void setUserQq(String userQq) {
		this.userQq = userQq;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Timestamp getUserJoinDate() {
		return this.userJoinDate;
	}

	public void setUserJoinDate(Timestamp userJoinDate) {
		this.userJoinDate = userJoinDate;
	}

	public Integer getUserLockedState() {
		return this.userLockedState;
	}

	public void setUserLockedState(Integer userLockedState) {
		this.userLockedState = userLockedState;
	}

	public Integer getUserTypeId() {
		return this.userTypeId;
	}

	public void setUserTypeId(Integer userTypeId) {
		this.userTypeId = userTypeId;
	}

}