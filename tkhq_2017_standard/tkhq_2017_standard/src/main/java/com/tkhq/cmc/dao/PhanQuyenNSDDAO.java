package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.RoleGroup;
import com.tkhq.cmc.model.Tbd_Sys_Functions;

public interface PhanQuyenNSDDAO {

	List<RoleGroup> getListRoleByGroupId(int groupId);
	int updateRoleByGroup(int groupId,List<Tbd_Sys_Functions> roles);
	List<RoleGroup> getListRoleByUserId(int userId);
	int updateRoleByUserId(int userId,List<Tbd_Sys_Functions> roles);
	String nameFunction(int functionId);
}
