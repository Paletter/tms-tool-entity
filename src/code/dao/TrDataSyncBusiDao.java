package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.TrDataSyncBusi;
import com.palette.busi.project.tms.core.dao.TrDataSyncBusiIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class TrDataSyncBusiDao extends BaseDaoImpl {
	
	public TrDataSyncBusi updateTrDataSyncBusi(TrDataSyncBusi trDataSyncBusi) throws BaseException {
		TrDataSyncBusiIntf mapper = this.getSqlSessionTemplate().getMapper(TrDataSyncBusiIntf.class);
		mapper.updateTrDataSyncBusi(trDataSyncBusi);
		return trDataSyncBusi;
	}
	
	public TrDataSyncBusi insertTrDataSyncBusi(TrDataSyncBusi trDataSyncBusi) throws BaseException {
		TrDataSyncBusiIntf mapper = this.getSqlSessionTemplate().getMapper(TrDataSyncBusiIntf.class);
		mapper.insertTrDataSyncBusi(trDataSyncBusi);
		if(trDataSyncBusi.getTrDataSyncBusiId() == null){
			trDataSyncBusi.setTrDataSyncBusiId(getLastPk());
		}
		return trDataSyncBusi;
	}
	
	public TrDataSyncBusi selectTrDataSyncBusiById(Integer trDataSyncBusiId) throws BaseException {
		TrDataSyncBusiIntf mapper = this.getSqlSessionTemplate().getMapper(TrDataSyncBusiIntf.class);
		return mapper.selectTrDataSyncBusiById(trDataSyncBusiId);
	}
	
	public Integer deleteTrDataSyncBusi(Integer trDataSyncBusiId) throws BaseException {
		TrDataSyncBusiIntf mapper = this.getSqlSessionTemplate().getMapper(TrDataSyncBusiIntf.class);
		return mapper.deleteTrDataSyncBusi(trDataSyncBusiId);
	}
	
	public List<TrDataSyncBusi> selectAllTrDataSyncBusi() throws BaseException {
		TrDataSyncBusiIntf mapper = this.getSqlSessionTemplate().getMapper(TrDataSyncBusiIntf.class);
		List<TrDataSyncBusi> allTrDataSyncBusi = mapper.selectAllTrDataSyncBusi();
		return allTrDataSyncBusi;
	}
	
	public List<TrDataSyncBusi> selectAllByRecord(TrDataSyncBusi trDataSyncBusi) throws BaseException {
		TrDataSyncBusiIntf mapper = this.getSqlSessionTemplate().getMapper(TrDataSyncBusiIntf.class);
		return mapper.selectAllByRecord(trDataSyncBusi);
	}
	
	public PageInfo selectPageByRecord(TrDataSyncBusi trDataSyncBusi) throws BaseException {
		PageModel pageModel = trDataSyncBusi.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		TrDataSyncBusiIntf mapper = this.getSqlSessionTemplate().getMapper(TrDataSyncBusiIntf.class);
		mapper.selectAllByRecord(trDataSyncBusi);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public TrDataSyncBusi selectOneByRecord(TrDataSyncBusi trDataSyncBusi) throws BaseException {
		List<TrDataSyncBusi> resultList = selectAllByRecord(trDataSyncBusi);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public TrDataSyncBusi saveTrDataSyncBusi(TrDataSyncBusi trDataSyncBusi) throws BaseException {
		TrDataSyncBusiIntf mapper = this.getSqlSessionTemplate().getMapper(TrDataSyncBusiIntf.class);
		if(trDataSyncBusi.getTrDataSyncBusiId() == null){
			mapper.insertTrDataSyncBusi(trDataSyncBusi);
			trDataSyncBusi = selectTrDataSyncBusiById(getLastPk());
		}else{
			mapper.updateTrDataSyncBusi(trDataSyncBusi);
			trDataSyncBusi = mapper.selectTrDataSyncBusiById(trDataSyncBusi.getTrDataSyncBusiId());
		}
		return trDataSyncBusi;
	}
}