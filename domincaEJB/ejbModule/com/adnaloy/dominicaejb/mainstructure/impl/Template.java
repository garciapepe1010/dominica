package com.adnaloy.dominicaejb.mainstructure.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.adnaloy.dominicaejb.mainstructure.interf.TemplateLocal;

/**
 * Session Bean implementation class Template
 */
@Stateless(mappedName = "/template")
@LocalBean
public class Template implements TemplateLocal {

    /**
     * Default constructor. 
     */
    public Template() {
        // TODO Auto-generated constructor stub
    }

}
