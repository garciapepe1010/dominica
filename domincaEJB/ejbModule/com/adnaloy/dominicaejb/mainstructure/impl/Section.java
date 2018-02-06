package com.adnaloy.dominicaejb.mainstructure.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.adnaloy.dominicaejb.mainstructure.interf.SectionLocal;

/**
 * Session Bean implementation class Section
 */
@Stateless(mappedName = "/section")
@LocalBean
public class Section implements SectionLocal {

    /**
     * Default constructor. 
     */
    public Section() {
        // TODO Auto-generated constructor stub
    }

}
