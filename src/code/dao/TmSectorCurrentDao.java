package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.TmSectorCurrent;
import com.palette.busi.project.tms.core.dao.TmSectorCurrentIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class TmSectorCurrentDao extends BaseDaoImpl {
	
	public TmSectorCurrent updateTmSectorCurrent(TmSectorCurrent tmSectorCurrent) throws BaseException {
		TmSectorCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorCurrentIntf.class);
		mapper.updateTmSectorCurrent(tmSectorCurrent);
		return tmSectorCurrent;
	}
	
	public TmSectorCurrent insertTmSectorCurrent(TmSectorCurrent tmSectorCurrent) throws BaseException {
		TmSectorCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorCurrentIntf.class);
		mapper.insertTmSectorCurrent(tmSectorCurrent);
		if(tmSectorCurrent.getTmSectorCurrentId() == null){
			tmSectorCurrent.setTmSectorCurrentId(getLastPk());
		}
		return tmSectorCurrent;
	}
	
	public TmSectorCurrent selectTmSectorCurrentById(Integer tmSectorCurrentId) throws BaseException {
		TmSectorCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorCurrentIntf.class);
		return mapper.selectTmSectorCurrentById(tmSectorCurrentId);
	}
	
	public Integer deleteTmSectorCurrent(Integer tmSectorCurrentId) throws BaseException {
		TmSectorCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorCurrentIntf.class);
		return mapper.deleteTmSectorCurrent(tmSectorCurrentId);
	}
	
	public List<TmSectorCurrent> selectAllTmSectorCurrent() throws BaseException {
		TmSectorCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorCurrentIntf.class);
		List<TmSectorCurrent> allTmSectorCurrent = mapper.selectAllTmSectorCurrent();
		return allTmSectorCurrent;
	}
	
	public List<TmSectorCurrent> selectAllByRecord(TmSectorCurrent tmSectorCurrent) throws BaseException {
		TmSectorCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorCurrentIntf.class);
		return mapper.selectAllByRecord(tmSectorCurrent);
	}
	
	public PageInfo selectPageByRecord(TmSectorCurrent tmSectorCurrent) throws BaseException {
		PageModel pageModel = tmSectorCurrent.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		TmSectorCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorCurrentIntf.class);
		mapper.selectAllByRecord(tmSectorCurrent);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public TmSectorCurrent selectOneByRecord(TmSectorCurrent tmSectorCurrent) throws BaseException {
		List<TmSectorCurrent> resultList = selectAllByRecord(tmSectorCurrent);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public TmSectorCurrent saveTmSectorCurrent(TmSectorCurrent tmSectorCurrent) throws BaseException {
		TmSectorCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorCurrentIntf.class);
		if(tmSectorCurrent.getTmSectorCurrentId() == null){
			mapper.insertTmSectorCurrent(tmSectorCurrent);
			tmSectorCurrent = selectTmSectorCurrentById(getLastPk());
		}else{
			mapper.updateTmSectorCurrent(tmSectorCurrent);
			tmSectorCurrent = mapper.selectTmSectorCurrentById(tmSectorCurrent.getTmSectorCurrentId());
		}
		return tmSectorCurrent;
	}
}