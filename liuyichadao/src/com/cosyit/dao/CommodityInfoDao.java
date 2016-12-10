package com.cosyit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cosyit.entity.CommodityInfo;

@Repository
public class CommodityInfoDao extends BaseDao<CommodityInfo>{
	@Autowired
	public CommodityInfoDao(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}
}
