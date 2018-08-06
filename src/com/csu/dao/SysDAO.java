package com.csu.dao;

import java.util.List;

import com.csu.entity.SysUser;
import com.csu.entity.SysUserTopic;

public interface SysDAO {
	
	public boolean addSysUser(SysUser su);
	
	public boolean deleteSysUser(SysUser su);
	
	public boolean updateSysUser(SysUser su);
	
	public List<SysUser> querySysUser();
	
	public boolean addSysUserTopic(SysUserTopic sut);
	
	public boolean deleteSysUserTopic(SysUserTopic sut);
	
	public boolean updateSysUserTopic(SysUserTopic sut);
	
	public List<SysUserTopic> querySysUserTopic();
}
