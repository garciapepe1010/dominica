package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the USER database table.
 * 
 */
@Entity
@Table(name="USER")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USER_TABLEKEY_GENERATOR", sequenceName="DOMINICA_SQCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_TABLEKEY_GENERATOR")
	@Column(name="TABLE_KEY")
	private String tableKey;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_END")
	private Date dateEnd;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_START")
	private Date dateStart;

	@Column(name="DOMAIN")
	private BigDecimal domain;

	@Column(name="IS_ADMIN")
	private BigDecimal isAdmin;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="USER_PASSWORD")
	private String userPassword;

	public User() {
	}

	public String getTableKey() {
		return this.tableKey;
	}

	public void setTableKey(String tableKey) {
		this.tableKey = tableKey;
	}

	public Date getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Date getDateStart() {
		return this.dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public BigDecimal getDomain() {
		return this.domain;
	}

	public void setDomain(BigDecimal domain) {
		this.domain = domain;
	}

	public BigDecimal getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(BigDecimal isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}