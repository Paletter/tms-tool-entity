package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.TmPiecesAction;
import com.palette.busi.project.tms.core.dao.TmPiecesActionIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class TmPiecesActionDao extends BaseDaoImpl {
	
	public TmPiecesAction updateTmPiecesAction(TmPiecesAction tmPiecesAction) throws BaseException {
		TmPiecesActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesActionIntf.class);
		mapper.updateTmPiecesAction(tmPiecesAction);
		return tmPiecesAction;
	}
	
	public TmPiecesAction insertTmPiecesAction(TmPiecesAction tmPiecesAction) throws BaseException {
		TmPiecesActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesActionIntf.class);
		mapper.insertTmPiecesAction(tmPiecesAction);
		if(tmPiecesAction.getTmPiecesActionId() == null){
			tmPiecesAction.setTmPiecesActionId(getLastPk());
		}
		return tmPiecesAction;
	}
	
	public TmPiecesAction selectTmPiecesActionById(Integer tmPiecesActionId) throws BaseException {
		TmPiecesActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesActionIntf.class);
		return mapper.selectTmPiecesActionById(tmPiecesActionId);
	}
	
	public Integer deleteTmPiecesAction(Integer tmPiecesActionId) throws BaseException {
		TmPiecesActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesActionIntf.class);
		return mapper.deleteTmPiecesAction(tmPiecesActionId);
	}
	
	public List<TmPiecesAction> selectAllTmPiecesAction() throws BaseException {
		TmPiecesActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesActionIntf.class);
		List<TmPiecesAction> allTmPiecesAction = mapper.selectAllTmPiecesAction();
		return allTmPiecesAction;
	}
	
	public List<TmPiecesAction> selectAllByRecord(TmPiecesAction tmPiecesAction) throws BaseException {
		TmPiecesActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesActionIntf.class);
		return mapper.selectAllByRecord(tmPiecesAction);
	}
	
	public PageInfo selectPageByRecord(TmPiecesAction tmPiecesAction) throws BaseException {
		PageModel pageModel = tmPiecesAction.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		TmPiecesActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesActionIntf.class);
		mapper.selectAllByRecord(tmPiecesAction);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public TmPiecesAction selectOneByRecord(TmPiecesAction tmPiecesAction) throws BaseException {
		List<TmPiecesAction> resultList = selectAllByRecord(tmPiecesAction);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public TmPiecesAction saveTmPiecesAction(TmPiecesAction tmPiecesAction) throws BaseException {
		TmPiecesActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesActionIntf.class);
		if(tmPiecesAction.getTmPiecesActionId() == null){
			mapper.insertTmPiecesAction(tmPiecesAction);
			tmPiecesAction = selectTmPiecesActionById(getLastPk());
		}else{
			mapper.updateTmPiecesAction(tmPiecesAction);
			tmPiecesAction = mapper.selectTmPiecesActionById(tmPiecesAction.getTmPiecesActionId());
		}
		return tmPiecesAction;
	}
}