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
	
	//静态常量插入
	public static final int INSERT=1;
	
	//静态常量删除
	public static final int DELETE=2;
	
	//静态常量更新
	public static final int UPDATE=3;
	
	//类类型 对象，未来相关的个性实现：即泛型T的具体类型，因为将来要运用运行时的反射出相关的数据。
	private Class type;
	
	//自动注入
	@Autowired
	/**
	 * 这个sessionFactory给HibernateTemplate的构造函数用，这样HibernateTemplate就用了sessionFactory.
	 * 将来肯定是子类的特定的T对象来调用这个构造函数。
	 * @param sessionFactory
	 */
	public BaseDao(SessionFactory sessionFactory) {
		super(sessionFactory);
		ParameterizedType parameterizedType=(ParameterizedType) this.getClass().getGenericSuperclass();
		this.type=(Class) parameterizedType.getActualTypeArguments()[0];
	}
	
	/**
	 * 拿到全部，数据量大的
	 * 的时候，不建议使用
	 */
	@Override
	public List<T> getAll() {
		
		return find(new StringBuffer(" from ").append(this.type.getName()).toString());
	}
	
	/**
	 * 根据id检索对应id的对象
	 */
	@Override
	public T getByID(Serializable id) {
		
		return (T) get(this.type.getName(), id);
	}
	
	/**
	 * 不分页，直接根据条件显示
	 */
	@Override
	public List getInfoesByProperties(Criterion... criterions) {
		
		return getInfoesByProperties(null,null,criterions);
	}
	
	/**
	 *根据业务的需要，进行多条件查询并实现分页查询
	 * @param pageNum 需要查询的页码（第几页）
	 * @param rowCount	指定每页显示的行数
	 * @param criterions 1和或者多个个 条件准则
	 * @return
	 */
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
	
	//对增删改代码进行了提取的总的更新（增删改）
	public void update(int wangToDo,T...ts){
		int i=0;
		switch (wangToDo) {
		case INSERT:
			//清理缓存，当操作的数量达到50的时候刷新一下session的一级缓存。
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
	
	/**
	 * 增
	 */
	@Override
	public void execute_insert(T... ts) {
		this.update(INSERT, ts);
		
	}
	
	/**
	 * 删
	 */
	@Override
	public void execute_delete(T...ts ) {
		this.update(DELETE,ts);
	}
	
	/**
	 * 改
	 */
	@Override
	public void execute_update(T... ts) {
		this.update(UPDATE,ts);
	}

	
}
