package com.cosyit.action;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.annotation.Lazy;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cosyit.entity.CommodityInfo;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Lazy(true)
@ParentPackage("struts-default")
@Namespace(value="/lycd/crol/commodityaction")
@Results(value={
		@Result(name="infoes",location="/WEB-INF/commodity.jsp")
})
@Scope("prototype")
public class CommodityInfoAction extends BaseAction{
	
	@Action(value="getinfo")
	public String getInfo(){
		System.out.println(1);
		List<CommodityInfo> commoditys=getService().getInfoByProperties(getKey(),1,100);
		Map<String,Object> requestMap=(Map) ActionContext.getContext().get("request");
		requestMap.put("infoes",commoditys);
		return "infoes";
	}
	
	@Override
	public List getBatch_list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable getEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return this.getService().COMMODITY;
	}

}
