package com.palette.busi.project.tms.tool.entity.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;

import com.palette.busi.project.tms.tool.entity.model.DBTableColumnModel;
import com.palette.busi.project.tms.tool.entity.model.DBTableModel;

public class DBMatcher {

	private String url;
	private String username;
	private String password;
	private String driverClassName;
	
	public DBMatcher() throws ConfigurationException {
		
		url = PropertiesAccessor.getString("url");
		username = PropertiesAccessor.getString("username");
		password = PropertiesAccessor.getString("password");
		driverClassName = PropertiesAccessor.getString("driverClassName");
	}
	
	public DBTableModel getTableModel(String tableName) {

		Connection con = null;
		Statement smt = null;
		
		DBTableModel tableModel = new DBTableModel();
		tableModel.setRawName(tableName);
		
		try {
			
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, username, password);
			smt = con.createStatement();
			ResultSet res = smt.executeQuery("DESC " + tableName);

			while (res.next()) {
				
				DBTableColumnModel columnModel = new DBTableColumnModel();
				
				String fieldName = res.getString("Field");
				if(res.getString("Key").equals("PRI")){
					tableModel.setRawKeyField(fieldName);
				}
				String privatePropertyName = StringUtil.underScore2CamelCase(fieldName);
				columnModel.setColumnName(fieldName);
				columnModel.setPrivatePropertyName(privatePropertyName);
				columnModel.setType(res.getString("Type"));
				
				tableModel.getColumnModelList().add(columnModel);
			}

			res.close(); 

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

		}
		
		return tableModel;
	}
	
	public List<Object> getAllTableName(String tableSchema) throws ConfigurationException {
		
		Connection con = null;
		Statement smt = null;
		List<Object> tableNameList = new ArrayList<Object>();
		
		try {
			
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, username, password);
			smt = con.createStatement();
			ResultSet res = smt.executeQuery("SELECT table_name FROM information_schema.tables WHERE table_schema='" + tableSchema + "'");
			
			while (res.next()) {
				
				String tableName = res.getString("table_name");
				tableNameList.add(tableName.toString());
			}
			
			res.close(); 

		} catch (Exception ex) {
			ex.printStackTrace(); 
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

		}
		
		return tableNameList;
	}
}
