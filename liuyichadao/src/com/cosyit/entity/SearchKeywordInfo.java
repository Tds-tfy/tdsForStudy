package com.cosyit.entity;

/**
 * SearchKeywordInfo entity. @author MyEclipse Persistence Tools
 */

public class SearchKeywordInfo implements java.io.Serializable {

	// Fields

	private Integer searchKeywordId;
	private String searchKeywordText;

	// Constructors

	/** default constructor */
	public SearchKeywordInfo() {
	}

	/** full constructor */
	public SearchKeywordInfo(String searchKeywordText) {
		this.searchKeywordText = searchKeywordText;
	}

	// Property accessors

	public Integer getSearchKeywordId() {
		return this.searchKeywordId;
	}

	public void setSearchKeywordId(Integer searchKeywordId) {
		this.searchKeywordId = searchKeywordId;
	}

	public String getSearchKeywordText() {
		return this.searchKeywordText;
	}

	public void setSearchKeywordText(String searchKeywordText) {
		this.searchKeywordText = searchKeywordText;
	}

}