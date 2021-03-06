package cn.itcast.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

import cn.itcast.crm.dao.BaseDictDao;
import cn.itcast.crm.domain.BaseDict;
import cn.itcast.crm.util.HibernateUtil;

public class BaseDictDaoImpl implements BaseDictDao {

	@Override
	public List<BaseDict> findBaseDictList(DetachedCriteria detachedCriteria) {
		Session session = HibernateUtil.openSession();
		//离线criteria与session绑定生成可执行criteria
		Criteria criteria = detachedCriteria.getExecutableCriteria(session);
		//使用二级缓存
		criteria.setCacheable(true);
		List list = criteria.list();
		return list;
	}

}
