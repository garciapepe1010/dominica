package com.adnaloy.dominicaejb.mainstructure.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.adnaloy.dominicaejb.mainstructure.interf.DomainLocal;

/**
 * Session Bean implementation class Domain
 */
@Stateless(mappedName = "/domain")
@LocalBean
public class Domain implements DomainLocal {

    /**
     * Default constructor. 
     */
    public Domain() {
        // TODO Auto-generated constructor stub
    }

}
