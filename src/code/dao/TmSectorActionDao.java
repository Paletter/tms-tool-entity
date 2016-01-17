package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.TmSectorAction;
import com.palette.busi.project.tms.core.dao.TmSectorActionIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class TmSectorActionDao extends BaseDaoImpl {
	
	public TmSectorAction updateTmSectorAction(TmSectorAction tmSectorAction) throws BaseException {
		TmSectorActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorActionIntf.class);
		mapper.updateTmSectorAction(tmSectorAction);
		return tmSectorAction;
	}
	
	public TmSectorAction insertTmSectorAction(TmSectorAction tmSectorAction) throws BaseException {
		TmSectorActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorActionIntf.class);
		mapper.insertTmSectorAction(tmSectorAction);
		if(tmSectorAction.getTmSectorActionId() == null){
			tmSectorAction.setTmSectorActionId(getLastPk());
		}
		return tmSectorAction;
	}
	
	public TmSectorAction selectTmSectorActionById(Integer tmSectorActionId) throws BaseException {
		TmSectorActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorActionIntf.class);
		return mapper.selectTmSectorActionById(tmSectorActionId);
	}
	
	public Integer deleteTmSectorAction(Integer tmSectorActionId) throws BaseException {
		TmSectorActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorActionIntf.class);
		return mapper.deleteTmSectorAction(tmSectorActionId);
	}
	
	public List<TmSectorAction> selectAllTmSectorAction() throws BaseException {
		TmSectorActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorActionIntf.class);
		List<TmSectorAction> allTmSectorAction = mapper.selectAllTmSectorAction();
		return allTmSectorAction;
	}
	
	public List<TmSectorAction> selectAllByRecord(TmSectorAction tmSectorAction) throws BaseException {
		TmSectorActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorActionIntf.class);
		return mapper.selectAllByRecord(tmSectorAction);
	}
	
	public PageInfo selectPageByRecord(TmSectorAction tmSectorAction) throws BaseException {
		PageModel pageModel = tmSectorAction.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		TmSectorActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorActionIntf.class);
		mapper.selectAllByRecord(tmSectorAction);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public TmSectorAction selectOneByRecord(TmSectorAction tmSectorAction) throws BaseException {
		List<TmSectorAction> resultList = selectAllByRecord(tmSectorAction);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public TmSectorAction saveTmSectorAction(TmSectorAction tmSectorAction) throws BaseException {
		TmSectorActionIntf mapper = this.getSqlSessionTemplate().getMapper(TmSectorActionIntf.class);
		if(tmSectorAction.getTmSectorActionId() == null){
			mapper.insertTmSectorAction(tmSectorAction);
			tmSectorAction = selectTmSectorActionById(getLastPk());
		}else{
			mapper.updateTmSectorAction(tmSectorAction);
			tmSectorAction = mapper.selectTmSectorActionById(tmSectorAction.getTmSectorActionId());
		}
		return tmSectorAction;
	}
}