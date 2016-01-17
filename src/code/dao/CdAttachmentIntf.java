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

import com.palette.busi.project.tms.core.entity.CdAttachment;
import com.palette.busi.project.tms.core.dao.CdAttachmentSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdAttachmentIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_ATTACHMENT_ID  AS cdAttachmentId, FILE_NAME  AS fileName, FILE_URL  AS fileUrl, FILE_CONTENT_TYPE  AS fileContentType, FILE_SIZE  AS fileSize, ATTACHMENT_COMMENT  AS attachmentComment, RECORD_VERSION  AS recordVersion, CREATE_DATE_TIME  AS createDateTime, CREATE_USER_CODE  AS createUserCode, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_USER_CODE  AS updateUserCode, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_attachment WHERE cd_attachment_id=#{cdAttachmentId}")
	public CdAttachment selectCdAttachmentById(@Param("cdAttachmentId") int cdAttachmentId);
	
	@Select("SELECT  CD_ATTACHMENT_ID  AS cdAttachmentId, FILE_NAME  AS fileName, FILE_URL  AS fileUrl, FILE_CONTENT_TYPE  AS fileContentType, FILE_SIZE  AS fileSize, ATTACHMENT_COMMENT  AS attachmentComment, RECORD_VERSION  AS recordVersion, CREATE_DATE_TIME  AS createDateTime, CREATE_USER_CODE  AS createUserCode, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_USER_CODE  AS updateUserCode, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_attachment")
	public List<CdAttachment> selectAllCdAttachment();
	
	@Insert("insert into cd_attachment ( CD_ATTACHMENT_ID, FILE_NAME, FILE_URL, FILE_CONTENT_TYPE, FILE_SIZE, ATTACHMENT_COMMENT, RECORD_VERSION, CREATE_DATE_TIME, CREATE_USER_CODE, CREATE_TIME_ZONE, UPDATE_DATE_TIME, UPDATE_USER_CODE, UPDATE_TIME_ZONE ) values (#{cdAttachmentId},#{fileName},#{fileUrl},#{fileContentType},#{fileSize},#{attachmentComment},#{recordVersion},#{createDateTime},#{createUserCode},#{createTimeZone},#{updateDateTime},#{updateUserCode},#{updateTimeZone})")
	public int insertCdAttachment(CdAttachment cdAttachment);

	@UpdateProvider(type=CdAttachmentSqlProvider.class, method="update")
	public int updateCdAttachment(CdAttachment cdAttachment);
	
	@Delete("delete from cd_attachment where cd_attachment_id = #{cdAttachmentId}")
	public int deleteCdAttachment(@Param("cdAttachmentId") int cdAttachmentId);

    @SelectProvider(type=CdAttachmentSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdAttachment.class)
    public List<CdAttachment> selectAllByRecord(CdAttachment record);
    
}