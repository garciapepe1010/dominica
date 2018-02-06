package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the COMPONENT_COMPONENT database table.
 * 
 */
@Entity
@Table(name="COMPONENT_COMPONENT")
@NamedQuery(name="ComponentComponent.findAll", query="SELECT c FROM ComponentComponent c")
public class ComponentComponent implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ComponentComponentPK id;

	public ComponentComponent() {
	}

	public ComponentComponentPK getId() {
		return this.id;
	}

	public void setId(ComponentComponentPK id) {
		this.id = id;
	}

}