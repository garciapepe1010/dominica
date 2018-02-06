package com.adnaloy.dominicaJPA.mainstructure;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USER_BY_SECTION database table.
 * 
 */
@Entity
@Table(name="USER_BY_SECTION")
@NamedQuery(name="UserBySection.findAll", query="SELECT u FROM UserBySection u")
public class UserBySection implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserBySectionPK id;

	public UserBySection() {
	}

	public UserBySectionPK getId() {
		return this.id;
	}

	public void setId(UserBySectionPK id) {
		this.id = id;
	}

}