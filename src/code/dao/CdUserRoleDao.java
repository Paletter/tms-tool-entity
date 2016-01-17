package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.CdUserRole;
import com.palette.busi.project.tms.core.dao.CdUserRoleIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class CdUserRoleDao extends BaseDaoImpl {
	
	public CdUserRole updateCdUserRole(CdUserRole cdUserRole) throws BaseException {
		CdUserRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserRoleIntf.class);
		mapper.updateCdUserRole(cdUserRole);
		return cdUserRole;
	}
	
	public CdUserRole insertCdUserRole(CdUserRole cdUserRole) throws BaseException {
		CdUserRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserRoleIntf.class);
		mapper.insertCdUserRole(cdUserRole);
		if(cdUserRole.getCdUserRoleId() == null){
			cdUserRole.setCdUserRoleId(getLastPk());
		}
		return cdUserRole;
	}
	
	public CdUserRole selectCdUserRoleById(Integer cdUserRoleId) throws BaseException {
		CdUserRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserRoleIntf.class);
		return mapper.selectCdUserRoleById(cdUserRoleId);
	}
	
	public Integer deleteCdUserRole(Integer cdUserRoleId) throws BaseException {
		CdUserRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserRoleIntf.class);
		return mapper.deleteCdUserRole(cdUserRoleId);
	}
	
	public List<CdUserRole> selectAllCdUserRole() throws BaseException {
		CdUserRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserRoleIntf.class);
		List<CdUserRole> allCdUserRole = mapper.selectAllCdUserRole();
		return allCdUserRole;
	}
	
	public List<CdUserRole> selectAllByRecord(CdUserRole cdUserRole) throws BaseException {
		CdUserRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserRoleIntf.class);
		return mapper.selectAllByRecord(cdUserRole);
	}
	
	public PageInfo selectPageByRecord(CdUserRole cdUserRole) throws BaseException {
		PageModel pageModel = cdUserRole.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		CdUserRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserRoleIntf.class);
		mapper.selectAllByRecord(cdUserRole);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public CdUserRole selectOneByRecord(CdUserRole cdUserRole) throws BaseException {
		List<CdUserRole> resultList = selectAllByRecord(cdUserRole);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public CdUserRole saveCdUserRole(CdUserRole cdUserRole) throws BaseException {
		CdUserRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserRoleIntf.class);
		if(cdUserRole.getCdUserRoleId() == null){
			mapper.insertCdUserRole(cdUserRole);
			cdUserRole = selectCdUserRoleById(getLastPk());
		}else{
			mapper.updateCdUserRole(cdUserRole);
			cdUserRole = mapper.selectCdUserRoleById(cdUserRole.getCdUserRoleId());
		}
		return cdUserRole;
	}
}