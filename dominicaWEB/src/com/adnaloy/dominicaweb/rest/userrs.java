package com.adnaloy.dominicaweb.rest;

import java.util.Date;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@RequestScoped
@Path("userrs")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class userrs {
	@EJB
	com.adnaloy.dominicaejb.mainstructure.interf.UserLocal beanUsr;
	
	private final static String IS_AUTHORIZED = "IS_AUTHORIZED";
	private final static String NOT_IS_AUTHORIZED = "NOT_IS_AUTHORIZED";
	
	
	
	@GET
    @Path("ping")
    public String getServerTime() {
        System.out.println("RESTful Service 'MessageService' is running ==> ping");
        return "received ping on "+new Date().toString();
    }
	
	@GET
    @Path("setAuthorized")
    @Produces({MediaType.TEXT_PLAIN})
    @Consumes({MediaType.TEXT_PLAIN , MediaType.TEXT_PLAIN})
    public String getAuthorized(@QueryParam("usr") String usr,@QueryParam("pa") String pa) {
    	try {
	    	beanUsr.initialize(usr, pa);
	    	beanUsr.verifyAuthorizaton();
	    	if(beanUsr.isAuthorised()) {
	    		return IS_AUTHORIZED;
	    	}else {
	    		return NOT_IS_AUTHORIZED;
	    	}
    	}catch(Exception ex) {
    		return NOT_IS_AUTHORIZED;
    	}
    	
    }

}
