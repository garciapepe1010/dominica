package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the PAGE database table.
 * 
 */
@Entity
@Table(name="PAGE")
@NamedQuery(name="Page.findAll", query="SELECT p FROM Page p")
public class Page implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PAGE_TABLEKEY_GENERATOR", sequenceName="DOMINICA_SQCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PAGE_TABLEKEY_GENERATOR")
	@Column(name="TABLE_KEY")
	private long tableKey;

	@Column(name="ACTIVE")
	private BigDecimal active;

	@Column(name="BREADCRUMB")
	private String breadcrumb;

	@Column(name="IS_DEFAULT")
	private BigDecimal isDefault;

	@Column(name="NAME")
	private String name;

	@Column(name="SECTION")
	private BigDecimal section;

	@Column(name="URL")
	private String url;

	@Column(name="URL_PATTERN")
	private String urlPattern;

	@Column(name="VERSION")
	private BigDecimal version;

	//bi-directional many-to-one association to Template
	@ManyToOne
	@JoinColumn(name="TEMPLATE")
	private Template templateBean;

	//bi-directional many-to-one association to PageAlia
	@OneToMany(mappedBy="pageBean")
	private List<PageAlia> pageAlias;

	//bi-directional many-to-one association to PageMeta
	@OneToMany(mappedBy="pageBean")
	private List<PageMeta> pageMetas;

	public Page() {
	}

	public long getTableKey() {
		return this.tableKey;
	}

	public void setTableKey(long tableKey) {
		this.tableKey = tableKey;
	}

	public BigDecimal getActive() {
		return this.active;
	}

	public void setActive(BigDecimal active) {
		this.active = active;
	}

	public String getBreadcrumb() {
		return this.breadcrumb;
	}

	public void setBreadcrumb(String breadcrumb) {
		this.breadcrumb = breadcrumb;
	}

	public BigDecimal getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(BigDecimal isDefault) {
		this.isDefault = isDefault;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSection() {
		return this.section;
	}

	public void setSection(BigDecimal section) {
		this.section = section;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlPattern() {
		return this.urlPattern;
	}

	public void setUrlPattern(String urlPattern) {
		this.urlPattern = urlPattern;
	}

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public Template getTemplateBean() {
		return this.templateBean;
	}

	public void setTemplateBean(Template templateBean) {
		this.templateBean = templateBean;
	}

	public List<PageAlia> getPageAlias() {
		return this.pageAlias;
	}

	public void setPageAlias(List<PageAlia> pageAlias) {
		this.pageAlias = pageAlias;
	}

	public PageAlia addPageAlia(PageAlia pageAlia) {
		getPageAlias().add(pageAlia);
		pageAlia.setPageBean(this);

		return pageAlia;
	}

	public PageAlia removePageAlia(PageAlia pageAlia) {
		getPageAlias().remove(pageAlia);
		pageAlia.setPageBean(null);

		return pageAlia;
	}

	public List<PageMeta> getPageMetas() {
		return this.pageMetas;
	}

	public void setPageMetas(List<PageMeta> pageMetas) {
		this.pageMetas = pageMetas;
	}

	public PageMeta addPageMeta(PageMeta pageMeta) {
		getPageMetas().add(pageMeta);
		pageMeta.setPageBean(this);

		return pageMeta;
	}

	public PageMeta removePageMeta(PageMeta pageMeta) {
		getPageMetas().remove(pageMeta);
		pageMeta.setPageBean(null);

		return pageMeta;
	}

}