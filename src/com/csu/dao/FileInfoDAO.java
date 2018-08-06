package com.csu.dao;

import java.util.List;

import com.csu.entity.FileInfo;

public interface FileInfoDAO {
	
	public boolean add(FileInfo fi);
	
	public boolean delete(FileInfo fi);
	
	public boolean update(FileInfo fi);
	
	public List<FileInfo> query();
	
	public List<FileInfo> getFileByUid(int userID);
}
