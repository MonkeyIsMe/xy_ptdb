package com.csu.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.csu.dao.PatientInfoDAO;
import com.csu.entity.Assay;
import com.csu.entity.PatientInfo;
import com.csu.utils.HibernateUtil;

public class PatientInfoDAOImpl implements PatientInfoDAO{

	@Override
	public boolean add(PatientInfo pi) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.save(pi);
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
	public boolean update(PatientInfo pi) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.update(pi);
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
	public boolean delete(PatientInfo pi) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.delete(pi);
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
	public List<PatientInfo> getAllPatientInfo() {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<PatientInfo> list = null;
		
		try {
			session.beginTransaction();
			String hql = "from PatientInfo";
			Query query = session.createQuery(hql);
			list = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return list;
		}
		
		return list;
	}

	@Override
	public List<PatientInfo> getPatientInfo(int u_id) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<PatientInfo> list = null;
		
		try {
			session.beginTransaction();
			String hql = "from PatientInfo where u_id = :u_id";
			Query query = session.createQuery(hql);
			query.setParameter("u_id", u_id);
			list = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return list;
		}
		return list;
	}

}
