package ${packagePath}.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.palette.busi.project.tms.core.page.PageInfo;
<#list tableNameList as tableName>
import com.palette.busi.project.tms.core.dao.${tableName}Dao;
import com.palette.busi.project.tms.core.entity.${tableName};
</#list>

@Service
@Transactional
public class EntityGeneralQuerier {

	<#list tableNameList as tableName>
	@Autowired private ${tableName}Dao ${tableName}Dao;
	</#list>
	
	<#list tableNameList as tableName>
	public ${tableName} select${tableName}ById(Integer id) {return ${tableName}Dao.select${tableName}ById(id);}
	public List<${tableName}> select${tableName}All() {return ${tableName}Dao.selectAll${tableName}();};
	public List<${tableName}> select${tableName}AllByRecord(${tableName} param) {return ${tableName}Dao.selectAllByRecord(param);};
	public ${tableName} select${tableName}OneByRecord(${tableName} param) {return ${tableName}Dao.selectOneByRecord(param);};
	public PageInfo select${tableName}PageByRecord(${tableName} param) {return ${tableName}Dao.selectPageByRecord(param);};
	
	</#list>
	
}
