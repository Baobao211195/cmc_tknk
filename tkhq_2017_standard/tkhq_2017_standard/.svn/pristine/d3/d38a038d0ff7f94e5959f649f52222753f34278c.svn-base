package com.tkhq.cmc.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbdSysLogSessionDAO;
import com.tkhq.cmc.dao.Tbs_Haiquan_KTTXNKDAO;
import com.tkhq.cmc.model.TbdSysLogSession;
import com.tkhq.cmc.model.TbdSysUsers;
import com.tkhq.cmc.model.Tbs_Haiquan_KTTXNK;
import com.tkhq.cmc.services.Tbd_sys_userService;
import com.tkhq.cmc.services.Tbs_Haiquan_KTTXNKService;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private Tbd_sys_userService userService;
	
	@Autowired 
	private TbdSysLogSessionDAO tbdSysLogSessionDAO;
	
	@Autowired
	private Tbs_Haiquan_KTTXNKService tbsHaiquansService;

	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		TbdSysUsers user = userService.findUserByUserName(username);
		
		if(user == null){
			throw new UsernameNotFoundException("Username not found");
		}
		if(user.getActive()== 0){
			throw new UsernameNotFoundException("Username not active");
		}
		
		try {
			TbdSysLogSession entity = new TbdSysLogSession();
			
			tbdSysLogSessionDAO.insert(username);
			System.out.println(entity.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		UserDetails userDetails = null;
		
		String maCuc = null;
		String maChiCuc = null;
		
		Tbs_Haiquan_KTTXNK tbsHaiquan = tbsHaiquansService.getHQByMa(user.getMaHq());
		if(tbsHaiquan.getCap()<=2){
			maCuc = tbsHaiquan.getMa();
		}else{
			maChiCuc = tbsHaiquan.getMa();
			maCuc=tbsHaiquan.getMaHQCT();
		}
		
		userDetails = new CustomUserDetails(user, maCuc, maChiCuc, authorities(user));

		return userDetails;
		
		
//		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
//				 authorities(user));
	}
	
	private List<GrantedAuthority> authorities(TbdSysUsers user){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		List<String> roles = userService.getRole(user.getUserId(), user.getGroupId()==null?-1:user.getGroupId());
		if(roles !=null){
			for (String role : roles) {
				authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
			}
		}
		authorities.add(new SimpleGrantedAuthority("ROLE_" + "USER"));
		
		return authorities;
	}
	
//	private List<String> convertRoleType(List<Integer> listFunction){
//		
//		final String hasAuthority ="hasAuthority";
//		List<String> test = new ArrayList<>();
//		listFunction = userService.getListFuction();
//		for(int i=0; i<listFunction.size();i++){
//			test.add(hasAuthority +"(" +convert(fucntionIdToString) +")");
//			convert(fucntionIdToString);
//		}
//		return test;
//	}
	
}
