package com.cosyit.entity;

/**
 * OrderList entity. @author MyEclipse Persistence Tools
 */

public class OrderList implements java.io.Serializable {

	// Fields

	private String olid;
	private Integer commodityId;
	private Integer gdcount;
	private Double price;
	private String orderId;

	// Constructors

	/** default constructor */
	public OrderList() {
	}

	/** minimal constructor */
	public OrderList(Double price) {
		this.price = price;
	}

	/** full constructor */
	public OrderList(Integer commodityId, Integer gdcount, Double price,
			String orderId) {
		this.commodityId = commodityId;
		this.gdcount = gdcount;
		this.price = price;
		this.orderId = orderId;
	}

	// Property accessors

	public String getOlid() {
		return this.olid;
	}

	public void setOlid(String olid) {
		this.olid = olid;
	}

	public Integer getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}

	public Integer getGdcount() {
		return this.gdcount;
	}

	public void setGdcount(Integer gdcount) {
		this.gdcount = gdcount;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}