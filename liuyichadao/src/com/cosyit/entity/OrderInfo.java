package com.cosyit.entity;

import java.sql.Timestamp;

/**
 * OrderInfo entity. @author MyEclipse Persistence Tools
 */

public class OrderInfo implements java.io.Serializable {

	// Fields

	private String orderId;
	private Integer userId;
	private Timestamp orderDate;
	private Integer orderState;
	private String orderMobile;
	private String orderConsigneeName;

	// Constructors

	/** default constructor */
	public OrderInfo() {
	}

	/** minimal constructor */
	public OrderInfo(Timestamp orderDate, String orderMobile,
			String orderConsigneeName) {
		this.orderDate = orderDate;
		this.orderMobile = orderMobile;
		this.orderConsigneeName = orderConsigneeName;
	}

	/** full constructor */
	public OrderInfo(Integer userId, Timestamp orderDate, Integer orderState,
			String orderMobile, String orderConsigneeName) {
		this.userId = userId;
		this.orderDate = orderDate;
		this.orderState = orderState;
		this.orderMobile = orderMobile;
		this.orderConsigneeName = orderConsigneeName;
	}

	// Property accessors

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Timestamp getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getOrderState() {
		return this.orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	public String getOrderMobile() {
		return this.orderMobile;
	}

	public void setOrderMobile(String orderMobile) {
		this.orderMobile = orderMobile;
	}

	public String getOrderConsigneeName() {
		return this.orderConsigneeName;
	}

	public void setOrderConsigneeName(String orderConsigneeName) {
		this.orderConsigneeName = orderConsigneeName;
	}

}