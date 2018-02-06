package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COMPONENT_COMPONENT database table.
 * 
 */
@Embeddable
public class ComponentComponentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="COMPONENT_PARENT")
	private long componentParent;

	@Column(name="COMPONENT_CHILD")
	private long componentChild;

	@Column(name="TABLE_ORDER")
	private long tableOrder;

	public ComponentComponentPK() {
	}
	public long getComponentParent() {
		return this.componentParent;
	}
	public void setComponentParent(long componentParent) {
		this.componentParent = componentParent;
	}
	public long getComponentChild() {
		return this.componentChild;
	}
	public void setComponentChild(long componentChild) {
		this.componentChild = componentChild;
	}
	public long getTableOrder() {
		return this.tableOrder;
	}
	public void setTableOrder(long tableOrder) {
		this.tableOrder = tableOrder;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ComponentComponentPK)) {
			return false;
		}
		ComponentComponentPK castOther = (ComponentComponentPK)other;
		return 
			(this.componentParent == castOther.componentParent)
			&& (this.componentChild == castOther.componentChild)
			&& (this.tableOrder == castOther.tableOrder);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.componentParent ^ (this.componentParent >>> 32)));
		hash = hash * prime + ((int) (this.componentChild ^ (this.componentChild >>> 32)));
		hash = hash * prime + ((int) (this.tableOrder ^ (this.tableOrder >>> 32)));
		
		return hash;
	}
}