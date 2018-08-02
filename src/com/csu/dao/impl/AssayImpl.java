package com.csu.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.csu.dao.AssayDAO;
import com.csu.entity.Assay;
import com.csu.utils.HibernateUtil;


public class AssayImpl implements AssayDAO{

	@Override
	public boolean add(Assay assay) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.save(assay);
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
	public boolean delete(Assay assay) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.delete(assay);
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
	public boolean Update(Assay assay) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.update(assay);
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
	public List<Assay> getAssay() {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<Assay> list = null;
		
		try {
			session.beginTransaction();
			String hql = "from Assay";
			Query query = session.createQuery(hql);
			list = query.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		return list;
	}

}
