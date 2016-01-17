package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.TmSector;
import com.palette.busi.project.tms.core.dao.TmSectorIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class TmSectorDao extends BaseDaoImpl {
	
	public TmSector updateTmSector(TmSector tmSector) throws BaseException {
		TmSectorIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorIntf.class);
		mapper.updateTmSector(tmSector);
		return tmSector;
	}
	
	public TmSector insertTmSector(TmSector tmSector) throws BaseException {
		TmSectorIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorIntf.class);
		mapper.insertTmSector(tmSector);
		if(tmSector.getTmSectorId() == null){
			tmSector.setTmSectorId(getLastPk());
		}
		return tmSector;
	}
	
	public TmSector selectTmSectorById(Integer tmSectorId) throws BaseException {
		TmSectorIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorIntf.class);
		return mapper.selectTmSectorById(tmSectorId);
	}
	
	public Integer deleteTmSector(Integer tmSectorId) throws BaseException {
		TmSectorIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorIntf.class);
		return mapper.deleteTmSector(tmSectorId);
	}
	
	public List<TmSector> selectAllTmSector() throws BaseException {
		TmSectorIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorIntf.class);
		List<TmSector> allTmSector = mapper.selectAllTmSector();
		return allTmSector;
	}
	
	public List<TmSector> selectAllByRecord(TmSector tmSector) throws BaseException {
		TmSectorIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorIntf.class);
		return mapper.selectAllByRecord(tmSector);
	}
	
	public PageInfo selectPageByRecord(TmSector tmSector) throws BaseException {
		PageModel pageModel = tmSector.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		TmSectorIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorIntf.class);
		mapper.selectAllByRecord(tmSector);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public TmSector selectOneByRecord(TmSector tmSector) throws BaseException {
		List<TmSector> resultList = selectAllByRecord(tmSector);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public TmSector saveTmSector(TmSector tmSector) throws BaseException {
		TmSectorIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorIntf.class);
		if(tmSector.getTmSectorId() == null){
			mapper.insertTmSector(tmSector);
			tmSector = selectTmSectorById(getLastPk());
		}else{
			mapper.updateTmSector(tmSector);
			tmSector = mapper.selectTmSectorById(tmSector.getTmSectorId());
		}
		return tmSector;
	}
}