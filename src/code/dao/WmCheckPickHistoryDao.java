package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.WmCheckPickHistory;
import com.palette.busi.project.tms.core.dao.WmCheckPickHistoryIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class WmCheckPickHistoryDao extends BaseDaoImpl {
	
	public WmCheckPickHistory updateWmCheckPickHistory(WmCheckPickHistory wmCheckPickHistory) throws BaseException {
		WmCheckPickHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(WmCheckPickHistoryIntf.class);
		mapper.updateWmCheckPickHistory(wmCheckPickHistory);
		return wmCheckPickHistory;
	}
	
	public WmCheckPickHistory insertWmCheckPickHistory(WmCheckPickHistory wmCheckPickHistory) throws BaseException {
		WmCheckPickHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(WmCheckPickHistoryIntf.class);
		mapper.insertWmCheckPickHistory(wmCheckPickHistory);
		if(wmCheckPickHistory.getWmCheckPickHistoryId() == null){
			wmCheckPickHistory.setWmCheckPickHistoryId(getLastPk());
		}
		return wmCheckPickHistory;
	}
	
	public WmCheckPickHistory selectWmCheckPickHistoryById(Integer wmCheckPickHistoryId) throws BaseException {
		WmCheckPickHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(WmCheckPickHistoryIntf.class);
		return mapper.selectWmCheckPickHistoryById(wmCheckPickHistoryId);
	}
	
	public Integer deleteWmCheckPickHistory(Integer wmCheckPickHistoryId) throws BaseException {
		WmCheckPickHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(WmCheckPickHistoryIntf.class);
		return mapper.deleteWmCheckPickHistory(wmCheckPickHistoryId);
	}
	
	public List<WmCheckPickHistory> selectAllWmCheckPickHistory() throws BaseException {
		WmCheckPickHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(WmCheckPickHistoryIntf.class);
		List<WmCheckPickHistory> allWmCheckPickHistory = mapper.selectAllWmCheckPickHistory();
		return allWmCheckPickHistory;
	}
	
	public List<WmCheckPickHistory> selectAllByRecord(WmCheckPickHistory wmCheckPickHistory) throws BaseException {
		WmCheckPickHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(WmCheckPickHistoryIntf.class);
		return mapper.selectAllByRecord(wmCheckPickHistory);
	}
	
	public PageInfo selectPageByRecord(WmCheckPickHistory wmCheckPickHistory) throws BaseException {
		PageModel pageModel = wmCheckPickHistory.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		WmCheckPickHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(WmCheckPickHistoryIntf.class);
		mapper.selectAllByRecord(wmCheckPickHistory);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public WmCheckPickHistory selectOneByRecord(WmCheckPickHistory wmCheckPickHistory) throws BaseException {
		List<WmCheckPickHistory> resultList = selectAllByRecord(wmCheckPickHistory);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public WmCheckPickHistory saveWmCheckPickHistory(WmCheckPickHistory wmCheckPickHistory) throws BaseException {
		WmCheckPickHistoryIntf mapper = this.getSqlSessionTemplate().getMapper(WmCheckPickHistoryIntf.class);
		if(wmCheckPickHistory.getWmCheckPickHistoryId() == null){
			mapper.insertWmCheckPickHistory(wmCheckPickHistory);
			wmCheckPickHistory = selectWmCheckPickHistoryById(getLastPk());
		}else{
			mapper.updateWmCheckPickHistory(wmCheckPickHistory);
			wmCheckPickHistory = mapper.selectWmCheckPickHistoryById(wmCheckPickHistory.getWmCheckPickHistoryId());
		}
		return wmCheckPickHistory;
	}
}