package ${packagePath}.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ${packagePath}.base.dao.impl.BaseDaoImpl;
import ${packagePath}.base.BaseException;
import ${packagePath}.entity.${table.name};
import ${packagePath}.dao.${table.name}Intf;
import ${packagePath}.page.Page;
import ${packagePath}.page.PageFormat;
import ${packagePath}.page.PageHelper;
import ${packagePath}.page.PageInfo;
import ${packagePath}.page.PageModel;

@Component
public class ${table.name}Dao extends BaseDaoImpl {
	
	public ${table.name} update${table.name}(${table.name} ${table.privateName}) throws BaseException {
		${table.name}Intf mapper = this.getSqlSessionTemplate().getMapper(${table.name}Intf.class);
		mapper.update${table.name}(${table.privateName});
		return ${table.privateName};
	}
	
	public ${table.name} insert${table.name}(${table.name} ${table.privateName}) throws BaseException {
		${table.name}Intf mapper = this.getSqlSessionTemplate().getMapper(${table.name}Intf.class);
		mapper.insert${table.name}(${table.privateName});
		if(${table.privateName}.get${table.name}Id() == null){
			${table.privateName}.set${table.name}Id(getLastPk());
		}
		return ${table.privateName};
	}
	
	public ${table.name} select${table.name}ById(Integer ${table.privateName}Id) throws BaseException {
		${table.name}Intf mapper = this.getSqlSessionTemplate().getMapper(${table.name}Intf.class);
		return mapper.select${table.name}ById(${table.privateName}Id);
	}
	
	public Integer delete${table.name}(Integer ${table.privateName}Id) throws BaseException {
		${table.name}Intf mapper = this.getSqlSessionTemplate().getMapper(${table.name}Intf.class);
		return mapper.delete${table.name}(${table.privateName}Id);
	}
	
	public List<${table.name}> selectAll${table.name}() throws BaseException {
		${table.name}Intf mapper = this.getSqlSessionTemplate().getMapper(${table.name}Intf.class);
		List<${table.name}> all${table.name} = mapper.selectAll${table.name}();
		return all${table.name};
	}
	
	public List<${table.name}> selectAllByRecord(${table.name} ${table.privateName}) throws BaseException {
		${table.name}Intf mapper = this.getSqlSessionTemplate().getMapper(${table.name}Intf.class);
		return mapper.selectAllByRecord(${table.privateName});
	}
	
	public PageInfo selectPageByRecord(${table.name} ${table.privateName}) throws BaseException {
		PageModel pageModel = ${table.privateName}.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		${table.name}Intf mapper = this.getSqlSessionTemplate().getMapper(${table.name}Intf.class);
		mapper.selectAllByRecord(${table.privateName});
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public ${table.name} selectOneByRecord(${table.name} ${table.privateName}) throws BaseException {
		List<${table.name}> resultList = selectAllByRecord(${table.privateName});
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public ${table.name} save${table.name}(${table.name} ${table.privateName}) throws BaseException {
		${table.name}Intf mapper = this.getSqlSessionTemplate().getMapper(${table.name}Intf.class);
		if(${table.privateName}.get${table.name}Id() == null){
			mapper.insert${table.name}(${table.privateName});
			${table.privateName} = select${table.name}ById(getLastPk());
		}else{
			mapper.update${table.name}(${table.privateName});
			${table.privateName} = mapper.select${table.name}ById(${table.privateName}.get${table.name}Id());
		}
		return ${table.privateName};
	}
}