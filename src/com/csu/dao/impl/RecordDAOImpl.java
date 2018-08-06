package com.csu.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.csu.dao.RecordDAO;
import com.csu.entity.Assay;
import com.csu.entity.Record;
import com.csu.utils.HibernateUtil;

public class RecordDAOImpl implements RecordDAO{

	@Override
	public boolean add(Record r) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.save(r);
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
	public boolean update(Record r) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.update(r);
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
	public boolean delete(Record r) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.delete(r);
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
	public List<Record> Query() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<Record> list = null;
		try {
			session.beginTransaction();
			String hql = "from Record";
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
	public Record queryRecordById(int id) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Record list = null;
		
		try {
			session.beginTransaction();
//			String hql = "from Record where id = :id";
//			Query query = session.createQuery(hql);
//			query.setParameter("id", id);
//			list = query.list();
			list = session.get(Record.class, id);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return list;
		}
		return list;
	}

	@Override
	public List<Record> queryRecordListByPatientId(int patientId) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<Record> list = null;
		
		try {
			session.beginTransaction();
			String hql = "from Record where patientId = :patientId";
			Query query = session.createQuery(hql);
			query.setParameter("patientId", patientId);
			list = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
