package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the COMPONENT_DATA database table.
 * 
 */
@Entity
@Table(name="COMPONENT_DATA")
@NamedQuery(name="ComponentData.findAll", query="SELECT c FROM ComponentData c")
public class ComponentData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COMPONENT_DATA_TABLEKEY_GENERATOR", sequenceName="DOMINICA_SQCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMPONENT_DATA_TABLEKEY_GENERATOR")
	@Column(name="TABLE_KEY")
	private long tableKey;

	@Column(name="DATA_ARRAY")
	private BigDecimal dataArray;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_DATE")
	private Date dataDate;

	@Column(name="DATA_NAME")
	private String dataName;

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

	//bi-directional many-to-one association to Component
	@ManyToOne
	@JoinColumn(name="COMPONENT")
	private Component componentBean;

	//bi-directional many-to-one association to ComponentDataArray
	@OneToMany(mappedBy="componentDataBean")
	private List<ComponentDataArray> componentDataArrays;

	public ComponentData() {
	}

	public long getTableKey() {
		return this.tableKey;
	}

	public void setTableKey(long tableKey) {
		this.tableKey = tableKey;
	}

	public BigDecimal getDataArray() {
		return this.dataArray;
	}

	public void setDataArray(BigDecimal dataArray) {
		this.dataArray = dataArray;
	}

	public Date getDataDate() {
		return this.dataDate;
	}

	public void setDataDate(Date dataDate) {
		this.dataDate = dataDate;
	}

	public String getDataName() {
		return this.dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
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

	public Component getComponentBean() {
		return this.componentBean;
	}

	public void setComponentBean(Component componentBean) {
		this.componentBean = componentBean;
	}

	public List<ComponentDataArray> getComponentDataArrays() {
		return this.componentDataArrays;
	}

	public void setComponentDataArrays(List<ComponentDataArray> componentDataArrays) {
		this.componentDataArrays = componentDataArrays;
	}

	public ComponentDataArray addComponentDataArray(ComponentDataArray componentDataArray) {
		getComponentDataArrays().add(componentDataArray);
		componentDataArray.setComponentDataBean(this);

		return componentDataArray;
	}

	public ComponentDataArray removeComponentDataArray(ComponentDataArray componentDataArray) {
		getComponentDataArrays().remove(componentDataArray);
		componentDataArray.setComponentDataBean(null);

		return componentDataArray;
	}

}