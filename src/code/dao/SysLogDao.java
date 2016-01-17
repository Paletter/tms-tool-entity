package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.SysLog;
import com.palette.busi.project.tms.core.dao.SysLogIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class SysLogDao extends BaseDaoImpl {
	
	public SysLog updateSysLog(SysLog sysLog) throws BaseException {
		SysLogIntf mapper = this.getSqlSessionTemplate().getMapper(SysLogIntf.class);
		mapper.updateSysLog(sysLog);
		return sysLog;
	}
	
	public SysLog insertSysLog(SysLog sysLog) throws BaseException {
		SysLogIntf mapper = this.getSqlSessionTemplate().getMapper(SysLogIntf.class);
		mapper.insertSysLog(sysLog);
		if(sysLog.getSysLogId() == null){
			sysLog.setSysLogId(getLastPk());
		}
		return sysLog;
	}
	
	public SysLog selectSysLogById(Integer sysLogId) throws BaseException {
		SysLogIntf mapper = this.getSqlSessionTemplate().getMapper(SysLogIntf.class);
		return mapper.selectSysLogById(sysLogId);
	}
	
	public Integer deleteSysLog(Integer sysLogId) throws BaseException {
		SysLogIntf mapper = this.getSqlSessionTemplate().getMapper(SysLogIntf.class);
		return mapper.deleteSysLog(sysLogId);
	}
	
	public List<SysLog> selectAllSysLog() throws BaseException {
		SysLogIntf mapper = this.getSqlSessionTemplate().getMapper(SysLogIntf.class);
		List<SysLog> allSysLog = mapper.selectAllSysLog();
		return allSysLog;
	}
	
	public List<SysLog> selectAllByRecord(SysLog sysLog) throws BaseException {
		SysLogIntf mapper = this.getSqlSessionTemplate().getMapper(SysLogIntf.class);
		return mapper.selectAllByRecord(sysLog);
	}
	
	public PageInfo selectPageByRecord(SysLog sysLog) throws BaseException {
		PageModel pageModel = sysLog.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		SysLogIntf mapper = this.getSqlSessionTemplate().getMapper(SysLogIntf.class);
		mapper.selectAllByRecord(sysLog);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public SysLog selectOneByRecord(SysLog sysLog) throws BaseException {
		List<SysLog> resultList = selectAllByRecord(sysLog);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public SysLog saveSysLog(SysLog sysLog) throws BaseException {
		SysLogIntf mapper = this.getSqlSessionTemplate().getMapper(SysLogIntf.class);
		if(sysLog.getSysLogId() == null){
			mapper.insertSysLog(sysLog);
			sysLog = selectSysLogById(getLastPk());
		}else{
			mapper.updateSysLog(sysLog);
			sysLog = mapper.selectSysLogById(sysLog.getSysLogId());
		}
		return sysLog;
	}
}