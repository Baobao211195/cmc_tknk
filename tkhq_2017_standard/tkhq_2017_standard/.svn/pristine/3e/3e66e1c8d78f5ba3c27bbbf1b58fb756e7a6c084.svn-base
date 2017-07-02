package com.tkhq.cmc.services;

import java.util.List;

import com.tkhq.cmc.dto.QuanLyToChucDTO;
import com.tkhq.cmc.dto.Tbd_sys_userDTO;
import com.tkhq.cmc.model.TbdSysUsers;

public interface Tbd_sys_userService {

	void insertNewUser(TbdSysUsers tbsSysUsers) throws Exception;
	TbdSysUsers findUserByUserName(String username);
	List<TbdSysUsers> getAllUser();
	void updateTbd_sysUsers(TbdSysUsers tbdSysUser);
	List<TbdSysUsers> searchUser(Integer active,String maHQ);
	void deleteByUserId(Integer userId);
	boolean checkLogin(String username,String password);
	List<String> getRole(int userId,int groupId);
	List<TbdSysUsers> searchByCondition(String username, String fullname, String donviHq,Integer groupid,Integer active);
	public List<QuanLyToChucDTO> searchUser(int groupId, int trangthai, String maCuc, String maChiCuc);
	boolean checkRoleBieu(final int ky, final int thang, final int quy,final int nam,final String trangthai,final String path);
	//List<Tbd_sys_userDTO> getAllFullName();
	int ketXuatBieu(int ky, int thang, int nam,String loai_BC, String path);
	
}
