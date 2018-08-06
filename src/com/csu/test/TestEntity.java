package com.csu.test;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import com.csu.entity.*;
import com.csu.utils.HibernateUtil;

public class TestEntity {
	
	@Test
	public void getAll() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from Assay";
		Query query = s.createQuery(hql);
		List<Assay> list = query.list();
		for(Assay in : list) {
			System.out.println(in.toString());
		}
	} 
	
	@Test
	public void getPatientInfo() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from PatientInfo";
		Query query = s.createQuery(hql);
		List<PatientInfo> list = query.list();
		for(PatientInfo pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getReport() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from Report";
		Query query = s.createQuery(hql);
		List<Report> list = query.list();
		for(Report pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getDept() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from Dept";
		Query query = s.createQuery(hql);
		List<Dept> list = query.list();
		System.out.println(list.size());
		for(Dept pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getMetalScale() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from MentalScale";
		Query query = s.createQuery(hql);
		List<MentalScale> list = query.list();
		System.out.println(list.size());
		for(MentalScale ms :list) {
			System.out.println(ms.toString());
		}
	}
	
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from MentalScale";
		Query query = s.createQuery(hql);
		List<MentalScale> list = query.list();
		System.out.println(list.size());
		for(MentalScale ms :list) {
			System.out.println(ms.toString());
		}
	}
	
	@Test
	public void getItems() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from Items";
		Query query = s.createQuery(hql);
		List<Items> list = query.list();
		System.out.println(list.size());
		for(Items ms :list) {
			System.out.println(ms.toString());
		}
	}
	
	@Test
	public void getRefer() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from Reference";
		Query query = s.createQuery(hql);
		List<Reference> list = query.list();
		for(Reference pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getScaleItem() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from ScaleItem";
		Query query = s.createQuery(hql);
		List<ScaleItem> list = query.list();
		System.out.println(list.size());
		for(ScaleItem pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getFileInfo() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from FileInfo";
		Query query = s.createQuery(hql);
		List<FileInfo> list = query.list();
		System.out.println(list.size());
		for(FileInfo pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getChoice() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from Choice";
		Query query = s.createQuery(hql);
		List<Choice> list = query.list();
		System.out.println(list.size());
		for(Choice pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getFactor() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from Factor";
		Query query = s.createQuery(hql);
		List<Factor> list = query.list();
		System.out.println(list.size());
		for(Factor pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getDiagType() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from DiagType";
		Query query = s.createQuery(hql);
		List<DiagType> list = query.list();
		System.out.println(list.size());
		for(DiagType pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getDiagName() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from DiagName";
		Query query = s.createQuery(hql);
		List<DiagName> list = query.list();
		System.out.println(list.size());
		for(DiagName pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getDiagClass() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from DiagClass";
		Query query = s.createQuery(hql);
		List<DiagClass> list = query.list();
		System.out.println(list.size());
		for(DiagClass pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getSysUser() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from SysUser";
		Query query = s.createQuery(hql);
		List<SysUser> list = query.list();
		System.out.println(list.size());
		for(SysUser pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getUserMsg() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from UserMsg";
		Query query = s.createQuery(hql);
		List<UserMsg> list = query.list();
		System.out.println(list.size());
		for(UserMsg pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getRoleMenu() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from RoleMenu";
		Query query = s.createQuery(hql);
		List<RoleMenu> list = query.list();
		System.out.println(list.size());
		for(RoleMenu pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getRolePermission() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from RolePermission";
		Query query = s.createQuery(hql);
		List<RolePermission> list = query.list();
		System.out.println(list.size());
		for(RolePermission pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getUserRole() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from UserRole";
		Query query = s.createQuery(hql);
		List<UserRole> list = query.list();
		System.out.println(list.size());
		for(UserRole pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getRecord() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from Record";
		Query query = s.createQuery(hql);
		List<Record> list = query.list();
		System.out.println(list.size());
		for(Record pi : list) {
			System.out.println(pi.toString());
		}
	}
	
	@Test
	public void getSpecimen() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from Specimen";
		Query query = s.createQuery(hql);
		List<Specimen> list = query.list();
		System.out.println(list.size());
		for(Specimen pi : list) {
			System.out.println(pi.toString());
		}
	}
}
