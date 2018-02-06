package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the COMPONENT_DATA_ARRAY database table.
 * 
 */
@Entity
@Table(name="COMPONENT_DATA_ARRAY")
@NamedQuery(name="ComponentDataArray.findAll", query="SELECT c FROM ComponentDataArray c")
public class ComponentDataArray implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="COMPONENT_TABLEKEY_GENERATOR", sequenceName="DOMINICA_SQCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMPONENT_TABLEKEY_GENERATOR")
	@Column(name="TABLE_KEY")
	private BigDecimal tableKey;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_DATA")
	private Date dataData;

	@Column(name="DATA_NUMBER")
	private BigDecimal dataNumber;

	@Lob
	@Column(name="DATA_TEXT")
	private String dataText;

	@Column(name="DATA_TYPE")
	private String dataType;

	@Column(name="DATA_URL")
	private String dataUrl;

	@Column(name="DATA_VARCHAR")
	private String dataVarchar;

	

	//bi-directional many-to-one association to ComponentData
	@ManyToOne
	@JoinColumn(name="COMPONENT_DATA")
	private ComponentData componentDataBean;

	public ComponentDataArray() {
	}

	public Date getDataData() {
		return this.dataData;
	}

	public void setDataData(Date dataData) {
		this.dataData = dataData;
	}

	public BigDecimal getDataNumber() {
		return this.dataNumber;
	}

	public void setDataNumber(BigDecimal dataNumber) {
		this.dataNumber = dataNumber;
	}

	public String getDataText() {
		return this.dataText;
	}

	public void setDataText(String dataText) {
		this.dataText = dataText;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDataUrl() {
		return this.dataUrl;
	}

	public void setDataUrl(String dataUrl) {
		this.dataUrl = dataUrl;
	}

	public String getDataVarchar() {
		return this.dataVarchar;
	}

	public void setDataVarchar(String dataVarchar) {
		this.dataVarchar = dataVarchar;
	}

	public BigDecimal getTableKey() {
		return this.tableKey;
	}

	public void setTableKey(BigDecimal tableKey) {
		this.tableKey = tableKey;
	}

	public ComponentData getComponentDataBean() {
		return this.componentDataBean;
	}

	public void setComponentDataBean(ComponentData componentDataBean) {
		this.componentDataBean = componentDataBean;
	}

}