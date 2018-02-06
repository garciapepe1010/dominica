package com.adnaloy.dominicaejb.mainstructure.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.adnaloy.dominicaejb.mainstructure.interf.ParameterLocal;

/**
 * Session Bean implementation class Parameter
 */
@Stateless(mappedName = "/parameter")
@LocalBean
public class Parameter implements ParameterLocal {

    /**
     * Default constructor. 
     */
    public Parameter() {
        // TODO Auto-generated constructor stub
    }

}
