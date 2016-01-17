package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.WmDeliveryOrderRef;
import com.palette.busi.project.tms.core.dao.WmDeliveryOrderRefIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class WmDeliveryOrderRefDao extends BaseDaoImpl {
	
	public WmDeliveryOrderRef updateWmDeliveryOrderRef(WmDeliveryOrderRef wmDeliveryOrderRef) throws BaseException {
		WmDeliveryOrderRefIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderRefIntf.class);
		mapper.updateWmDeliveryOrderRef(wmDeliveryOrderRef);
		return wmDeliveryOrderRef;
	}
	
	public WmDeliveryOrderRef insertWmDeliveryOrderRef(WmDeliveryOrderRef wmDeliveryOrderRef) throws BaseException {
		WmDeliveryOrderRefIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderRefIntf.class);
		mapper.insertWmDeliveryOrderRef(wmDeliveryOrderRef);
		if(wmDeliveryOrderRef.getWmDeliveryOrderRefId() == null){
			wmDeliveryOrderRef.setWmDeliveryOrderRefId(getLastPk());
		}
		return wmDeliveryOrderRef;
	}
	
	public WmDeliveryOrderRef selectWmDeliveryOrderRefById(Integer wmDeliveryOrderRefId) throws BaseException {
		WmDeliveryOrderRefIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderRefIntf.class);
		return mapper.selectWmDeliveryOrderRefById(wmDeliveryOrderRefId);
	}
	
	public Integer deleteWmDeliveryOrderRef(Integer wmDeliveryOrderRefId) throws BaseException {
		WmDeliveryOrderRefIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderRefIntf.class);
		return mapper.deleteWmDeliveryOrderRef(wmDeliveryOrderRefId);
	}
	
	public List<WmDeliveryOrderRef> selectAllWmDeliveryOrderRef() throws BaseException {
		WmDeliveryOrderRefIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderRefIntf.class);
		List<WmDeliveryOrderRef> allWmDeliveryOrderRef = mapper.selectAllWmDeliveryOrderRef();
		return allWmDeliveryOrderRef;
	}
	
	public List<WmDeliveryOrderRef> selectAllByRecord(WmDeliveryOrderRef wmDeliveryOrderRef) throws BaseException {
		WmDeliveryOrderRefIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderRefIntf.class);
		return mapper.selectAllByRecord(wmDeliveryOrderRef);
	}
	
	public PageInfo selectPageByRecord(WmDeliveryOrderRef wmDeliveryOrderRef) throws BaseException {
		PageModel pageModel = wmDeliveryOrderRef.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		WmDeliveryOrderRefIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderRefIntf.class);
		mapper.selectAllByRecord(wmDeliveryOrderRef);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public WmDeliveryOrderRef selectOneByRecord(WmDeliveryOrderRef wmDeliveryOrderRef) throws BaseException {
		List<WmDeliveryOrderRef> resultList = selectAllByRecord(wmDeliveryOrderRef);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public WmDeliveryOrderRef saveWmDeliveryOrderRef(WmDeliveryOrderRef wmDeliveryOrderRef) throws BaseException {
		WmDeliveryOrderRefIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderRefIntf.class);
		if(wmDeliveryOrderRef.getWmDeliveryOrderRefId() == null){
			mapper.insertWmDeliveryOrderRef(wmDeliveryOrderRef);
			wmDeliveryOrderRef = selectWmDeliveryOrderRefById(getLastPk());
		}else{
			mapper.updateWmDeliveryOrderRef(wmDeliveryOrderRef);
			wmDeliveryOrderRef = mapper.selectWmDeliveryOrderRefById(wmDeliveryOrderRef.getWmDeliveryOrderRefId());
		}
		return wmDeliveryOrderRef;
	}
}