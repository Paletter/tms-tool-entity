package com.palette.busi.project.tms.tool.entity.util;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.io.FileUtils;

import com.palette.busi.project.tms.tool.entity.model.DBTableModel;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class CodeGenerator {

	private DBMatcher dbMatcher;
	
	public CodeGenerator() throws ConfigurationException {
		
		dbMatcher = new DBMatcher();
	}
	
	public void generate() throws ConfigurationException, IOException, TemplateException {
		
		Boolean isTableAll = PropertiesAccessor.getBoolean("isTableAll");
		
		List<Object> markerTableNameList = new ArrayList<Object>();
		
		if(isTableAll) {
			String tableSchema = PropertiesAccessor.getString("tableSchema");
			markerTableNameList = dbMatcher.getAllTableName(tableSchema);
		}
		
		if(!isTableAll) {
			markerTableNameList = PropertiesAccessor.getList("tableName");
		}

		for(Object tableName : markerTableNameList){
			
			// Generate model
			generateCode(tableName.toString()
				        ,"db_model.ftl"
				        ,"./src/main/resources/template"
				        ,"./src/code/entity/" + StringUtil.upcaseFirstLetter(StringUtil.underScore2CamelCase(tableName.toString())) + ".java");
			
			// Generate dao
			generateCode(tableName.toString()
				        ,"db_dao.ftl"
				        ,"./src/main/resources/template"
				        ,"./src/code/dao/" + StringUtil.upcaseFirstLetter(StringUtil.underScore2CamelCase(tableName.toString())) + "Dao.java");
			
			// Generate intf
			generateCode(tableName.toString()
					    ,"db_intf.ftl"
					    ,"./src/main/resources/template"
					    ,"./src/code/dao/" + StringUtil.upcaseFirstLetter(StringUtil.underScore2CamelCase(tableName.toString())) + "Intf.java");
			            
			// Generate sql provider
			generateCode(tableName.toString()
					    ,"db_sql_provider.ftl"
					    ,"./src/main/resources/template"
					    ,"./src/code/dao/" + StringUtil.upcaseFirstLetter(StringUtil.underScore2CamelCase(tableName.toString())) + "SqlProvider.java");
		}
		
		List<String> allTableNameList = new ArrayList<String>();
		String tableSchema = PropertiesAccessor.getString("tableSchema");
		List<Object> allTableObjList = dbMatcher.getAllTableName(tableSchema);
		for(Object tableName : allTableObjList){
			
			String codeTableName = StringUtil.underScore2CamelCase(tableName.toString());
			codeTableName = StringUtil.upcaseFirstLetter(codeTableName);
			allTableNameList.add(codeTableName);
		}
		
		// Generate entity general quierier
		generateCode(allTableNameList
				    ,"db_entity_general_querier.ftl"
				    ,"./src/main/resources/template"
				    ,"./src/code/service/EntityGeneralQuerier.java");
	}
	
	private void generateCode(String tableName, String templateName, String templateDir, String outputFile) throws ConfigurationException, IOException, TemplateException {

		// Get template file
		Configuration templateCfg = new Configuration();
		templateCfg.setDirectoryForTemplateLoading(new File(templateDir));
	    templateCfg.setObjectWrapper(new DefaultObjectWrapper());
	    
	    Template template = templateCfg.getTemplate(templateName);
		
	    // Generate code
	    Map<String, Object> templateParam = new HashMap<String, Object>();
		DBTableModel tableModel = dbMatcher.getTableModel(tableName);
	    templateParam.put("table", tableModel);
	    String packagePath = PropertiesAccessor.getString("codePackagePath");
	    templateParam.put("packagePath", packagePath);
	    
	    StringWriter out = new StringWriter();

	    template.process(templateParam, out);
	    
	    // Out put file
	    String content = out.getBuffer().toString();
	    File file = new File(outputFile);
	    FileUtils.writeStringToFile(file, content, "UTF-8");
	    
	    out.flush();		
	}
	
	private void generateCode(List<String> allTableNameList, String templateName, String templateDir, String outputFile) throws ConfigurationException, IOException, TemplateException {
		
		// Get template file
		Configuration templateCfg = new Configuration();
		templateCfg.setDirectoryForTemplateLoading(new File(templateDir));
		templateCfg.setObjectWrapper(new DefaultObjectWrapper());
		
		Template template = templateCfg.getTemplate(templateName);
		
		// Generate code
		Map<String, Object> templateParam = new HashMap<String, Object>();
		templateParam.put("tableNameList", allTableNameList);
		String packagePath = PropertiesAccessor.getString("codePackagePath");
	    templateParam.put("packagePath", packagePath);
		
		StringWriter out = new StringWriter();
		
		template.process(templateParam, out);
		
		// Out put file
		String content = out.getBuffer().toString();
		File file = new File(outputFile);
		FileUtils.writeStringToFile(file, content, "UTF-8");
		
		out.flush();		
	}
}