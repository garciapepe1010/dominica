package com.adnaloy.dominicaejb.mainstructure.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.adnaloy.dominicaejb.mainstructure.interf.UserBySectionLocal;

/**
 * Session Bean implementation class UserBySection
 */
@Stateless(mappedName = "/userbysection")
@LocalBean
public class UserBySection implements UserBySectionLocal {

    /**
     * Default constructor. 
     */
    public UserBySection() {
        // TODO Auto-generated constructor stub
    }

}
