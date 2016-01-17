package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.CdUserWarehouse;
import com.palette.busi.project.tms.core.dao.CdUserWarehouseIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class CdUserWarehouseDao extends BaseDaoImpl {
	
	public CdUserWarehouse updateCdUserWarehouse(CdUserWarehouse cdUserWarehouse) throws BaseException {
		CdUserWarehouseIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserWarehouseIntf.class);
		mapper.updateCdUserWarehouse(cdUserWarehouse);
		return cdUserWarehouse;
	}
	
	public CdUserWarehouse insertCdUserWarehouse(CdUserWarehouse cdUserWarehouse) throws BaseException {
		CdUserWarehouseIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserWarehouseIntf.class);
		mapper.insertCdUserWarehouse(cdUserWarehouse);
		if(cdUserWarehouse.getCdUserWarehouseId() == null){
			cdUserWarehouse.setCdUserWarehouseId(getLastPk());
		}
		return cdUserWarehouse;
	}
	
	public CdUserWarehouse selectCdUserWarehouseById(Integer cdUserWarehouseId) throws BaseException {
		CdUserWarehouseIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserWarehouseIntf.class);
		return mapper.selectCdUserWarehouseById(cdUserWarehouseId);
	}
	
	public Integer deleteCdUserWarehouse(Integer cdUserWarehouseId) throws BaseException {
		CdUserWarehouseIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserWarehouseIntf.class);
		return mapper.deleteCdUserWarehouse(cdUserWarehouseId);
	}
	
	public List<CdUserWarehouse> selectAllCdUserWarehouse() throws BaseException {
		CdUserWarehouseIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserWarehouseIntf.class);
		List<CdUserWarehouse> allCdUserWarehouse = mapper.selectAllCdUserWarehouse();
		return allCdUserWarehouse;
	}
	
	public List<CdUserWarehouse> selectAllByRecord(CdUserWarehouse cdUserWarehouse) throws BaseException {
		CdUserWarehouseIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserWarehouseIntf.class);
		return mapper.selectAllByRecord(cdUserWarehouse);
	}
	
	public PageInfo selectPageByRecord(CdUserWarehouse cdUserWarehouse) throws BaseException {
		PageModel pageModel = cdUserWarehouse.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		CdUserWarehouseIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserWarehouseIntf.class);
		mapper.selectAllByRecord(cdUserWarehouse);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public CdUserWarehouse selectOneByRecord(CdUserWarehouse cdUserWarehouse) throws BaseException {
		List<CdUserWarehouse> resultList = selectAllByRecord(cdUserWarehouse);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public CdUserWarehouse saveCdUserWarehouse(CdUserWarehouse cdUserWarehouse) throws BaseException {
		CdUserWarehouseIntf mapper = this.getSqlSessionTemplate().getMapper(CdUserWarehouseIntf.class);
		if(cdUserWarehouse.getCdUserWarehouseId() == null){
			mapper.insertCdUserWarehouse(cdUserWarehouse);
			cdUserWarehouse = selectCdUserWarehouseById(getLastPk());
		}else{
			mapper.updateCdUserWarehouse(cdUserWarehouse);
			cdUserWarehouse = mapper.selectCdUserWarehouseById(cdUserWarehouse.getCdUserWarehouseId());
		}
		return cdUserWarehouse;
	}
}