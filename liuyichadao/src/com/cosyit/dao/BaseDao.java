package com.cosyit.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.cosyit.dao.interfaces.Dao;

@Transactional
public class BaseDao<T> extends HibernateTemplate implements Dao<T>{
	
	public static final int INSERT=1;
	public static final int DELETE=2;
	public static final int UPDATE=3;
	
	private Class type;//相关的个性实现：即泛型T
	
	@Autowired
	public BaseDao(SessionFactory sessionFactory) {
		super(sessionFactory);//这个sessionFactory给HibernateTemplate的构造函数用，这样HibernateTemplate就用了sessionFactory.
		//将来肯定是子类的特定的T对象来调用这个构造函数。
		ParameterizedType parameterizedType=(ParameterizedType) this.getClass().getGenericSuperclass();
		this.type=(Class) parameterizedType.getActualTypeArguments()[0];
	}

	@Override
	public List<T> getAll() {
		
		return find(new StringBuffer(" from ").append(this.type.getName()).toString());
	}

	@Override
	public T getByID(Serializable id) {
		
		return (T) get(this.type.getName(), id);
	}

	@Override
	public List getInfoesByProperties(Criterion... criterions) {
		
		return getInfoesByProperties(null,null,criterions);
	}
	
	@Override
	public List<T> getInfoesByProperties(Integer pageNum, Integer rowCount,
			Criterion... criterions) {
		DetachedCriteria criteria=DetachedCriteria.forClass(type);
		for(Criterion criterion:criterions){
			criteria.add(criterion);
		}
		
		if(pageNum!=null&&rowCount!=null && pageNum>=1&&rowCount>=1){
			return findByCriteria(criteria,(pageNum-1)*rowCount,rowCount);
		}
		
		return findByCriteria(criteria);
		
	}
	
	public void update(int wangToDo,T...ts){
		int i=0;
		switch (wangToDo) {
		case INSERT:
			for(T t:ts){			
				if(++i%50==0){
					this.flush();
					this.clear();
				}
				
				if(i%6==0){
					int a=1/0;
				}
				save(t);
			}
			break;

		case DELETE:
			for(T t:ts){
				if(++i%50==0){
					this.flush();
					this.clear();
				}
				delete(t);
			}
			break;

		case UPDATE:
			for(T t:ts){
				if(++i%50==0){
					this.flush();
					this.clear();
				}
				update(t);
			}
			break;

		}
	}

	@Override
	public void execute_insert(T... ts) {
		this.update(INSERT, ts);
		
	}

	@Override
	public void execute_delete(T...ts ) {
		this.update(DELETE,ts);
	}

	@Override
	public void execute_update(T... ts) {
		this.update(UPDATE,ts);
	}

	
}
