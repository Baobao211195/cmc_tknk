package com.tkhq.cmc.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.tkhq.cmc.model.TbdSysUsers;

public class CustomUserDetails extends User {

	private TbdSysUsers user;

	private String maCuc;

	private String maChiCuc;

	public CustomUserDetails(TbdSysUsers user, String maCuc, String maChiCuc,
			Collection<? extends GrantedAuthority> authorities) {
		super(user.getUsername(), user.getPassword(), authorities);
		this.user = user;
		this.maCuc = maCuc;
		this.maChiCuc = maChiCuc;
	}

	public CustomUserDetails(TbdSysUsers user,String maCuc, String maChiCuc, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(user.getUsername(), user.getPassword(), enabled,
				accountNonExpired, credentialsNonExpired, accountNonLocked,
				authorities);
		this.user = user;
		this.maCuc = maCuc;
		this.maChiCuc = maChiCuc;
	}

	public TbdSysUsers getUser() {
		return user;
	}

	public String getMaCuc() {
		return maCuc;
	}

	public String getMaChiCuc() {
		return maChiCuc;
	}

}
