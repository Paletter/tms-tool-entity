package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.CdState;
import com.palette.busi.project.tms.core.dao.CdStateIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class CdStateDao extends BaseDaoImpl {
	
	public CdState updateCdState(CdState cdState) throws BaseException {
		CdStateIntf mapper = this.getSqlSessionTemplate().getMapper(CdStateIntf.class);
		mapper.updateCdState(cdState);
		return cdState;
	}
	
	public CdState insertCdState(CdState cdState) throws BaseException {
		CdStateIntf mapper = this.getSqlSessionTemplate().getMapper(CdStateIntf.class);
		mapper.insertCdState(cdState);
		if(cdState.getCdStateId() == null){
			cdState.setCdStateId(getLastPk());
		}
		return cdState;
	}
	
	public CdState selectCdStateById(Integer cdStateId) throws BaseException {
		CdStateIntf mapper = this.getSqlSessionTemplate().getMapper(CdStateIntf.class);
		return mapper.selectCdStateById(cdStateId);
	}
	
	public Integer deleteCdState(Integer cdStateId) throws BaseException {
		CdStateIntf mapper = this.getSqlSessionTemplate().getMapper(CdStateIntf.class);
		return mapper.deleteCdState(cdStateId);
	}
	
	public List<CdState> selectAllCdState() throws BaseException {
		CdStateIntf mapper = this.getSqlSessionTemplate().getMapper(CdStateIntf.class);
		List<CdState> allCdState = mapper.selectAllCdState();
		return allCdState;
	}
	
	public List<CdState> selectAllByRecord(CdState cdState) throws BaseException {
		CdStateIntf mapper = this.getSqlSessionTemplate().getMapper(CdStateIntf.class);
		return mapper.selectAllByRecord(cdState);
	}
	
	public PageInfo selectPageByRecord(CdState cdState) throws BaseException {
		PageModel pageModel = cdState.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		CdStateIntf mapper = this.getSqlSessionTemplate().getMapper(CdStateIntf.class);
		mapper.selectAllByRecord(cdState);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public CdState selectOneByRecord(CdState cdState) throws BaseException {
		List<CdState> resultList = selectAllByRecord(cdState);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public CdState saveCdState(CdState cdState) throws BaseException {
		CdStateIntf mapper = this.getSqlSessionTemplate().getMapper(CdStateIntf.class);
		if(cdState.getCdStateId() == null){
			mapper.insertCdState(cdState);
			cdState = selectCdStateById(getLastPk());
		}else{
			mapper.updateCdState(cdState);
			cdState = mapper.selectCdStateById(cdState.getCdStateId());
		}
		return cdState;
	}
}