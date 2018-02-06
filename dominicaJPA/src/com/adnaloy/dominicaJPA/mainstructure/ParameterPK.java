package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PARAMETERS database table.
 * 
 */
@Embeddable
public class ParameterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TABLE_KEY")
	private String tableKey;

	@Column(name="DOMAIN")
	private long domain;

	public ParameterPK() {
	}
	public String getTableKey() {
		return this.tableKey;
	}
	public void setTableKey(String tableKey) {
		this.tableKey = tableKey;
	}
	public long getDomain() {
		return this.domain;
	}
	public void setDomain(long domain) {
		this.domain = domain;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ParameterPK)) {
			return false;
		}
		ParameterPK castOther = (ParameterPK)other;
		return 
			this.tableKey.equals(castOther.tableKey)
			&& (this.domain == castOther.domain);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tableKey.hashCode();
		hash = hash * prime + ((int) (this.domain ^ (this.domain >>> 32)));
		
		return hash;
	}
}