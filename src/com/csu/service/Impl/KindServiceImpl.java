package com.csu.service.Impl;

import java.util.List;

import com.csu.dao.KindDAO;
import com.csu.dao.impl.KindDAOImpl;
import com.csu.entity.Fkind;
import com.csu.entity.Skind;
import com.csu.service.KindService;

public class KindServiceImpl implements KindService{

	@Override
	public boolean deleteDL(int f_id) {
		// TODO Auto-generated method stub
		boolean flag = false;
		boolean flagg = false;
		try {
			KindDAO kd = new KindDAOImpl();
			List<Skind> sk = kd.getSkindsByfid(f_id);
			Fkind fk = kd.queryFkindById(f_id);
			flag = kd.deleteFKind(fk);
			for(Skind list : sk) {
				flagg = kd.deleteSKind(list);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return flag;
		}
		return flag&&flagg;
		
	}

	@Override
	public boolean deleteXL(int sk_id) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			KindDAO kd = new KindDAOImpl();
			Fkind fk = kd.queryFkindById(sk_id);
			flag = kd.deleteFKind(fk);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return flag;
		}
		return flag;
		
	}
	
	
}
