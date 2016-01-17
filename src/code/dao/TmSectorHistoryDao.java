package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.TmSectorHistory;
import com.palette.busi.project.tms.core.dao.TmSectorHistoryIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class TmSectorHistoryDao extends BaseDaoImpl {
	
	public TmSectorHistory updateTmSectorHistory(TmSectorHistory tmSectorHistory) throws BaseException {
		TmSectorHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorHistoryIntf.class);
		mapper.updateTmSectorHistory(tmSectorHistory);
		return tmSectorHistory;
	}
	
	public TmSectorHistory insertTmSectorHistory(TmSectorHistory tmSectorHistory) throws BaseException {
		TmSectorHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorHistoryIntf.class);
		mapper.insertTmSectorHistory(tmSectorHistory);
		if(tmSectorHistory.getTmSectorHistoryId() == null){
			tmSectorHistory.setTmSectorHistoryId(getLastPk());
		}
		return tmSectorHistory;
	}
	
	public TmSectorHistory selectTmSectorHistoryById(Integer tmSectorHistoryId) throws BaseException {
		TmSectorHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorHistoryIntf.class);
		return mapper.selectTmSectorHistoryById(tmSectorHistoryId);
	}
	
	public Integer deleteTmSectorHistory(Integer tmSectorHistoryId) throws BaseException {
		TmSectorHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorHistoryIntf.class);
		return mapper.deleteTmSectorHistory(tmSectorHistoryId);
	}
	
	public List<TmSectorHistory> selectAllTmSectorHistory() throws BaseException {
		TmSectorHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorHistoryIntf.class);
		List<TmSectorHistory> allTmSectorHistory = mapper.selectAllTmSectorHistory();
		return allTmSectorHistory;
	}
	
	public List<TmSectorHistory> selectAllByRecord(TmSectorHistory tmSectorHistory) throws BaseException {
		TmSectorHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorHistoryIntf.class);
		return mapper.selectAllByRecord(tmSectorHistory);
	}
	
	public PageInfo selectPageByRecord(TmSectorHistory tmSectorHistory) throws BaseException {
		PageModel pageModel = tmSectorHistory.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		TmSectorHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorHistoryIntf.class);
		mapper.selectAllByRecord(tmSectorHistory);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public TmSectorHistory selectOneByRecord(TmSectorHistory tmSectorHistory) throws BaseException {
		List<TmSectorHistory> resultList = selectAllByRecord(tmSectorHistory);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public TmSectorHistory saveTmSectorHistory(TmSectorHistory tmSectorHistory) throws BaseException {
		TmSectorHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorHistoryIntf.class);
		if(tmSectorHistory.getTmSectorHistoryId() == null){
			mapper.insertTmSectorHistory(tmSectorHistory);
			tmSectorHistory = selectTmSectorHistoryById(getLastPk());
		}else{
			mapper.updateTmSectorHistory(tmSectorHistory);
			tmSectorHistory = mapper.selectTmSectorHistoryById(tmSectorHistory.getTmSectorHistoryId());
		}
		return tmSectorHistory;
	}
}