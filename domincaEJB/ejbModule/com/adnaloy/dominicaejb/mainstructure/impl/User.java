package com.adnaloy.dominicaejb.mainstructure.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.adnaloy.dominicaejb.mainstructure.interf.UserLocal;

/**
 * Session Bean implementation class User
 */
@Stateless(mappedName = "/user")
@LocalBean
public class User implements UserLocal {

    /**
     * Default constructor. 
     */
    public User() {
        // TODO Auto-generated constructor stub
    }

}
