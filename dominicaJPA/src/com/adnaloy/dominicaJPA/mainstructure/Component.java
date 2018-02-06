package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the COMPONENT database table.
 * 
 */
@Entity
@Table(name="COMPONENT")
@NamedQuery(name="Component.findAll", query="SELECT c FROM Component c")
public class Component implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COMPONENT_TABLEKEY_GENERATOR", sequenceName="DOMINICA_SQCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMPONENT_TABLEKEY_GENERATOR")
	@Column(name="TABLE_KEY")
	private long tableKey;

	@Column(name="EJBNAME")
	private String ejbname;

	@Column(name="NAME")
	private String name;

	public Component() {
	}

	public long getTableKey() {
		return this.tableKey;
	}

	public void setTableKey(long tableKey) {
		this.tableKey = tableKey;
	}

	public String getEjbname() {
		return this.ejbname;
	}

	public void setEjbname(String ejbname) {
		this.ejbname = ejbname;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}