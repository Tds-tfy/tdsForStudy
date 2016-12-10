package com.cosyit.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.criterion.Criterion;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cosyit.dao.interfaces.Dao;


/**
 * 写一个帮助类
 * 在这里面，我希望它能作为所有Dao,对外的统一接洽人员。
 * 对内呢，他是利用各个dao的方法，来组合起相关业务。
 * 首先一点它得有相关的Dao操作。
 * @author Administrator
 *
 */

@Transactional
@Service
public class ModelService {
	/**
	 * 所有被 final 修饰的量都是常量 也就是该量的值是不变的,
	 * 用static主要作用是在类刚加载时就初始化该量的值并给他分配一块共用的内存块存储他的值.
	 * 全局常量，声明全局常量后所有的对象共享此属性。再不知道某个类要产生多少个对象时，
	 * 如果想改属性，只要一个对象改了，其他对象也改了，往往用类直接调用 
	 */
	public static final String COMMODITY="commodityInfoDao";
	
	
	@Resource(name="daoMap")
	private Map<String,Dao> daoMap;

	public Map<String, Dao> getDaoMap() {
		return daoMap;
	}

	public void setDaoMap(Map<String, Dao> daoMap) {
		this.daoMap = daoMap;
	}
	
	/**
	 * 不要让Dao抛头露面。在这里面
	 */
	
	
	//-------------------------以下为根据Dao相关实现进行的基本操作方法封装-----------------------------------------------
	/**
	 * 获取指定表格的所有信息
	 * @param key 指定表格key（常量）
	 * @return 封装有相关信息实体类对象的列表
	 */
	public List getAll(String key){
		
		
		return this.daoMap.get(key).getAll();
		
	}
	
	/**
	 * 
	 * @param key
	 * @param id
	 * @return
	 */
	public Object getInfoById(String key,Serializable id){
		
		
		return this.daoMap.get(key).getByID(id);
		
	}
	
	public List getInfoByProperties(String key,Integer pageNum,Integer rowCount,Criterion...criterions){
		return this.daoMap.get(key).getInfoesByProperties(pageNum, rowCount, criterions);
	}
	
	public List getInfoByProperties(String key,Criterion...criterions){
		return this.getDaoMap().get(key).getInfoesByProperties(criterions);
	}

	/**
	 * 
	 */
	public void insert_batch(String key,Object...entities){
		 this.daoMap.get(key).execute_insert(entities);
	}
	
	public void update_batch(String key,Object...entities){
		 this.daoMap.get(key).execute_update(entities);
	}
	
	public void delete_batch(String key,Object...entities){
		 this.daoMap.get(key).execute_delete(entities);
	}
}
