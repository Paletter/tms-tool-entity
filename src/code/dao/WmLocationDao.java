package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.WmLocation;
import com.palette.busi.project.tms.core.dao.WmLocationIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class WmLocationDao extends BaseDaoImpl {
	
	public WmLocation updateWmLocation(WmLocation wmLocation) throws BaseException {
		WmLocationIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationIntf.class);
		mapper.updateWmLocation(wmLocation);
		return wmLocation;
	}
	
	public WmLocation insertWmLocation(WmLocation wmLocation) throws BaseException {
		WmLocationIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationIntf.class);
		mapper.insertWmLocation(wmLocation);
		if(wmLocation.getWmLocationId() == null){
			wmLocation.setWmLocationId(getLastPk());
		}
		return wmLocation;
	}
	
	public WmLocation selectWmLocationById(Integer wmLocationId) throws BaseException {
		WmLocationIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationIntf.class);
		return mapper.selectWmLocationById(wmLocationId);
	}
	
	public Integer deleteWmLocation(Integer wmLocationId) throws BaseException {
		WmLocationIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationIntf.class);
		return mapper.deleteWmLocation(wmLocationId);
	}
	
	public List<WmLocation> selectAllWmLocation() throws BaseException {
		WmLocationIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationIntf.class);
		List<WmLocation> allWmLocation = mapper.selectAllWmLocation();
		return allWmLocation;
	}
	
	public List<WmLocation> selectAllByRecord(WmLocation wmLocation) throws BaseException {
		WmLocationIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationIntf.class);
		return mapper.selectAllByRecord(wmLocation);
	}
	
	public PageInfo selectPageByRecord(WmLocation wmLocation) throws BaseException {
		PageModel pageModel = wmLocation.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		WmLocationIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationIntf.class);
		mapper.selectAllByRecord(wmLocation);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public WmLocation selectOneByRecord(WmLocation wmLocation) throws BaseException {
		List<WmLocation> resultList = selectAllByRecord(wmLocation);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public WmLocation saveWmLocation(WmLocation wmLocation) throws BaseException {
		WmLocationIntf mapper = this.getSqlSessionTemplate().getMapper(WmLocationIntf.class);
		if(wmLocation.getWmLocationId() == null){
			mapper.insertWmLocation(wmLocation);
			wmLocation = selectWmLocationById(getLastPk());
		}else{
			mapper.updateWmLocation(wmLocation);
			wmLocation = mapper.selectWmLocationById(wmLocation.getWmLocationId());
		}
		return wmLocation;
	}
}