package ${packagePath}.dao;

import java.util.List;
import java.math.BigDecimal;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import ${packagePath}.entity.${table.name};
import ${packagePath}.base.BaseSqlProvider;

public class ${table.name}SqlProvider extends BaseSqlProvider {

	public String update(${table.name} record) {
		BEGIN();
        UPDATE("${table.rawName}");
        <#list table.columnModelList as field>
        if (record.get${field.propertyName}() != null) {
            SET("${field.columnName} = ${"#"}{${field.privatePropertyName}}");
        }
		</#list>

        WHERE("${table.rawName}_id = ${"#"}{${table.privateName}Id}");

        return SQL();
	}

    public String selectAllByRecord(${table.name} record) {
        BEGIN();
        SELECT("*");
        FROM("${table.rawName}");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        <#list table.columnModelList as field>
        if (record.get${field.propertyName}() != null) {
            stringBuffer.append(" AND ${field.columnName} = ${"#"}{${field.privatePropertyName}}");
        }
		</#list>

        WHERE(stringBuffer.toString());

        return SQL();
    }
}
