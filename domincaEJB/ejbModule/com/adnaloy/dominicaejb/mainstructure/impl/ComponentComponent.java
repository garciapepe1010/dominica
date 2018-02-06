package com.adnaloy.dominicaejb.mainstructure.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.adnaloy.dominicaejb.mainstructure.interf.ComponentComponentLocal;

/**
 * Session Bean implementation class ComponentComponent
 */
@Stateless(mappedName = "/componentcomponent")
@LocalBean
public class ComponentComponent implements ComponentComponentLocal {

    /**
     * Default constructor. 
     */
    public ComponentComponent() {
        // TODO Auto-generated constructor stub
    }

}
