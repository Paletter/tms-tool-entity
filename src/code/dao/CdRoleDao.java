package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.CdRole;
import com.palette.busi.project.tms.core.dao.CdRoleIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class CdRoleDao extends BaseDaoImpl {
	
	public CdRole updateCdRole(CdRole cdRole) throws BaseException {
		CdRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdRoleIntf.class);
		mapper.updateCdRole(cdRole);
		return cdRole;
	}
	
	public CdRole insertCdRole(CdRole cdRole) throws BaseException {
		CdRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdRoleIntf.class);
		mapper.insertCdRole(cdRole);
		if(cdRole.getCdRoleId() == null){
			cdRole.setCdRoleId(getLastPk());
		}
		return cdRole;
	}
	
	public CdRole selectCdRoleById(Integer cdRoleId) throws BaseException {
		CdRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdRoleIntf.class);
		return mapper.selectCdRoleById(cdRoleId);
	}
	
	public Integer deleteCdRole(Integer cdRoleId) throws BaseException {
		CdRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdRoleIntf.class);
		return mapper.deleteCdRole(cdRoleId);
	}
	
	public List<CdRole> selectAllCdRole() throws BaseException {
		CdRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdRoleIntf.class);
		List<CdRole> allCdRole = mapper.selectAllCdRole();
		return allCdRole;
	}
	
	public List<CdRole> selectAllByRecord(CdRole cdRole) throws BaseException {
		CdRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdRoleIntf.class);
		return mapper.selectAllByRecord(cdRole);
	}
	
	public PageInfo selectPageByRecord(CdRole cdRole) throws BaseException {
		PageModel pageModel = cdRole.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		CdRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdRoleIntf.class);
		mapper.selectAllByRecord(cdRole);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public CdRole selectOneByRecord(CdRole cdRole) throws BaseException {
		List<CdRole> resultList = selectAllByRecord(cdRole);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public CdRole saveCdRole(CdRole cdRole) throws BaseException {
		CdRoleIntf mapper = this.getSqlSessionTemplate().getMapper(CdRoleIntf.class);
		if(cdRole.getCdRoleId() == null){
			mapper.insertCdRole(cdRole);
			cdRole = selectCdRoleById(getLastPk());
		}else{
			mapper.updateCdRole(cdRole);
			cdRole = mapper.selectCdRoleById(cdRole.getCdRoleId());
		}
		return cdRole;
	}
}