package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SECTION database table.
 * 
 */
@Entity
@Table(name="SECTION")
@NamedQuery(name="Section.findAll", query="SELECT s FROM Section s")
public class Section implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SECTION_TABLEKEY_GENERATOR", sequenceName="DOMINICA_SQCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SECTION_TABLEKEY_GENERATOR")
	@Column(name="TABLE_KEY")
	private long tableKey;

	@Column(name="IS_PUBLIC")
	private BigDecimal isPublic;

	@Column(name="NAME")
	private String name;

	@Column(name="URL")
	private String url;

	//bi-directional many-to-one association to Domain
	@ManyToOne
	@JoinColumn(name="DOMAIN")
	private Domain domainBean;

	public Section() {
	}

	public long getTableKey() {
		return this.tableKey;
	}

	public void setTableKey(long tableKey) {
		this.tableKey = tableKey;
	}

	public BigDecimal getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(BigDecimal isPublic) {
		this.isPublic = isPublic;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Domain getDomainBean() {
		return this.domainBean;
	}

	public void setDomainBean(Domain domainBean) {
		this.domainBean = domainBean;
	}

}