package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PAGE_META database table.
 * 
 */
@Entity
@Table(name="PAGE_META")
@NamedQuery(name="PageMeta.findAll", query="SELECT p FROM PageMeta p")
public class PageMeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PAGE_META_TABLEKEY_GENERATOR", sequenceName="DOMINICA_SQCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PAGE_META_TABLEKEY_GENERATOR")
	@Column(name="TABLE_KEY")
	private long tableKey;

	@Column(name="META")
	private String meta;

	//bi-directional many-to-one association to Page
	@ManyToOne
	@JoinColumn(name="PAGE")
	private Page pageBean;

	public PageMeta() {
	}

	public long getTableKey() {
		return this.tableKey;
	}

	public void setTableKey(long tableKey) {
		this.tableKey = tableKey;
	}

	public String getMeta() {
		return this.meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public Page getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(Page pageBean) {
		this.pageBean = pageBean;
	}

}