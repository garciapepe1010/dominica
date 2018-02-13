package com.adnaloy.dominicaejb.mainstructure.interf;

import java.math.BigDecimal;
import java.util.Date;

import javax.ejb.Local;

@Local
public interface UserLocal {
	
	public void initialize(String person, String password) throws Exception;
    
    public void verifyAuthorizaton();
    public boolean isAuthorised();
    
	public void reset();
	public void add();
	public void update();
	public void drop();
	public UserLocal findUser();
	

}
