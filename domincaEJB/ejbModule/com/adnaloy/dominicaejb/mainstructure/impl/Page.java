package com.adnaloy.dominicaejb.mainstructure.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.adnaloy.dominicaejb.mainstructure.interf.PageLocal;

/**
 * Session Bean implementation class Page
 */
@Stateless(mappedName = "/page")
@LocalBean
public class Page implements PageLocal {

    /**
     * Default constructor. 
     */
    public Page() {
        // TODO Auto-generated constructor stub
    }

}
