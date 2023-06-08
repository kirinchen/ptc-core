package com.domi.ptc_core.model;

import java.util.Date;

public interface CreateUpdateInfo {

	public Date getUpdateAt() ;

	public void setUpdateAt(Date updateAt);

	public Date getCreateAt() ;

	public void setCreateAt(Date createAt) ;

	public String getEnvProfile();

	public void setEnvProfile(String envProfile);
	
}
