package com.cosyit.action;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import com.cosyit.service.ModelService;

public abstract class BaseAction {
	
	/**
	 * 获取商品，系统用户  信息数据库访问工具类对象的关键字。
	 */
	
	@Resource(name="modelService")
	private ModelService service;
	
	private int magState;
	
	private String key;
	
	public int getMagState() {
		return magState;
	}
	public void setMagState(int magState) {
		this.magState = magState;
	}

	public ModelService getService() {
		return service;
	}

	public void setService(ModelService service) {
		this.service = service;
	}
	public abstract String getKey();
	public void setKey(String key) {
		this.key = key;
	}
	
	public abstract List getBatch_list();
	
	public abstract Serializable getEntity();
}
