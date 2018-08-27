package com.csu.dao;

import java.util.List;

import com.csu.entity.ItemTopic;
import com.csu.entity.Items;
import com.csu.entity.ScaleItem;

public interface ScaleDAO {
	
	public boolean addItems(Items item);
	
	public boolean deleteItems(Items item);
	
	public boolean updateItems(Items item);
	
	public List<Items> queryItems();
	
	public boolean addItemTopic(ItemTopic it);
	
	public boolean deleteItemTopic(ItemTopic it);
	
	public boolean updateItemTopic(ItemTopic it);
	
	public List<ItemTopic> queryItemTopic();
	
	public boolean addScaleItem(ScaleItem si);
	
	public boolean updateScaleItem(ScaleItem si);
	
	public boolean deleteScaleItem(ScaleItem si);
	
	public List<ScaleItem> queryScaleItem();
	
	public List<ScaleItem> queryScaleItemById(int s_ID);
	
	public ScaleItem queryScaleItem(int I_ID);
	
	public List<ScaleItem> queryScaleItemByFactor(int s_ID,int I_Factor);
	
	public List<ScaleItem> queryScaleItemByPageSid(int i,int pagesize,int s_ID);
}
