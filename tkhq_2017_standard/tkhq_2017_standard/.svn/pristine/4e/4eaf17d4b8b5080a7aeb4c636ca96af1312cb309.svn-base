/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tkhq.cmc.model;

import java.io.Serializable;



import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "TBD_SYS_USERS")

public class TbdSysUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
	@GenericGenerator(name="sysUserSeq" , strategy="increment")
    @GeneratedValue(generator="sysUserSeq")
    @Column(name = "USER_ID")
    private Integer userId;
    @Column(name = "GROUP_ID")
    private Integer groupId;
    @Size(max = 40)
    @Column(name = "USERNAME")
    private String userName;
    @Size(max = 255)
    @Column(name = "PASSWORD")
    private String password;
    @Size(max = 255)
    @Column(name = "USERDESCRIPTION")
    private String userdescription;
    @Size(max = 6)
    @Column(name = "MA_HQ")
    private String maHq;
    @Column(name = "ACTIVE")
    private Integer active;
    @Size(max = 30)
    @Column(name = "WORKSTATION")
    private String workstation;
    @Column(name = "IS_LANHDAO")
    private Integer isLanhdao;
    
    @Column(name = "EMAIL_HQ")
    private String emailHQ;
    
    @Column(name = "EMAIL_KHAC")
    private String emailKhac;
    
    @Column(name = "DIEN_THOAI")
    private String dienthoai;
    
    @Column(name = "DI_DONG")
    private String didong;

    @Column(name = "FULL_NAME")
    private String fullName;
    
    @Column(name = "CHUC_VU")
    private String chucvu;

	public String getEmailHQ() {
		return emailHQ;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailKhac() {
		return emailKhac;
	}

	public void setEmailKhac(String emailKhac) {
		this.emailKhac = emailKhac;
	}

	public String getDienthoai() {
		return dienthoai;
	}

	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}

	public String getDidong() {
		return didong;
	}

	public void setDidong(String didong) {
		this.didong = didong;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getChucvu() {
		return chucvu;
	}

	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setEmailHQ(String emailHQ) {
		this.emailHQ = emailHQ;
	}

	public TbdSysUsers() {
    }

    public TbdSysUsers(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserdescription() {
        return userdescription;
    }

    public void setUserdescription(String userdescription) {
        this.userdescription = userdescription;
    }

    public String getMaHq() {
        return maHq;
    }

    public void setMaHq(String maHq) {
        this.maHq = maHq;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getWorkstation() {
        return workstation;
    }

    public void setWorkstation(String workstation) {
        this.workstation = workstation;
    }

    public Integer getIsLanhdao() {
        return isLanhdao;
    }

    public void setIsLanhdao(Integer isLanhdao) {
        this.isLanhdao = isLanhdao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbdSysUsers)) {
            return false;
        }
        TbdSysUsers other = (TbdSysUsers) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbdSysUsers[ userId=" + userId + " ]";
    }
    
}
