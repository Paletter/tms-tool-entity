package com.palette.busi.project.tms.tool.entity.util;

import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class PropertiesAccessor {

	public static String getString(String propertyName) {
		try {
			PropertiesConfiguration config = new PropertiesConfiguration("config.properties");
			return config.getString(propertyName);
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static List<Object> getList(String propertyName) {
		try {
			PropertiesConfiguration config = new PropertiesConfiguration("config.properties");
			return config.getList(propertyName);
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Boolean getBoolean(String propertyName) {
		try {
			PropertiesConfiguration config = new PropertiesConfiguration("config.properties");
			return config.getBoolean(propertyName);
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
		return null;
	}
}
