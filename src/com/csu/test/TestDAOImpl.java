package com.csu.test;

import java.util.List;

import org.junit.Test;

import com.csu.dao.AssayDAO;
import com.csu.dao.FileInfoDAO;
import com.csu.dao.KindDAO;
import com.csu.dao.MentalScaleDAO;
import com.csu.dao.PatientInfoDAO;
import com.csu.dao.RecordDAO;
import com.csu.dao.ReportDAO;
import com.csu.dao.ResultDAO;
import com.csu.dao.SpecimenDAO;
import com.csu.dao.impl.AssayDAOImpl;
import com.csu.dao.impl.FileInfoDAOImpl;
import com.csu.dao.impl.KindDAOImpl;
import com.csu.dao.impl.MentalScaleDAOImpl;
import com.csu.dao.impl.PatientInfoDAOImpl;
import com.csu.dao.impl.RecordDAOImpl;
import com.csu.dao.impl.ReportDAOImpl;
import com.csu.dao.impl.ResultDAOImpl;
import com.csu.dao.impl.SpecimenDAOImpl;
import com.csu.entity.*;

public class TestDAOImpl {
	
	@Test
	public void getAssayById() {
		int userid = 49;
		AssayDAO ad = new AssayDAOImpl();
		List<Assay> list = ad.getAssayById(userid);
		for(Assay assay : list) {
			System.out.println(assay.toString());
		}
	}
	
	@Test
	public void getPatientInfo() {
		int userid = 49;
		PatientInfoDAO pid = new PatientInfoDAOImpl();
		List<PatientInfo> list = pid.getPatientInfo(userid);
		for(PatientInfo assay : list) {
			System.out.println(assay.toString());
		}
	}
	
	@Test
	public void queryRecordById() {
		int id = 1;
		RecordDAO rd = new RecordDAOImpl();
		Record r = rd.queryRecordById(id);
		System.out.println(r.toString());
	}
	
	@Test
	public void queryRecordListByPatientId() {
		int id = 41;
		RecordDAO rd = new RecordDAOImpl();
		List<Record> r = rd.queryRecordListByPatientId(id);
		for(Record re : r) {
			System.out.println(re.toString());
		}
	}
	
	@Test 
	public void queryResultsByRecordId() {
		int id = 0;
		ResultDAO rd = new ResultDAOImpl();
		List<Result> list = rd.queryResultsByRecordId(id);
		for(Result r : list) {
			System.out.println(r.toString());
		}
	}
	
	@Test
	public void getSpecimenByUid() {
		int id = 70;
		SpecimenDAO sd = new SpecimenDAOImpl();
		List<Specimen> sp = sd.getSpecimenByUid(id);
		for(Specimen list : sp) {
			System.out.println(list.toString());
		}
	}
	
	@Test
	public void getFileByUid() {
		int uid = 64;
		FileInfoDAO fid = new FileInfoDAOImpl();
		List<FileInfo> fi = fid.getFileByUid(uid);
		for(FileInfo list : fi) {
			System.out.println(list.toString());
		}
	}
	
	@Test
	public void getSkindsByfid() {
		int fid = 6;
		KindDAO kd = new KindDAOImpl();
		List<Skind> sk = kd.getSkindsByfid(fid);
		for(Skind list : sk) {
			System.out.println(list.toString());
		}
	}
	
	@Test 
	public void queryReportById() {
		int id = 1099;
		ReportDAO rd = new ReportDAOImpl();
		Report re = rd.queryReportById(id);
		System.out.println(re.toString());
	}
	
	@Test
	public void checkSname() {
		String name = "90ÏîÖ¢×´Çåµ¥";
		MentalScaleDAO msd = new MentalScaleDAOImpl();
		boolean flag = msd.checkSname(name);
		System.out.println(flag);
	}
	
}
