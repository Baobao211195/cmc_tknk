package com.tkhq.cmc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TBD_SYS_GROUPS")
public class TbdSysGroups  {
	
    /**
	 * 
	 */
	@Id
	@NotNull
	@GenericGenerator(name="sysGroupSeq" , strategy="increment")
    @GeneratedValue(generator="sysGroupSeq")
	@Column(name = "GROUP_ID")
    private Integer groupId;
    
    @Column(name = "GROUP_CODE")
    private String groupCode;
    
    @Column(name = "GROUP_NAME")
    private String groupName;
    
    @Column(name = "DESCRIPTION")
    private String description;

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
    
}
