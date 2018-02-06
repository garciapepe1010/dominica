package com.adnaloy.dominicaejb.mainstructure.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.adnaloy.dominicaejb.mainstructure.interf.ComponentDataLocal;

/**
 * Session Bean implementation class ComponentData
 */
@Stateless(mappedName = "/componentdata")
@LocalBean
public class ComponentData implements ComponentDataLocal {

    /**
     * Default constructor. 
     */
    public ComponentData() {
        // TODO Auto-generated constructor stub
    }

}
