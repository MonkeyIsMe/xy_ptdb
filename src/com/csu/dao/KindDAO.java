package com.csu.dao;

import java.util.List;

import com.csu.entity.Fkind;
import com.csu.entity.Skind;

public interface KindDAO {

	public boolean addFKind(Fkind fk);
	
	public boolean deleteFKind(Fkind fk);
	
	public boolean updateFKind(Fkind fk);
	
	public List<Fkind> queryFKind();
	
	public boolean addSKind(Skind sk);
	
	public boolean updateSKind(Skind sk);
	
	public boolean deleteSKind(Skind sk);
	
	public List<Skind> querySKind();
	
	public List<Skind> getSkindsByfid(int f_id);
}
