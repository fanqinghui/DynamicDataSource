package com.foundation.dynamic.dao;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;  

/**
 * 
 * @author fqh
 *
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
	
	private DataSourceSwitcher switcher;
	
    @Override  
    protected Object determineCurrentLookupKey() {  
        return switcher.getDataSource();  
    }

	public DataSourceSwitcher getSwitcher() {
		return switcher;
	}

	public void setSwitcher(DataSourceSwitcher switcher) {
		this.switcher = switcher;
	}
} 
