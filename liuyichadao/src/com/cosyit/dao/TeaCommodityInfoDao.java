package com.cosyit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cosyit.entity.TeaCommodityInfo;

@Repository
public class TeaCommodityInfoDao extends BaseDao<TeaCommodityInfo>{
	@Autowired
	public TeaCommodityInfoDao(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}
}
