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
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 *
 * @author Admin
 */
@Entity
@Table(name = "TBD_SYS_FUNCTIONS")

public class Tbd_Sys_Functions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FUNCTION_ID")
    private Integer functionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "FUNCTION_NAME")
    private String functionName;
    @Column(name = "PARENT_ID")
    private Integer parentId;

    public Tbd_Sys_Functions() {
    }

    public Tbd_Sys_Functions(Integer functionId) {
        this.functionId = functionId;
    }

    public Tbd_Sys_Functions(Integer functionId, String functionName) {
        this.functionId = functionId;
        this.functionName = functionName;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (functionId != null ? functionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbd_Sys_Functions)) {
            return false;
        }
        Tbd_Sys_Functions other = (Tbd_Sys_Functions) object;
        if ((this.functionId == null && other.functionId != null) || (this.functionId != null && !this.functionId.equals(other.functionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbdSysFunctions[ functionId=" + functionId + " ]";
    }
    
}
