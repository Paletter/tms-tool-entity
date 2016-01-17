package com.palette.busi.project.tms.tool.entity.model;

import com.palette.busi.project.tms.tool.entity.util.StringUtil;


public class DBTableColumnModel {
	
	private String columnName;
	private String propertyName;
	private String privatePropertyName;
	private String type;
	private int length;
	private int decimals;
	private boolean allowNull;
	private String javaType;
	
	public String getColumnName() {
		return columnName;
	}
	
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
		this.setJavaType(StringUtil.getJavaTypeByDbType(type));
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getDecimals() {
		return decimals;
	}
	public void setDecimals(int decimals) {
		this.decimals = decimals;
	}
	
	public boolean isAllowNull() {
		return allowNull;
	}
	
	public void setAllowNull(boolean allowNull) {
		this.allowNull = allowNull;
	}
	
	public String getPrivatePropertyName() {
		return privatePropertyName;
	}
	
	public void setPrivatePropertyName(String privatePropertyName) {
		this.privatePropertyName = privatePropertyName;
		this.setPropertyName(StringUtil.upcaseFirstLetter(privatePropertyName));
	}
	
	public String getJavaType() {
		return javaType;
	}
	
	public void setJavaType(String javaType) {
		this.javaType = javaType;
	}

}
