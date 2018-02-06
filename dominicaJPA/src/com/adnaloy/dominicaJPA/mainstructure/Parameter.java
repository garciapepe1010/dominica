package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PARAMETERS database table.
 * 
 */
@Entity
@Table(name="PARAMETERS")
@NamedQuery(name="Parameter.findAll", query="SELECT p FROM Parameter p")
public class Parameter implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ParameterPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_DATE")
	private Date dataDate;

	@Column(name="DATA_NUMBER")
	private BigDecimal dataNumber;

	@Column(name="DATA_VARCHAR")
	private String dataVarchar;

	public Parameter() {
	}

	public ParameterPK getId() {
		return this.id;
	}

	public void setId(ParameterPK id) {
		this.id = id;
	}

	public Date getDataDate() {
		return this.dataDate;
	}

	public void setDataDate(Date dataDate) {
		this.dataDate = dataDate;
	}

	public BigDecimal getDataNumber() {
		return this.dataNumber;
	}

	public void setDataNumber(BigDecimal dataNumber) {
		this.dataNumber = dataNumber;
	}

	public String getDataVarchar() {
		return this.dataVarchar;
	}

	public void setDataVarchar(String dataVarchar) {
		this.dataVarchar = dataVarchar;
	}

}