package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.TmPiecesHistory;
import com.palette.busi.project.tms.core.dao.TmPiecesHistoryIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class TmPiecesHistoryDao extends BaseDaoImpl {
	
	public TmPiecesHistory updateTmPiecesHistory(TmPiecesHistory tmPiecesHistory) throws BaseException {
		TmPiecesHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesHistoryIntf.class);
		mapper.updateTmPiecesHistory(tmPiecesHistory);
		return tmPiecesHistory;
	}
	
	public TmPiecesHistory insertTmPiecesHistory(TmPiecesHistory tmPiecesHistory) throws BaseException {
		TmPiecesHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesHistoryIntf.class);
		mapper.insertTmPiecesHistory(tmPiecesHistory);
		if(tmPiecesHistory.getTmPiecesHistoryId() == null){
			tmPiecesHistory.setTmPiecesHistoryId(getLastPk());
		}
		return tmPiecesHistory;
	}
	
	public TmPiecesHistory selectTmPiecesHistoryById(Integer tmPiecesHistoryId) throws BaseException {
		TmPiecesHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesHistoryIntf.class);
		return mapper.selectTmPiecesHistoryById(tmPiecesHistoryId);
	}
	
	public Integer deleteTmPiecesHistory(Integer tmPiecesHistoryId) throws BaseException {
		TmPiecesHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesHistoryIntf.class);
		return mapper.deleteTmPiecesHistory(tmPiecesHistoryId);
	}
	
	public List<TmPiecesHistory> selectAllTmPiecesHistory() throws BaseException {
		TmPiecesHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesHistoryIntf.class);
		List<TmPiecesHistory> allTmPiecesHistory = mapper.selectAllTmPiecesHistory();
		return allTmPiecesHistory;
	}
	
	public List<TmPiecesHistory> selectAllByRecord(TmPiecesHistory tmPiecesHistory) throws BaseException {
		TmPiecesHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesHistoryIntf.class);
		return mapper.selectAllByRecord(tmPiecesHistory);
	}
	
	public PageInfo selectPageByRecord(TmPiecesHistory tmPiecesHistory) throws BaseException {
		PageModel pageModel = tmPiecesHistory.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		TmPiecesHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesHistoryIntf.class);
		mapper.selectAllByRecord(tmPiecesHistory);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public TmPiecesHistory selectOneByRecord(TmPiecesHistory tmPiecesHistory) throws BaseException {
		List<TmPiecesHistory> resultList = selectAllByRecord(tmPiecesHistory);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public TmPiecesHistory saveTmPiecesHistory(TmPiecesHistory tmPiecesHistory) throws BaseException {
		TmPiecesHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesHistoryIntf.class);
		if(tmPiecesHistory.getTmPiecesHistoryId() == null){
			mapper.insertTmPiecesHistory(tmPiecesHistory);
			tmPiecesHistory = selectTmPiecesHistoryById(getLastPk());
		}else{
			mapper.updateTmPiecesHistory(tmPiecesHistory);
			tmPiecesHistory = mapper.selectTmPiecesHistoryById(tmPiecesHistory.getTmPiecesHistoryId());
		}
		return tmPiecesHistory;
	}
}