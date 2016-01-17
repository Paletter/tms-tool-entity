package ${packagePath}.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import ${packagePath}.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class ${table.name} extends BasePo {

	private static final long serialVersionUID = 1L;
	
    <#list table.columnModelList as field>
    private ${field.javaType} ${field.privatePropertyName};
	</#list>
    
    <#list table.columnModelList as field>
    public ${field.javaType} get${field.propertyName}() {
        return ${field.privatePropertyName};
    }
        
    public void set${field.propertyName}(${field.javaType} ${field.privatePropertyName}) {
        this.${field.privatePropertyName} = ${field.privatePropertyName};
    }
        
	</#list>
}