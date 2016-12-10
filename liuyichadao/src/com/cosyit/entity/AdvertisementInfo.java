package com.cosyit.entity;

/**
 * AdvertisementInfo entity. @author MyEclipse Persistence Tools
 */

public class AdvertisementInfo implements java.io.Serializable {

	// Fields

	private Integer advertisementId;
	private String advertisementImg;
	private String advertisementLink;
	private Integer advertisementIndex;
	private Integer advertisementType;

	// Constructors

	/** default constructor */
	public AdvertisementInfo() {
	}

	/** minimal constructor */
	public AdvertisementInfo(String advertisementImg, String advertisementLink) {
		this.advertisementImg = advertisementImg;
		this.advertisementLink = advertisementLink;
	}

	/** full constructor */
	public AdvertisementInfo(String advertisementImg, String advertisementLink,
			Integer advertisementIndex, Integer advertisementType) {
		this.advertisementImg = advertisementImg;
		this.advertisementLink = advertisementLink;
		this.advertisementIndex = advertisementIndex;
		this.advertisementType = advertisementType;
	}

	// Property accessors

	public Integer getAdvertisementId() {
		return this.advertisementId;
	}

	public void setAdvertisementId(Integer advertisementId) {
		this.advertisementId = advertisementId;
	}

	public String getAdvertisementImg() {
		return this.advertisementImg;
	}

	public void setAdvertisementImg(String advertisementImg) {
		this.advertisementImg = advertisementImg;
	}

	public String getAdvertisementLink() {
		return this.advertisementLink;
	}

	public void setAdvertisementLink(String advertisementLink) {
		this.advertisementLink = advertisementLink;
	}

	public Integer getAdvertisementIndex() {
		return this.advertisementIndex;
	}

	public void setAdvertisementIndex(Integer advertisementIndex) {
		this.advertisementIndex = advertisementIndex;
	}

	public Integer getAdvertisementType() {
		return this.advertisementType;
	}

	public void setAdvertisementType(Integer advertisementType) {
		this.advertisementType = advertisementType;
	}

}