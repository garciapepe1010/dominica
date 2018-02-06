package com.adnaloy.dominicaejb.mainstructure.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.adnaloy.dominicaejb.mainstructure.interf.PageMetaLocal;

/**
 * Session Bean implementation class PageMeta
 */
@Stateless(mappedName = "/pagemeta")
@LocalBean
public class PageMeta implements PageMetaLocal {

    /**
     * Default constructor. 
     */
    public PageMeta() {
        // TODO Auto-generated constructor stub
    }

}
