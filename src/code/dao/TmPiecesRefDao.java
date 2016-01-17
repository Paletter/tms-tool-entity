package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.TmPiecesRef;
import com.palette.busi.project.tms.core.dao.TmPiecesRefIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class TmPiecesRefDao extends BaseDaoImpl {
	
	public TmPiecesRef updateTmPiecesRef(TmPiecesRef tmPiecesRef) throws BaseException {
		TmPiecesRefIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesRefIntf.class);
		mapper.updateTmPiecesRef(tmPiecesRef);
		return tmPiecesRef;
	}
	
	public TmPiecesRef insertTmPiecesRef(TmPiecesRef tmPiecesRef) throws BaseException {
		TmPiecesRefIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesRefIntf.class);
		mapper.insertTmPiecesRef(tmPiecesRef);
		if(tmPiecesRef.getTmPiecesRefId() == null){
			tmPiecesRef.setTmPiecesRefId(getLastPk());
		}
		return tmPiecesRef;
	}
	
	public TmPiecesRef selectTmPiecesRefById(Integer tmPiecesRefId) throws BaseException {
		TmPiecesRefIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesRefIntf.class);
		return mapper.selectTmPiecesRefById(tmPiecesRefId);
	}
	
	public Integer deleteTmPiecesRef(Integer tmPiecesRefId) throws BaseException {
		TmPiecesRefIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesRefIntf.class);
		return mapper.deleteTmPiecesRef(tmPiecesRefId);
	}
	
	public List<TmPiecesRef> selectAllTmPiecesRef() throws BaseException {
		TmPiecesRefIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesRefIntf.class);
		List<TmPiecesRef> allTmPiecesRef = mapper.selectAllTmPiecesRef();
		return allTmPiecesRef;
	}
	
	public List<TmPiecesRef> selectAllByRecord(TmPiecesRef tmPiecesRef) throws BaseException {
		TmPiecesRefIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesRefIntf.class);
		return mapper.selectAllByRecord(tmPiecesRef);
	}
	
	public PageInfo selectPageByRecord(TmPiecesRef tmPiecesRef) throws BaseException {
		PageModel pageModel = tmPiecesRef.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		TmPiecesRefIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesRefIntf.class);
		mapper.selectAllByRecord(tmPiecesRef);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public TmPiecesRef selectOneByRecord(TmPiecesRef tmPiecesRef) throws BaseException {
		List<TmPiecesRef> resultList = selectAllByRecord(tmPiecesRef);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public TmPiecesRef saveTmPiecesRef(TmPiecesRef tmPiecesRef) throws BaseException {
		TmPiecesRefIntf mapper = this.getSqlSessionTemplate().getMapper(TmPiecesRefIntf.class);
		if(tmPiecesRef.getTmPiecesRefId() == null){
			mapper.insertTmPiecesRef(tmPiecesRef);
			tmPiecesRef = selectTmPiecesRefById(getLastPk());
		}else{
			mapper.updateTmPiecesRef(tmPiecesRef);
			tmPiecesRef = mapper.selectTmPiecesRefById(tmPiecesRef.getTmPiecesRefId());
		}
		return tmPiecesRef;
	}
}