package com.cosyit.entity;

/**
 * ThemeInfo entity. @author MyEclipse Persistence Tools
 */

public class ThemeInfo implements java.io.Serializable {

	// Fields

	private Integer themeId;
	private String themeText;

	// Constructors

	/** default constructor */
	public ThemeInfo() {
	}

	/** full constructor */
	public ThemeInfo(String themeText) {
		this.themeText = themeText;
	}

	// Property accessors

	public Integer getThemeId() {
		return this.themeId;
	}

	public void setThemeId(Integer themeId) {
		this.themeId = themeId;
	}

	public String getThemeText() {
		return this.themeText;
	}

	public void setThemeText(String themeText) {
		this.themeText = themeText;
	}

}