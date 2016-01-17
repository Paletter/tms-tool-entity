package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.CdServiceProduct;
import com.palette.busi.project.tms.core.dao.CdServiceProductIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class CdServiceProductDao extends BaseDaoImpl {
	
	public CdServiceProduct updateCdServiceProduct(CdServiceProduct cdServiceProduct) throws BaseException {
		CdServiceProductIntf mapper = this.getSqlSessionTemplate().getMapper(CdServiceProductIntf.class);
		mapper.updateCdServiceProduct(cdServiceProduct);
		return cdServiceProduct;
	}
	
	public CdServiceProduct insertCdServiceProduct(CdServiceProduct cdServiceProduct) throws BaseException {
		CdServiceProductIntf mapper = this.getSqlSessionTemplate().getMapper(CdServiceProductIntf.class);
		mapper.insertCdServiceProduct(cdServiceProduct);
		if(cdServiceProduct.getCdServiceProductId() == null){
			cdServiceProduct.setCdServiceProductId(getLastPk());
		}
		return cdServiceProduct;
	}
	
	public CdServiceProduct selectCdServiceProductById(Integer cdServiceProductId) throws BaseException {
		CdServiceProductIntf mapper = this.getSqlSessionTemplate().getMapper(CdServiceProductIntf.class);
		return mapper.selectCdServiceProductById(cdServiceProductId);
	}
	
	public Integer deleteCdServiceProduct(Integer cdServiceProductId) throws BaseException {
		CdServiceProductIntf mapper = this.getSqlSessionTemplate().getMapper(CdServiceProductIntf.class);
		return mapper.deleteCdServiceProduct(cdServiceProductId);
	}
	
	public List<CdServiceProduct> selectAllCdServiceProduct() throws BaseException {
		CdServiceProductIntf mapper = this.getSqlSessionTemplate().getMapper(CdServiceProductIntf.class);
		List<CdServiceProduct> allCdServiceProduct = mapper.selectAllCdServiceProduct();
		return allCdServiceProduct;
	}
	
	public List<CdServiceProduct> selectAllByRecord(CdServiceProduct cdServiceProduct) throws BaseException {
		CdServiceProductIntf mapper = this.getSqlSessionTemplate().getMapper(CdServiceProductIntf.class);
		return mapper.selectAllByRecord(cdServiceProduct);
	}
	
	public PageInfo selectPageByRecord(CdServiceProduct cdServiceProduct) throws BaseException {
		PageModel pageModel = cdServiceProduct.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		CdServiceProductIntf mapper = this.getSqlSessionTemplate().getMapper(CdServiceProductIntf.class);
		mapper.selectAllByRecord(cdServiceProduct);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public CdServiceProduct selectOneByRecord(CdServiceProduct cdServiceProduct) throws BaseException {
		List<CdServiceProduct> resultList = selectAllByRecord(cdServiceProduct);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public CdServiceProduct saveCdServiceProduct(CdServiceProduct cdServiceProduct) throws BaseException {
		CdServiceProductIntf mapper = this.getSqlSessionTemplate().getMapper(CdServiceProductIntf.class);
		if(cdServiceProduct.getCdServiceProductId() == null){
			mapper.insertCdServiceProduct(cdServiceProduct);
			cdServiceProduct = selectCdServiceProductById(getLastPk());
		}else{
			mapper.updateCdServiceProduct(cdServiceProduct);
			cdServiceProduct = mapper.selectCdServiceProductById(cdServiceProduct.getCdServiceProductId());
		}
		return cdServiceProduct;
	}
}