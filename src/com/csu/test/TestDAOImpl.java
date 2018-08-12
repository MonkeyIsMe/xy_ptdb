package com.csu.test;

import java.util.List;

import org.junit.Test;

import com.csu.dao.AssayDAO;
import com.csu.dao.ChoiceDAO;
import com.csu.dao.FactorDAO;
import com.csu.dao.FileInfoDAO;
import com.csu.dao.KindDAO;
import com.csu.dao.MentalScaleDAO;
import com.csu.dao.PatientInfoDAO;
import com.csu.dao.RecordDAO;
import com.csu.dao.ReferenceDAO;
import com.csu.dao.ReportDAO;
import com.csu.dao.ResultDAO;
import com.csu.dao.ScaleDAO;
import com.csu.dao.SpecimenDAO;
import com.csu.dao.SysDAO;
import com.csu.dao.impl.AssayDAOImpl;
import com.csu.dao.impl.ChoiceDAOImpl;
import com.csu.dao.impl.FactorDAOImpl;
import com.csu.dao.impl.FileInfoDAOImpl;
import com.csu.dao.impl.KindDAOImpl;
import com.csu.dao.impl.MentalScaleDAOImpl;
import com.csu.dao.impl.PatientInfoDAOImpl;
import com.csu.dao.impl.RecordDAOImpl;
import com.csu.dao.impl.ReferenceDAOImpl;
import com.csu.dao.impl.ReportDAOImpl;
import com.csu.dao.impl.ResultDAOImpl;
import com.csu.dao.impl.ScaleDAOImpl;
import com.csu.dao.impl.SpecimenDAOImpl;
import com.csu.dao.impl.SysDAOImpl;
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
	
	@Test
	public void getUserTopic() {
		String account = "124712104";
		SysDAO sd = new SysDAOImpl();
		List list = sd.getUserTopic(account);
		for(int i = 0 ; i < list.size(); i ++) {
			Object[] obj = (Object[]) list.get(i);
			System.out.println(obj[0]+" "+obj[1]);
		}
	}
	
	@Test
	public void getPatientByPage() {
		int i = 0;
		int pagesize = 5;
		PatientInfoDAO pid = new PatientInfoDAOImpl();
		List<PatientInfo> list = pid.getPatientByPage(i, pagesize);
		for(PatientInfo pa : list) {
			System.out.println(pa.toString());
		}
	}
	
	@Test
	public void QueryByPage() {
		int i = 0;
		int pagesize = 5;
		MentalScaleDAO msd = new MentalScaleDAOImpl();
		List<MentalScale> list = msd.queryByPage(i, pagesize);
		for(MentalScale ms : list) {
			System.out.println(ms.toString());
		}
	}
	
	@Test
	public void getRefer() {
		int sid = 3;
		int fid = 1;
		ReferenceDAO rd = new ReferenceDAOImpl();
		List<Reference> list = rd.getRefer(sid, fid);
		System.out.println(list.size());
		for(Reference refer : list) {
			System.out.println(refer.toString());
		}
	}
	
	@Test
	public void getFactorsBySid() {
		int sid = 3;
		FactorDAO fd = new FactorDAOImpl();
		List<Factor> fa = fd.getFactorsBySid(sid);
		for(Factor list : fa) {
			System.out.println(list.toString());
		}
	}
	
	@Test
	public void queryScaleItemByPageSid() {
		int i = 0;
		int pagesize = 5;
		int sid = 3;
		ScaleDAO sd = new ScaleDAOImpl();
		List<ScaleItem> list = sd.queryScaleItemByPageSid(i, pagesize, sid);
		for(ScaleItem si : list) {
			System.out.println(si.toString());
		}
	}
	
	@Test
	public void getMentalScaleBySkid() {
		int sk_id = 11;
		MentalScaleDAO msd = new MentalScaleDAOImpl();
		List<MentalScale> list = msd.getMentalScaleBySkid(sk_id);
		for(MentalScale ms : list) {
			System.out.println(ms.toString());
		}
	}
	
	@Test
	public void queryFkind() {
		int id = 12;
		KindDAO kd = new KindDAOImpl();
		Fkind fk= kd.queryFkindById(id);
		System.out.println(fk.toString());
	}
	
	@Test
	public void getChoiceById() {
		int id = 5;
		ChoiceDAO cd = new ChoiceDAOImpl();
		List<Choice> ch = cd.getChoiceById(id);
		for(Choice list : ch) {
			System.out.println(list.toString());
		}
	}
	
	@Test
	public void getSubChoiceById() {
		int id = 1;
		ChoiceDAO cd = new ChoiceDAOImpl();
		List<SubChoice> sub = cd.QuerySubChoiceById(id);
		for(SubChoice cs :sub) {
			System.out.println(cs.toString());
		}
	}
	
	@Test
	public void queryRecord() {
		RecordDAO rd = new RecordDAOImpl();
		List<Record> record = rd.Query();
		for(Record r : record) {
			System.out.println(r.toString());
		}
	}
	
}
