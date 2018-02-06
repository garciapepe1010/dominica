package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PAGE_ALIAS database table.
 * 
 */
@Entity
@Table(name="PAGE_ALIAS")
@NamedQuery(name="PageAlia.findAll", query="SELECT p FROM PageAlia p")
public class PageAlia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PAGE_ALIAS_TABLEKEY_GENERATOR", sequenceName="DOMINICA_SQCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PAGE_ALIAS_TABLEKEY_GENERATOR")
	@Column(name="TABLE_KEY")
	private long tableKey;

	@Column(name="URL")
	private String url;

	//bi-directional many-to-one association to Page
	@ManyToOne
	@JoinColumn(name="PAGE")
	private Page pageBean;

	public PageAlia() {
	}

	public long getTableKey() {
		return this.tableKey;
	}

	public void setTableKey(long tableKey) {
		this.tableKey = tableKey;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Page getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(Page pageBean) {
		this.pageBean = pageBean;
	}

}