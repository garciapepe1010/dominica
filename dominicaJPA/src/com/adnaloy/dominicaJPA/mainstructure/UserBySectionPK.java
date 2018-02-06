package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the USER_BY_SECTION database table.
 * 
 */
@Embeddable
public class UserBySectionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="USER_SEC", insertable=false, updatable=false)
	private String userSec;

	@Column(name="SECTION")
	private long section;

	public UserBySectionPK() {
	}
	public String getUserSec() {
		return this.userSec;
	}
	public void setUserSec(String userSec) {
		this.userSec = userSec;
	}
	public long getSection() {
		return this.section;
	}
	public void setSection(long section) {
		this.section = section;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserBySectionPK)) {
			return false;
		}
		UserBySectionPK castOther = (UserBySectionPK)other;
		return 
			this.userSec.equals(castOther.userSec)
			&& (this.section == castOther.section);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userSec.hashCode();
		hash = hash * prime + ((int) (this.section ^ (this.section >>> 32)));
		
		return hash;
	}
}