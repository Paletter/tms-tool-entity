package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.CdUser;
import com.palette.busi.project.tms.core.dao.CdUserIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class CdUserDao extends BaseDaoImpl {
	
	public CdUser updateCdUser(CdUser cdUser) throws BaseException {
		CdUserIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserIntf.class);
		mapper.updateCdUser(cdUser);
		return cdUser;
	}
	
	public CdUser insertCdUser(CdUser cdUser) throws BaseException {
		CdUserIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserIntf.class);
		mapper.insertCdUser(cdUser);
		if(cdUser.getCdUserId() == null){
			cdUser.setCdUserId(getLastPk());
		}
		return cdUser;
	}
	
	public CdUser selectCdUserById(Integer cdUserId) throws BaseException {
		CdUserIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserIntf.class);
		return mapper.selectCdUserById(cdUserId);
	}
	
	public Integer deleteCdUser(Integer cdUserId) throws BaseException {
		CdUserIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserIntf.class);
		return mapper.deleteCdUser(cdUserId);
	}
	
	public List<CdUser> selectAllCdUser() throws BaseException {
		CdUserIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserIntf.class);
		List<CdUser> allCdUser = mapper.selectAllCdUser();
		return allCdUser;
	}
	
	public List<CdUser> selectAllByRecord(CdUser cdUser) throws BaseException {
		CdUserIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserIntf.class);
		return mapper.selectAllByRecord(cdUser);
	}
	
	public PageInfo selectPageByRecord(CdUser cdUser) throws BaseException {
		PageModel pageModel = cdUser.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		CdUserIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserIntf.class);
		mapper.selectAllByRecord(cdUser);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public CdUser selectOneByRecord(CdUser cdUser) throws BaseException {
		List<CdUser> resultList = selectAllByRecord(cdUser);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public CdUser saveCdUser(CdUser cdUser) throws BaseException {
		CdUserIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserIntf.class);
		if(cdUser.getCdUserId() == null){
			mapper.insertCdUser(cdUser);
			cdUser = selectCdUserById(getLastPk());
		}else{
			mapper.updateCdUser(cdUser);
			cdUser = mapper.selectCdUserById(cdUser.getCdUserId());
		}
		return cdUser;
	}
}