package ${packagePath}.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.ResultType;

import ${packagePath}.entity.${table.name};
import ${packagePath}.dao.${table.name}SqlProvider;
import ${packagePath}.base.BaseMybatisMapper;

public interface ${table.name}Intf extends BaseMybatisMapper {


	@Select("SELECT <#list table.columnModelList as field> ${field.columnName}  AS ${field.privatePropertyName}<#if field_has_next>,</#if></#list> FROM ${table.rawName} WHERE ${table.rawName}_id=${"#"}{${table.privateName}Id}")
	public ${table.name} select${table.name}ById(@Param("${table.privateName}Id") int ${table.privateName}Id);
	
	@Select("SELECT <#list table.columnModelList as field> ${field.columnName}  AS ${field.privatePropertyName}<#if field_has_next>,</#if></#list> FROM ${table.rawName}")
	public List<${table.name}> selectAll${table.name}();
	
	@Insert("insert into ${table.rawName} (<#list table.columnModelList as field> ${field.columnName}<#if field_has_next>,</#if></#list> ) values (<#list table.columnModelList as field>${"#"}{${field.privatePropertyName}}<#if field_has_next>,</#if></#list>)")
	public int insert${table.name}(${table.name} ${table.privateName});

	@UpdateProvider(type=${table.name}SqlProvider.class, method="update")
	public int update${table.name}(${table.name} ${table.privateName});
	
	@Delete("delete from ${table.rawName} where ${table.rawName}_id = ${"#"}{${table.privateName}Id}")
	public int delete${table.name}(@Param("${table.privateName}Id") int ${table.privateName}Id);

    @SelectProvider(type=${table.name}SqlProvider.class, method="selectAllByRecord")
    @ResultType(${table.name}.class)
    public List<${table.name}> selectAllByRecord(${table.name} record);
    
}