package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.CdCountryRef;
import com.palette.busi.project.tms.core.dao.CdCountryRefIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class CdCountryRefDao extends BaseDaoImpl {
	
	public CdCountryRef updateCdCountryRef(CdCountryRef cdCountryRef) throws BaseException {
		CdCountryRefIntf mapper = this.getSqlSessionTemplate().getMapper(CdCountryRefIntf.class);
		mapper.updateCdCountryRef(cdCountryRef);
		return cdCountryRef;
	}
	
	public CdCountryRef insertCdCountryRef(CdCountryRef cdCountryRef) throws BaseException {
		CdCountryRefIntf mapper = this.getSqlSessionTemplate().getMapper(CdCountryRefIntf.class);
		mapper.insertCdCountryRef(cdCountryRef);
		if(cdCountryRef.getCdCountryRefId() == null){
			cdCountryRef.setCdCountryRefId(getLastPk());
		}
		return cdCountryRef;
	}
	
	public CdCountryRef selectCdCountryRefById(Integer cdCountryRefId) throws BaseException {
		CdCountryRefIntf mapper = this.getSqlSessionTemplate().getMapper(CdCountryRefIntf.class);
		return mapper.selectCdCountryRefById(cdCountryRefId);
	}
	
	public Integer deleteCdCountryRef(Integer cdCountryRefId) throws BaseException {
		CdCountryRefIntf mapper = this.getSqlSessionTemplate().getMapper(CdCountryRefIntf.class);
		return mapper.deleteCdCountryRef(cdCountryRefId);
	}
	
	public List<CdCountryRef> selectAllCdCountryRef() throws BaseException {
		CdCountryRefIntf mapper = this.getSqlSessionTemplate().getMapper(CdCountryRefIntf.class);
		List<CdCountryRef> allCdCountryRef = mapper.selectAllCdCountryRef();
		return allCdCountryRef;
	}
	
	public List<CdCountryRef> selectAllByRecord(CdCountryRef cdCountryRef) throws BaseException {
		CdCountryRefIntf mapper = this.getSqlSessionTemplate().getMapper(CdCountryRefIntf.class);
		return mapper.selectAllByRecord(cdCountryRef);
	}
	
	public PageInfo selectPageByRecord(CdCountryRef cdCountryRef) throws BaseException {
		PageModel pageModel = cdCountryRef.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		CdCountryRefIntf mapper = this.getSqlSessionTemplate().getMapper(CdCountryRefIntf.class);
		mapper.selectAllByRecord(cdCountryRef);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public CdCountryRef selectOneByRecord(CdCountryRef cdCountryRef) throws BaseException {
		List<CdCountryRef> resultList = selectAllByRecord(cdCountryRef);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public CdCountryRef saveCdCountryRef(CdCountryRef cdCountryRef) throws BaseException {
		CdCountryRefIntf mapper = this.getSqlSessionTemplate().getMapper(CdCountryRefIntf.class);
		if(cdCountryRef.getCdCountryRefId() == null){
			mapper.insertCdCountryRef(cdCountryRef);
			cdCountryRef = selectCdCountryRefById(getLastPk());
		}else{
			mapper.updateCdCountryRef(cdCountryRef);
			cdCountryRef = mapper.selectCdCountryRefById(cdCountryRef.getCdCountryRefId());
		}
		return cdCountryRef;
	}
}