package com.palette.busi.project.tms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.ResultType;

import com.palette.busi.project.tms.core.entity.CdAttachmentRef;
import com.palette.busi.project.tms.core.dao.CdAttachmentRefSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdAttachmentRefIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_ATTACHMENT_REF_ID  AS cdAttachmentRefId, CD_ATTACHMENT_ID  AS cdAttachmentId, RELATION_NO  AS relationNo, RELATION_CODE  AS relationCode, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_attachment_ref WHERE cd_attachment_ref_id=#{cdAttachmentRefId}")
	public CdAttachmentRef selectCdAttachmentRefById(@Param("cdAttachmentRefId") int cdAttachmentRefId);
	
	@Select("SELECT  CD_ATTACHMENT_REF_ID  AS cdAttachmentRefId, CD_ATTACHMENT_ID  AS cdAttachmentId, RELATION_NO  AS relationNo, RELATION_CODE  AS relationCode, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_attachment_ref")
	public List<CdAttachmentRef> selectAllCdAttachmentRef();
	
	@Insert("insert into cd_attachment_ref ( CD_ATTACHMENT_REF_ID, CD_ATTACHMENT_ID, RELATION_NO, RELATION_CODE, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdAttachmentRefId},#{cdAttachmentId},#{relationNo},#{relationCode},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdAttachmentRef(CdAttachmentRef cdAttachmentRef);

	@UpdateProvider(type=CdAttachmentRefSqlProvider.class, method="update")
	public int updateCdAttachmentRef(CdAttachmentRef cdAttachmentRef);
	
	@Delete("delete from cd_attachment_ref where cd_attachment_ref_id = #{cdAttachmentRefId}")
	public int deleteCdAttachmentRef(@Param("cdAttachmentRefId") int cdAttachmentRefId);

    @SelectProvider(type=CdAttachmentRefSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdAttachmentRef.class)
    public List<CdAttachmentRef> selectAllByRecord(CdAttachmentRef record);
    
}