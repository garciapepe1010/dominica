package com.adnaloy.dominicaejb.mainstructure.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.adnaloy.dominicaejb.mainstructure.interf.ComponentDataArrayLocal;

/**
 * Session Bean implementation class ComponentDataArray
 */
@Stateless(mappedName = "/componentdataarray")
@LocalBean
public class ComponentDataArray implements ComponentDataArrayLocal {

    /**
     * Default constructor. 
     */
    public ComponentDataArray() {
        // TODO Auto-generated constructor stub
    }

}
