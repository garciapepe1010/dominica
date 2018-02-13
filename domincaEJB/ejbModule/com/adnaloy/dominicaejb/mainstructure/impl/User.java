package com.adnaloy.dominicaejb.mainstructure.impl;

import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.TypedQuery;

import com.adnaloy.dominicaejb.mainstructure.interf.ComponentLocal;
import com.adnaloy.dominicaejb.mainstructure.interf.UserLocal;

/**
 * Session Bean implementation class User
 */
@Stateful(mappedName = "/user")
@LocalBean
public class User implements UserLocal {
	
	@PersistenceContext(unitName="dominicaJPA", type = PersistenceContextType.TRANSACTION)	
	private EntityManager manager;
	

    /**
     * Default constructor. 
     */
	private String tableKey;
	private Date dateEnd;
	private Date dateStart;
	private BigDecimal domain;
	private BigDecimal isAdmin;
	private String userName;
	private String userPassword;
	private boolean isAuth = false;
	
	

	
    public User() {
        // TODO Auto-generated constructor stub
    }


    public void initialize(String person,String password) throws Exception {
        if (person == null) {
            throw new Exception("Null person not allowed.");
        }else if (password == null){
        	throw new Exception("Null password not allowed.");
        } else {
        	this.userName = person;
        	this.userPassword = password;
        	this.isAdmin = new BigDecimal(0);
        	this.isAuth = false;
        }
    }
    
    @Override
    public void verifyAuthorizaton() {
    	com.adnaloy.dominicaJPA.mainstructure.User uno = manager.find(com.adnaloy.dominicaJPA.mainstructure.User.class, tableKey);
    	if(uno!=null && uno.getUserName()!= null && userPassword.equals(uno.getUserPassword()))
    		isAuth = true;
    	
    }


	@Override
	public boolean isAuthorised() {
		// TODO Auto-generated method stub
		return isAuth;
	}
	

	public void reset() {
		
		this.tableKey = null;
		this.dateStart = null;
		this.dateEnd = null;
		this.domain = null;
		this.isAdmin = null;
		this.isAuth = false;
		this.userName = null;
		this.userPassword = null;
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void add() {
		
		com.adnaloy.dominicaJPA.mainstructure.User value = new com.adnaloy.dominicaJPA.mainstructure.User();

		value.setUserName(userName);
		value.setUserPassword(userPassword);
		value.setIsAdmin(isAdmin);
		value.setDateStart(dateStart);
		value.setDomain(domain);
		
	    manager.persist(value);

	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void update() {
		
		com.adnaloy.dominicaJPA.mainstructure.User uno = manager.find(com.adnaloy.dominicaJPA.mainstructure.User.class, tableKey);
		

		
		uno.setUserName(userName);
		uno.setUserPassword(userPassword);
		uno.setIsAdmin(isAdmin);
		uno.setDateStart(dateStart);
		uno.setDateEnd(dateEnd);
		uno.setDomain(domain);
		

	    manager.persist(uno);

	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void drop() {
	
		com.adnaloy.dominicaJPA.mainstructure.User uno = manager.find(com.adnaloy.dominicaJPA.mainstructure.User.class, tableKey);
		

	    manager.remove(uno);
	}
	
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public UserLocal findUser() {
		com.adnaloy.dominicaJPA.mainstructure.User uno = manager.find(com.adnaloy.dominicaJPA.mainstructure.User.class, tableKey);

		
		this.userName = uno.getUserName();
		this.userPassword = uno.getUserPassword();
		this.isAdmin = uno.getIsAdmin();
		this.dateStart = uno.getDateStart();
		this.dateEnd = uno.getDateEnd();
		this.domain = uno.getDomain();
		
		return this;
	}
	
    

}
