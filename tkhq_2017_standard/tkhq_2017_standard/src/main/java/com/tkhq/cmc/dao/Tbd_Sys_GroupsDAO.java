package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.model.TbdSysGroups;

public interface Tbd_Sys_GroupsDAO {

		List<TbdSysGroups> getAllGroups();
		void insertNewGroup(TbdSysGroups tbdSysGroups) throws Exception;
		TbdSysGroups findGroupsById(Integer groupId);	
		void updateTbd_sysGroups(TbdSysGroups tbdSysGroups);	
		void deleteById(Integer groupId);
		TbdSysGroups findGroupsByCode(String groupCode);	
		List<TbdSysGroups> searchGroup(String groupCode, String groupName );
		
}
