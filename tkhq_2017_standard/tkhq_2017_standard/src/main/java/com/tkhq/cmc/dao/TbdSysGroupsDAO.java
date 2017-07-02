package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.model.TbdSysGroups;

public interface TbdSysGroupsDAO {

	TbdSysGroups getByGroupId(int groupId);

	List<TbdSysGroups> listGroup();

	void deleteAll();
	
	void update(TbdSysGroups entity);
	
}
