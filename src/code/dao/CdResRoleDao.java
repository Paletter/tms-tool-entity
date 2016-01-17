package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.CdResRole;
import com.palette.busi.project.tms.core.dao.CdResRoleIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class CdResRoleDao extends BaseDaoImpl {
	
	public CdResRole updateCdResRole(CdResRole cdResRole) throws BaseException {
		CdResRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdResRoleIntf.class);
		mapper.updateCdResRole(cdResRole);
		return cdResRole;
	}
	
	public CdResRole insertCdResRole(CdResRole cdResRole) throws BaseException {
		CdResRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdResRoleIntf.class);
		mapper.insertCdResRole(cdResRole);
		if(cdResRole.getCdResRoleId() == null){
			cdResRole.setCdResRoleId(getLastPk());
		}
		return cdResRole;
	}
	
	public CdResRole selectCdResRoleById(Integer cdResRoleId) throws BaseException {
		CdResRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdResRoleIntf.class);
		return mapper.selectCdResRoleById(cdResRoleId);
	}
	
	public Integer deleteCdResRole(Integer cdResRoleId) throws BaseException {
		CdResRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdResRoleIntf.class);
		return mapper.deleteCdResRole(cdResRoleId);
	}
	
	public List<CdResRole> selectAllCdResRole() throws BaseException {
		CdResRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdResRoleIntf.class);
		List<CdResRole> allCdResRole = mapper.selectAllCdResRole();
		return allCdResRole;
	}
	
	public List<CdResRole> selectAllByRecord(CdResRole cdResRole) throws BaseException {
		CdResRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdResRoleIntf.class);
		return mapper.selectAllByRecord(cdResRole);
	}
	
	public PageInfo selectPageByRecord(CdResRole cdResRole) throws BaseException {
		PageModel pageModel = cdResRole.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		CdResRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdResRoleIntf.class);
		mapper.selectAllByRecord(cdResRole);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public CdResRole selectOneByRecord(CdResRole cdResRole) throws BaseException {
		List<CdResRole> resultList = selectAllByRecord(cdResRole);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public CdResRole saveCdResRole(CdResRole cdResRole) throws BaseException {
		CdResRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdResRoleIntf.class);
		if(cdResRole.getCdResRoleId() == null){
			mapper.insertCdResRole(cdResRole);
			cdResRole = selectCdResRoleById(getLastPk());
		}else{
			mapper.updateCdResRole(cdResRole);
			cdResRole = mapper.selectCdResRoleById(cdResRole.getCdResRoleId());
		}
		return cdResRole;
	}
}