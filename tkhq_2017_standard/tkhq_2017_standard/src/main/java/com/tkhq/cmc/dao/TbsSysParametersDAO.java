package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.model.TbdSysparameters;

public interface TbsSysParametersDAO {
	TbdSysparameters findParamById(int ma);
	List<TbdSysparameters> getAll();
	List<TbdSysparameters> Search(String ten_param,String giatri,String nguoi_capnhap,String ngay_capnhap);
	void  InsertParameters(TbdSysparameters paramters) throws Exception;
	void  DeleteParameters(int ma) ;
	void  UpdateParameters(TbdSysparameters paramters) ;
}
