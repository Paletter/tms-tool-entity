package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.CdLogisticsVendor;
import com.palette.busi.project.tms.core.dao.CdLogisticsVendorIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class CdLogisticsVendorDao extends BaseDaoImpl {
	
	public CdLogisticsVendor updateCdLogisticsVendor(CdLogisticsVendor cdLogisticsVendor) throws BaseException {
		CdLogisticsVendorIntf mapper = this.getSqlSessionTemplate().getMapper(CdLogisticsVendorIntf.class);
		mapper.updateCdLogisticsVendor(cdLogisticsVendor);
		return cdLogisticsVendor;
	}
	
	public CdLogisticsVendor insertCdLogisticsVendor(CdLogisticsVendor cdLogisticsVendor) throws BaseException {
		CdLogisticsVendorIntf mapper = this.getSqlSessionTemplate().getMapper(CdLogisticsVendorIntf.class);
		mapper.insertCdLogisticsVendor(cdLogisticsVendor);
		if(cdLogisticsVendor.getCdLogisticsVendorId() == null){
			cdLogisticsVendor.setCdLogisticsVendorId(getLastPk());
		}
		return cdLogisticsVendor;
	}
	
	public CdLogisticsVendor selectCdLogisticsVendorById(Integer cdLogisticsVendorId) throws BaseException {
		CdLogisticsVendorIntf mapper = this.getSqlSessionTemplate().getMapper(CdLogisticsVendorIntf.class);
		return mapper.selectCdLogisticsVendorById(cdLogisticsVendorId);
	}
	
	public Integer deleteCdLogisticsVendor(Integer cdLogisticsVendorId) throws BaseException {
		CdLogisticsVendorIntf mapper = this.getSqlSessionTemplate().getMapper(CdLogisticsVendorIntf.class);
		return mapper.deleteCdLogisticsVendor(cdLogisticsVendorId);
	}
	
	public List<CdLogisticsVendor> selectAllCdLogisticsVendor() throws BaseException {
		CdLogisticsVendorIntf mapper = this.getSqlSessionTemplate().getMapper(CdLogisticsVendorIntf.class);
		List<CdLogisticsVendor> allCdLogisticsVendor = mapper.selectAllCdLogisticsVendor();
		return allCdLogisticsVendor;
	}
	
	public List<CdLogisticsVendor> selectAllByRecord(CdLogisticsVendor cdLogisticsVendor) throws BaseException {
		CdLogisticsVendorIntf mapper = this.getSqlSessionTemplate().getMapper(CdLogisticsVendorIntf.class);
		return mapper.selectAllByRecord(cdLogisticsVendor);
	}
	
	public PageInfo selectPageByRecord(CdLogisticsVendor cdLogisticsVendor) throws BaseException {
		PageModel pageModel = cdLogisticsVendor.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		CdLogisticsVendorIntf mapper = this.getSqlSessionTemplate().getMapper(CdLogisticsVendorIntf.class);
		mapper.selectAllByRecord(cdLogisticsVendor);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public CdLogisticsVendor selectOneByRecord(CdLogisticsVendor cdLogisticsVendor) throws BaseException {
		List<CdLogisticsVendor> resultList = selectAllByRecord(cdLogisticsVendor);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public CdLogisticsVendor saveCdLogisticsVendor(CdLogisticsVendor cdLogisticsVendor) throws BaseException {
		CdLogisticsVendorIntf mapper = this.getSqlSessionTemplate().getMapper(CdLogisticsVendorIntf.class);
		if(cdLogisticsVendor.getCdLogisticsVendorId() == null){
			mapper.insertCdLogisticsVendor(cdLogisticsVendor);
			cdLogisticsVendor = selectCdLogisticsVendorById(getLastPk());
		}else{
			mapper.updateCdLogisticsVendor(cdLogisticsVendor);
			cdLogisticsVendor = mapper.selectCdLogisticsVendorById(cdLogisticsVendor.getCdLogisticsVendorId());
		}
		return cdLogisticsVendor;
	}
}