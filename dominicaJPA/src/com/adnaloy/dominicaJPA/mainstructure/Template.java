package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TEMPLATE database table.
 * 
 */
@Entity
@Table(name="TEMPLATE")
@NamedQuery(name="Template.findAll", query="SELECT t FROM Template t")
public class Template implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TEMPLATE_TABLEKEY_GENERATOR", sequenceName="DOMINICA_SQCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TEMPLATE_TABLEKEY_GENERATOR")
	@Column(name="TABLE_KEY")
	private long tableKey;

	@Column(name="DOMAIN")
	private BigDecimal domain;

	@Column(name="NAME")
	private String name;

	//bi-directional many-to-one association to Page
	@OneToMany(mappedBy="templateBean")
	private List<Page> pages;

	public Template() {
	}

	public long getTableKey() {
		return this.tableKey;
	}

	public void setTableKey(long tableKey) {
		this.tableKey = tableKey;
	}

	public BigDecimal getDomain() {
		return this.domain;
	}

	public void setDomain(BigDecimal domain) {
		this.domain = domain;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Page> getPages() {
		return this.pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}

	public Page addPage(Page page) {
		getPages().add(page);
		page.setTemplateBean(this);

		return page;
	}

	public Page removePage(Page page) {
		getPages().remove(page);
		page.setTemplateBean(null);

		return page;
	}

}