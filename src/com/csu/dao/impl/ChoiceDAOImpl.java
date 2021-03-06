package com.csu.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.csu.dao.ChoiceDAO;
import com.csu.entity.Choice;
import com.csu.entity.SubChoice;
import com.csu.utils.HibernateUtil;

public class ChoiceDAOImpl implements ChoiceDAO{

	@Override
	public boolean addChoice(Choice ch) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			session.save(ch);
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
	public boolean deleteChoice(Choice ch) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			session.delete(ch);
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
	public boolean updateChoice(Choice ch) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			session.update(ch);
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
	public List<Choice> QueryChoice() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<Choice> ch = null;
		try {
			session.beginTransaction();
			String hql = "from Choice";
			Query query = session.createQuery(hql);
			ch = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ch;
		}
		return ch;
	}

	@Override
	public boolean addSubChoice(SubChoice ch) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			session.save(ch);
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
	public boolean deleteSubChoice(SubChoice ch) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			session.delete(ch);
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
	public boolean updateSubChoice(SubChoice ch) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			session.update(ch);
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
	public List<SubChoice> QuerySubChoice() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<SubChoice> ch = null;
		try {
			session.beginTransaction();
			String hql = "from SubChoice";
			Query query = session.createQuery(hql);
			ch = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ch;
		}
		return ch;
	}

	@Override
	public List<Choice> getChoiceById(int I_id) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<Choice> list = null;
		
		try {
			session.beginTransaction();
			String hql = "From Choice where I_id = :I_id";
			Query query = session.createQuery(hql);
			query.setParameter("I_id", I_id);
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
	public List<SubChoice> QuerySubChoiceById(int I_ID) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<SubChoice> list = null;
		
		try {
			session.beginTransaction();
			String hql = "From SubChoice where I_ID = :I_ID";
			Query query = session.createQuery(hql);
			query.setParameter("I_ID", I_ID);
			list = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Choice> getChoice(int I_ID, int C_Num) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<Choice> list = null;
		try {
			session.beginTransaction();
			String hql = "From Choice where I_ID = ? and C_Num = ?";
			Query query = session.createQuery(hql);
			query.setParameter(0, I_ID);
            query.setParameter(1, C_Num);
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
