package com.csu.dao;

import java.util.List;

import com.csu.entity.Menu;

public interface MenuDAO {
	
	public boolean add(Menu menu);
	
	public boolean delete(Menu menu);
	
	public boolean update(Menu menu);
	
	public List<Menu> query();
}
