package com.palette.busi.project.tms.core.dao;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palette.busi.project.tms.core.base.dao.impl.BaseDaoImpl;
import com.palette.busi.project.tms.core.base.BaseException;
import com.palette.busi.project.tms.core.entity.CdAttachment;
import com.palette.busi.project.tms.core.dao.CdAttachmentIntf;
import com.palette.busi.project.tms.core.page.Page;
import com.palette.busi.project.tms.core.page.PageFormat;
import com.palette.busi.project.tms.core.page.PageHelper;
import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.page.PageModel;

@Component
public class CdAttachmentDao extends BaseDaoImpl {
	
	public CdAttachment updateCdAttachment(CdAttachment cdAttachment) throws BaseException {
		CdAttachmentIntf mapper = this.getSqlSessionTemplate().getMapper(CdAttachmentIntf.class);
		mapper.updateCdAttachment(cdAttachment);
		return cdAttachment;
	}
	
	public CdAttachment insertCdAttachment(CdAttachment cdAttachment) throws BaseException {
		CdAttachmentIntf mapper = this.getSqlSessionTemplate().getMapper(CdAttachmentIntf.class);
		mapper.insertCdAttachment(cdAttachment);
		if(cdAttachment.getCdAttachmentId() == null){
			cdAttachment.setCdAttachmentId(getLastPk());
		}
		return cdAttachment;
	}
	
	public CdAttachment selectCdAttachmentById(Integer cdAttachmentId) throws BaseException {
		CdAttachmentIntf mapper = this.getSqlSessionTemplate().getMapper(CdAttachmentIntf.class);
		return mapper.selectCdAttachmentById(cdAttachmentId);
	}
	
	public Integer deleteCdAttachment(Integer cdAttachmentId) throws BaseException {
		CdAttachmentIntf mapper = this.getSqlSessionTemplate().getMapper(CdAttachmentIntf.class);
		return mapper.deleteCdAttachment(cdAttachmentId);
	}
	
	public List<CdAttachment> selectAllCdAttachment() throws BaseException {
		CdAttachmentIntf mapper = this.getSqlSessionTemplate().getMapper(CdAttachmentIntf.class);
		List<CdAttachment> allCdAttachment = mapper.selectAllCdAttachment();
		return allCdAttachment;
	}
	
	public List<CdAttachment> selectAllByRecord(CdAttachment cdAttachment) throws BaseException {
		CdAttachmentIntf mapper = this.getSqlSessionTemplate().getMapper(CdAttachmentIntf.class);
		return mapper.selectAllByRecord(cdAttachment);
	}
	
	public PageInfo selectPageByRecord(CdAttachment cdAttachment) throws BaseException {
		PageModel pageModel = cdAttachment.getPageInfo();
		PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize());
		CdAttachmentIntf mapper = this.getSqlSessionTemplate().getMapper(CdAttachmentIntf.class);
		mapper.selectAllByRecord(cdAttachment);
		Page page = PageHelper.endPage();
		return PageFormat.dataFormat(page);
	}
	
	public CdAttachment selectOneByRecord(CdAttachment cdAttachment) throws BaseException {
		List<CdAttachment> resultList = selectAllByRecord(cdAttachment);
		if(resultList.size() == 1){
			return resultList.get(0); 
		}else if(resultList.size() == 0){
			return null;
		}else{
			throw new TooManyResultsException("Expected one result (or null) to be returned by selectOne(), but found: " + resultList.size());
		}
	}
	
	public CdAttachment saveCdAttachment(CdAttachment cdAttachment) throws BaseException {
		CdAttachmentIntf mapper = this.getSqlSessionTemplate().getMapper(CdAttachmentIntf.class);
		if(cdAttachment.getCdAttachmentId() == null){
			mapper.insertCdAttachment(cdAttachment);
			cdAttachment = selectCdAttachmentById(getLastPk());
		}else{
			mapper.updateCdAttachment(cdAttachment);
			cdAttachment = mapper.selectCdAttachmentById(cdAttachment.getCdAttachmentId());
		}
		return cdAttachment;
	}
}