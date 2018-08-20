package com.csu.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.csu.dao.MentalScaleDAO;
import com.csu.entity.MentalScale;
import com.csu.utils.HibernateUtil;

public class MentalScaleDAOImpl implements MentalScaleDAO{

	@Override
	public boolean add(MentalScale ms) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.save(ms);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean delete(MentalScale ms) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.delete(ms);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean update(MentalScale ms) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.update(ms);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
			return false;
		}
		
		return true;
	}

	@Override
	public List<MentalScale> query() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<MentalScale> list = null;

		try {
			session.beginTransaction();
			String hql = "from MentalScale";
			Query query = session.createQuery(hql);
			list = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
			return list;
		}
		
		return list;
	}

	@Override
	public boolean checkSname(String s_name) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		boolean isExist = false;
		try {
			session.beginTransaction();
			String sql = "select * from tab_mentalscale where s_name='"+s_name+"'";
			Query query = session.createSQLQuery(sql);
			List<MentalScale> ms = query.list();
			if(ms.size() != 0 ) isExist = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
			return isExist;
		}
		
		return isExist;
	}

	@Override
	public List<MentalScale> queryByPage(int i, int pagesize) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<MentalScale> list = null;

		try {
			session.beginTransaction();
			String hql = "from MentalScale";
			Query query = session.createQuery(hql);
			query.setFirstResult(i);
			query.setMaxResults(pagesize);
			list = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
			return list;
		}
		
		return list;
	}

	@Override
	public List<MentalScale> getMentalScaleBySkid(int sk_id) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<MentalScale> list = null;

		try {
			session.beginTransaction();
			String hql = "from MentalScale where sk_id = :sk_id";
			Query query = session.createQuery(hql);
			query.setParameter("sk_id", sk_id);
			list = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
			return list;
		}
		
		return list;
	}

	@Override
	public MentalScale getMentalScaleById(int S_ID) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		MentalScale result = null;
		
		try {
			session.beginTransaction();
			result = session.get(MentalScale.class, S_ID);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return result;
		}
		
		return result;
	}

}
