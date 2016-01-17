package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.WmDeliveryOrderItem;
import com.palette.busi.project.tms.core.dao.WmDeliveryOrderItemIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class WmDeliveryOrderItemDao extends BaseDaoImpl {
	
	public WmDeliveryOrderItem updateWmDeliveryOrderItem(WmDeliveryOrderItem wmDeliveryOrderItem) throws BaseException {
		WmDeliveryOrderItemIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderItemIntf.class);
		mapper.updateWmDeliveryOrderItem(wmDeliveryOrderItem);
		return wmDeliveryOrderItem;
	}
	
	public WmDeliveryOrderItem insertWmDeliveryOrderItem(WmDeliveryOrderItem wmDeliveryOrderItem) throws BaseException {
		WmDeliveryOrderItemIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderItemIntf.class);
		mapper.insertWmDeliveryOrderItem(wmDeliveryOrderItem);
		if(wmDeliveryOrderItem.getWmDeliveryOrderItemId() == null){
			wmDeliveryOrderItem.setWmDeliveryOrderItemId(getLastPk());
		}
		return wmDeliveryOrderItem;
	}
	
	public WmDeliveryOrderItem selectWmDeliveryOrderItemById(Integer wmDeliveryOrderItemId) throws BaseException {
		WmDeliveryOrderItemIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderItemIntf.class);
		return mapper.selectWmDeliveryOrderItemById(wmDeliveryOrderItemId);
	}
	
	public Integer deleteWmDeliveryOrderItem(Integer wmDeliveryOrderItemId) throws BaseException {
		WmDeliveryOrderItemIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderItemIntf.class);
		return mapper.deleteWmDeliveryOrderItem(wmDeliveryOrderItemId);
	}
	
	public List<WmDeliveryOrderItem> selectAllWmDeliveryOrderItem() throws BaseException {
		WmDeliveryOrderItemIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderItemIntf.class);
		List<WmDeliveryOrderItem> allWmDeliveryOrderItem = mapper.selectAllWmDeliveryOrderItem();
		return allWmDeliveryOrderItem;
	}
	
	public List<WmDeliveryOrderItem> selectAllByRecord(WmDeliveryOrderItem wmDeliveryOrderItem) throws BaseException {
		WmDeliveryOrderItemIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderItemIntf.class);
		return mapper.selectAllByRecord(wmDeliveryOrderItem);
	}
	
	public PageInfo selectPageByRecord(WmDeliveryOrderItem wmDeliveryOrderItem) throws BaseException {
		PageModel pageModel = wmDeliveryOrderItem.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		WmDeliveryOrderItemIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderItemIntf.class);
		mapper.selectAllByRecord(wmDeliveryOrderItem);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public WmDeliveryOrderItem selectOneByRecord(WmDeliveryOrderItem wmDeliveryOrderItem) throws BaseException {
		List<WmDeliveryOrderItem> resultList = selectAllByRecord(wmDeliveryOrderItem);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public WmDeliveryOrderItem saveWmDeliveryOrderItem(WmDeliveryOrderItem wmDeliveryOrderItem) throws BaseException {
		WmDeliveryOrderItemIntf mapper = this.getSqlSessionTemplate().getMapper(WmDeliveryOrderItemIntf.class);
		if(wmDeliveryOrderItem.getWmDeliveryOrderItemId() == null){
			mapper.insertWmDeliveryOrderItem(wmDeliveryOrderItem);
			wmDeliveryOrderItem = selectWmDeliveryOrderItemById(getLastPk());
		}else{
			mapper.updateWmDeliveryOrderItem(wmDeliveryOrderItem);
			wmDeliveryOrderItem = mapper.selectWmDeliveryOrderItemById(wmDeliveryOrderItem.getWmDeliveryOrderItemId());
		}
		return wmDeliveryOrderItem;
	}
}