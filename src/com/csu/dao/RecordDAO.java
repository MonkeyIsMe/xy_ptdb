package com.csu.dao;

import java.util.List;

import com.csu.entity.Record;

public interface RecordDAO {
	
	public boolean add(Record r);
	
	public boolean update(Record r);
	
	public boolean delete(Record r);
	
	public List<Record> Query();
	
	public Record queryRecordById(int id);
	
	public List<Record> queryRecordListByPatientId(int patientId);
}
