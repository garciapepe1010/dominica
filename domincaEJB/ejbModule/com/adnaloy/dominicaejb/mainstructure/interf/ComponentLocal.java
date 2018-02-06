package com.adnaloy.dominicaejb.mainstructure.interf;

import java.util.List;
import javax.ejb.Local;



@Local
public interface ComponentLocal {

	public long getTableKey();
	public void setTableKey(long tableKey);
	public String getEjbname();
	public void setEjbname(String ejbname);
	public String getName();
	public void setName(String name);
	
	
	public void reset();
	public void add();
	public void update();
	public void drop();
	public ComponentLocal findComponent();
	public List<ComponentLocal> findAllComponenets();

}
