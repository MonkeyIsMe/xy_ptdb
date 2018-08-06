package com.csu.dao;

import java.util.ArrayList;
import java.util.List;

import com.csu.entity.Result;
import com.csu.entity.Tresult;
import com.csu.entity.Uresult;

public interface ResultDAO {
	
	public boolean addResult(Result result);
	
	public boolean updateResult(Result result);
	
	public boolean deleteResult(Result result);
	
	public List<Result> queryResult();
	
	public boolean addUresult(Uresult result);
	
	public boolean updateUresult(Uresult result);
	
	public boolean deleteUresult(Uresult result);
	
	public List<Uresult> queryUresult();
	
	public boolean addTresult(Tresult result);
	
	public boolean updateTresult(Tresult result);
	
	public boolean deleteTresult(Tresult result);
	
	public List<Tresult> queryTresult();
	
	public List<Result> queryResultsByRecordId(int recordId);
}
