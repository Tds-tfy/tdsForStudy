package com.cosyit.dao.interfaces;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;

public interface Dao<T> {
	public List<T> getAll();
	
	public T getByID(Serializable id);
	
	//根据业务需要，多个准则条件查询的方法。
	public List<T> getInfoesByProperties(Criterion... criterions);
	
	/**
	 *根据业务的需要，进行多条件查询并实现分页查询
	 * @param pageNum 需要查询的页码（第几页）
	 * @param rowCount	指定每页显示的行数
	 * @param criterions 1-n个 条件准则
	 * @return
	 */
	List<T> getInfoesByProperties(Integer pageNum,Integer rowCount,Criterion...criterions);
	
	public void execute_insert(T...ts);
	
	public void execute_delete(T... ts);
	
	public void execute_update(T... ts);

}
