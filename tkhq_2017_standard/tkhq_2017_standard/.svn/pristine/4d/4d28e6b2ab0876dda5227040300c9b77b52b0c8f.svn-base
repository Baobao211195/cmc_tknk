package com.tkhq.cmc.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tkhq.cmc.dao.Tbd_Sys_GroupsDAO;
import com.tkhq.cmc.model.TbdSysGroups;

@Service("tbd_sys_GroupService")
@Transactional
public class Tbd_sys_GroupsServiceImpl implements Tbd_sys_GroupsService {

	@Autowired
	Tbd_Sys_GroupsDAO tbd_sys_groupsDAO;
	
	public List<TbdSysGroups> getAllGroups() {		
		return tbd_sys_groupsDAO.getAllGroups();
	}

	public void insertNewGroup(TbdSysGroups tbdSysGroups) throws Exception {
		tbd_sys_groupsDAO.insertNewGroup(tbdSysGroups);
		
	}

	public TbdSysGroups findGroupsById(Integer groupId) {
		
		return tbd_sys_groupsDAO.findGroupsById(groupId);
	}

	public void updateTbd_sysGroups(TbdSysGroups tbdSysGroups) {
		tbd_sys_groupsDAO.updateTbd_sysGroups(tbdSysGroups);
	}

	public void deleteById(Integer groupId) {
		tbd_sys_groupsDAO.deleteById(groupId);
	}

	public TbdSysGroups findGroupsByCode(String groupCode) {
		// TODO Auto-generated method stub
		return tbd_sys_groupsDAO.findGroupsByCode(groupCode);
	}

	@Override
	public List<TbdSysGroups> searchGroup( String groupCode,
			String groupName) {
		
		return tbd_sys_groupsDAO.searchGroup(groupCode,groupName);
	}
	

}
