package com.csu.dao;

import java.util.List;

import com.csu.entity.MentalScale;

public interface MentalScaleDAO {
	
	public boolean add(MentalScale ms);
	
	public boolean delete(MentalScale ms);
	
	public boolean update(MentalScale ms);
	
	public List<MentalScale> query();
}
