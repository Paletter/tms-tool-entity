package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.WmLocationCurrent;
import com.palette.busi.project.tms.core.dao.WmLocationCurrentIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class WmLocationCurrentDao extends BaseDaoImpl {
	
	public WmLocationCurrent updateWmLocationCurrent(WmLocationCurrent wmLocationCurrent) throws BaseException {
		WmLocationCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationCurrentIntf.class);
		mapper.updateWmLocationCurrent(wmLocationCurrent);
		return wmLocationCurrent;
	}
	
	public WmLocationCurrent insertWmLocationCurrent(WmLocationCurrent wmLocationCurrent) throws BaseException {
		WmLocationCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationCurrentIntf.class);
		mapper.insertWmLocationCurrent(wmLocationCurrent);
		if(wmLocationCurrent.getWmLocationCurrentId() == null){
			wmLocationCurrent.setWmLocationCurrentId(getLastPk());
		}
		return wmLocationCurrent;
	}
	
	public WmLocationCurrent selectWmLocationCurrentById(Integer wmLocationCurrentId) throws BaseException {
		WmLocationCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationCurrentIntf.class);
		return mapper.selectWmLocationCurrentById(wmLocationCurrentId);
	}
	
	public Integer deleteWmLocationCurrent(Integer wmLocationCurrentId) throws BaseException {
		WmLocationCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationCurrentIntf.class);
		return mapper.deleteWmLocationCurrent(wmLocationCurrentId);
	}
	
	public List<WmLocationCurrent> selectAllWmLocationCurrent() throws BaseException {
		WmLocationCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationCurrentIntf.class);
		List<WmLocationCurrent> allWmLocationCurrent = mapper.selectAllWmLocationCurrent();
		return allWmLocationCurrent;
	}
	
	public List<WmLocationCurrent> selectAllByRecord(WmLocationCurrent wmLocationCurrent) throws BaseException {
		WmLocationCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationCurrentIntf.class);
		return mapper.selectAllByRecord(wmLocationCurrent);
	}
	
	public PageInfo selectPageByRecord(WmLocationCurrent wmLocationCurrent) throws BaseException {
		PageModel pageModel = wmLocationCurrent.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		WmLocationCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationCurrentIntf.class);
		mapper.selectAllByRecord(wmLocationCurrent);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public WmLocationCurrent selectOneByRecord(WmLocationCurrent wmLocationCurrent) throws BaseException {
		List<WmLocationCurrent> resultList = selectAllByRecord(wmLocationCurrent);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public WmLocationCurrent saveWmLocationCurrent(WmLocationCurrent wmLocationCurrent) throws BaseException {
		WmLocationCurrentIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationCurrentIntf.class);
		if(wmLocationCurrent.getWmLocationCurrentId() == null){
			mapper.insertWmLocationCurrent(wmLocationCurrent);
			wmLocationCurrent = selectWmLocationCurrentById(getLastPk());
		}else{
			mapper.updateWmLocationCurrent(wmLocationCurrent);
			wmLocationCurrent = mapper.selectWmLocationCurrentById(wmLocationCurrent.getWmLocationCurrentId());
		}
		return wmLocationCurrent;
	}
}