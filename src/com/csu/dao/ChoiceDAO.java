package com.csu.dao;

import java.util.List;

import com.csu.entity.Choice;
import com.csu.entity.SubChoice;

public interface ChoiceDAO {
	
	public boolean addChoice(Choice ch);
	
	public boolean deleteChoice(Choice ch);
	
	public boolean updateChoice(Choice ch);
	
	public List<Choice> QueryChoice();
	
	public List<Choice> getChoiceById(int I_id);
	
	public boolean addSubChoice(SubChoice ch);
	
	public boolean deleteSubChoice(SubChoice ch);
	
	public boolean updateSubChoice(SubChoice ch);
	
	public List<SubChoice> QuerySubChoice();
}
