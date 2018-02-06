package com.adnaloy.dominicaweb.rest;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
@Path("/componentrs")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class componentrs {
	@EJB
	com.adnaloy.dominicaejb.mainstructure.interf.ComponentLocal cmpnLocal;
	
	@GET
    @Path("ping")
    public String getServerTime() {
        System.out.println("RESTful Service 'MessageService' is running ==> ping");
        return "received ping on "+new Date().toString();
    }
	
	@GET
	@Path("getallcomponents")
    @Produces({MediaType.APPLICATION_JSON})  //add MediaType.APPLICATION_XML if you want XML as well (don't forget @XmlRootElement)
    public List<com.adnaloy.dominicaejb.mainstructure.interf.ComponentLocal> getAllComponents() throws Exception{
        
        List<com.adnaloy.dominicaejb.mainstructure.interf.ComponentLocal> values = cmpnLocal.findAllComponenets();
        
        return values; //do not use Response object because this causes issues when generating XML automatically
    }

}
