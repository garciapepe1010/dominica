package com.adnaloy.dominicaejb.mainstructure.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.TypedQuery;

import com.adnaloy.dominicaejb.mainstructure.interf.ComponentLocal;

/**
 * Session Bean implementation class Component
 */
@Stateless(mappedName = "/component")
@LocalBean
public class Component implements ComponentLocal {
	
	@PersistenceContext(unitName="dominicaJPA", type = PersistenceContextType.TRANSACTION)	
	private EntityManager manager;

    /**
     * Default constructor. 
     */
	
	private long tableKey;
	private String ejbname;
	private String name;
	
	
	
    public Component() {
        // TODO Auto-generated constructor stub
    }



	public long getTableKey() {
		return tableKey;
	}



	public void setTableKey(long tableKey) {
		this.tableKey = tableKey;
	}



	public String getEjbname() {
		return ejbname;
	}



	public void setEjbname(String ejbname) {
		this.ejbname = ejbname;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
    
    
	
	public void reset() {
		
		this.tableKey = 0;
		this.name = null;
		this.ejbname = null;
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void add() {
		
		com.adnaloy.dominicaJPA.mainstructure.Component value = new com.adnaloy.dominicaJPA.mainstructure.Component();

		value.setName(name);
		value.setEjbname(ejbname);
		
	    manager.persist(value);

	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void update() {
		
		com.adnaloy.dominicaJPA.mainstructure.Component uno = manager.find(com.adnaloy.dominicaJPA.mainstructure.Component.class, tableKey);
		
		
		uno.setName(name);
		uno.setEjbname(ejbname);
		

	    manager.persist(uno);

	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void drop() {
	
		com.adnaloy.dominicaJPA.mainstructure.Component uno = manager.find(com.adnaloy.dominicaJPA.mainstructure.Component.class, tableKey);
		

	    manager.remove(uno);
	}
	
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public ComponentLocal findComponent() {
		com.adnaloy.dominicaJPA.mainstructure.Component uno = manager.find(com.adnaloy.dominicaJPA.mainstructure.Component.class, tableKey);

		this.setName(uno.getName());
		this.setEjbname(uno.getEjbname());
		
		return this;
	}
	
	
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public List<ComponentLocal> findAllComponenets() {
		
		ArrayList<ComponentLocal> values = new ArrayList<ComponentLocal>();
		

		TypedQuery<com.adnaloy.dominicaJPA.mainstructure.Component> query =
				manager.createNamedQuery("Component.findAll", com.adnaloy.dominicaJPA.mainstructure.Component.class);
		List<com.adnaloy.dominicaJPA.mainstructure.Component>  unos = query.getResultList();

		for(com.adnaloy.dominicaJPA.mainstructure.Component uno:unos) {
			
			com.adnaloy.dominicaejb.mainstructure.impl.Component ef = new com.adnaloy.dominicaejb.mainstructure.impl.Component();
			
			ef.setTableKey(uno.getTableKey());
			ef.setName(uno.getName());
			ef.setEjbname(uno.getEjbname());

			values.add(ef);
			
		}
		 
		return values;
	}

}
