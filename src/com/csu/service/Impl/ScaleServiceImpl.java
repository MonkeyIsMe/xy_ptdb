package com.csu.service.Impl;

import java.util.List;

import com.csu.dao.ChoiceDAO;
import com.csu.dao.ResultDAO;
import com.csu.dao.ScaleDAO;
import com.csu.dao.impl.ChoiceDAOImpl;
import com.csu.dao.impl.ResultDAOImpl;
import com.csu.dao.impl.ScaleDAOImpl;
import com.csu.entity.Choice;
import com.csu.entity.ScaleItem;
import com.csu.entity.SubChoice;
import com.csu.entity.Tresult;
import com.csu.service.ScaleService;

public class ScaleServiceImpl implements ScaleService{

	@Override
	public void deleteItem(int id) {
		// TODO Auto-generated method stub
		
		//1.
		ResultDAO rd = new ResultDAOImpl();
		List<Tresult> tresult = rd.queryTresultById(id);
		for(Tresult list : tresult) {
			rd.deleteTresult(list);
		}
		
		//2.
		ScaleDAO sd = new ScaleDAOImpl();
		List<ScaleItem> si = sd.queryScaleItemById(id);
		for(ScaleItem list : si) {
			sd.deleteScaleItem(list);
		}
		
		//3.
		ChoiceDAO cd = new ChoiceDAOImpl();
		List<Choice> ChoiceList = cd.getChoiceById(id);
		for(Choice ch : ChoiceList) {
			cd.deleteChoice(ch);
		}
		
		//4.
		List<SubChoice> SubChoiceList = cd.QuerySubChoiceById(id);
		for(SubChoice sub : SubChoiceList) {
			cd.deleteSubChoice(sub);
		}
	}

}
