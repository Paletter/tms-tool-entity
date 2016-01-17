package com.palette.busi.project.tms.tool.entity.model;

import java.util.ArrayList;
import java.util.List;

import com.palette.busi.project.tms.tool.entity.util.StringUtil;

public class DBTableModel {

	private String privateName;
	private String rawName;
	private String name;
	private String keyField;
	private String rawKeyField;
	private String privateKeyField;
	private List<DBTableColumnModel> columnModelList;

	public List<DBTableColumnModel> getColumnModelList() {
		if(columnModelList == null) columnModelList = new ArrayList<DBTableColumnModel>();
		return columnModelList;
	}

	public void setColumnModelList(List<DBTableColumnModel> columnModelList) {
		this.columnModelList = columnModelList;
	}

	public String getPrivateName() {
		return privateName;
	}

	public void setPrivateName(String name) {
		this.privateName = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRawName() {
		return rawName;
	}

	public void setRawName(String rawName) {
		this.rawName = rawName;
		this.setPrivateName(StringUtil.underScore2CamelCase(rawName.toString()));
		this.setName(StringUtil.upcaseFirstLetter(StringUtil.underScore2CamelCase(rawName.toString())));
	}

	public String getRawKeyField() {
		return rawKeyField;
	}

	public void setRawKeyField(String rawKeyField) {
		this.rawKeyField = rawKeyField;
		this.setPrivateKeyField(StringUtil.underScore2CamelCase(rawKeyField.toString()));
		this.setKeyField(StringUtil.upcaseFirstLetter(StringUtil.underScore2CamelCase(rawKeyField.toString())));
	}

	public String getKeyField() {
		return keyField;
	}

	public void setKeyField(String keyField) {
		this.keyField = keyField;
	}

	public String getPrivateKeyField() {
		return privateKeyField;
	}

	public void setPrivateKeyField(String privateKeyField) {
		this.privateKeyField = privateKeyField;
	}

}
