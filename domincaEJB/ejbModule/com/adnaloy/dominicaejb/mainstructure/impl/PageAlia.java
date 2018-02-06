package com.adnaloy.dominicaejb.mainstructure.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.adnaloy.dominicaejb.mainstructure.interf.PageAliaLocal;

/**
 * Session Bean implementation class PageAlia
 */
@Stateless(mappedName = "/pagealia")
@LocalBean
public class PageAlia implements PageAliaLocal {

    /**
     * Default constructor. 
     */
    public PageAlia() {
        // TODO Auto-generated constructor stub
    }

}
