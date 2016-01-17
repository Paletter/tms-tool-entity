package com.palette.busi.project.tms.core.dao;

import java.util.List;
import java.math.BigDecimal;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.palette.busi.project.tms.core.entity.CdAttachment;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class CdAttachmentSqlProvider extends BaseSqlProvider {

	public String update(CdAttachment record) {
		BEGIN();
        UPDATE("cd_attachment");
        if (record.getCdAttachmentId() != null) {
            SET("CD_ATTACHMENT_ID = #{cdAttachmentId}");
        }
        if (record.getFileName() != null) {
            SET("FILE_NAME = #{fileName}");
        }
        if (record.getFileUrl() != null) {
            SET("FILE_URL = #{fileUrl}");
        }
        if (record.getFileContentType() != null) {
            SET("FILE_CONTENT_TYPE = #{fileContentType}");
        }
        if (record.getFileSize() != null) {
            SET("FILE_SIZE = #{fileSize}");
        }
        if (record.getAttachmentComment() != null) {
            SET("ATTACHMENT_COMMENT = #{attachmentComment}");
        }
        if (record.getRecordVersion() != null) {
            SET("RECORD_VERSION = #{recordVersion}");
        }
        if (record.getCreateDateTime() != null) {
            SET("CREATE_DATE_TIME = #{createDateTime}");
        }
        if (record.getCreateUserCode() != null) {
            SET("CREATE_USER_CODE = #{createUserCode}");
        }
        if (record.getCreateTimeZone() != null) {
            SET("CREATE_TIME_ZONE = #{createTimeZone}");
        }
        if (record.getUpdateDateTime() != null) {
            SET("UPDATE_DATE_TIME = #{updateDateTime}");
        }
        if (record.getUpdateUserCode() != null) {
            SET("UPDATE_USER_CODE = #{updateUserCode}");
        }
        if (record.getUpdateTimeZone() != null) {
            SET("UPDATE_TIME_ZONE = #{updateTimeZone}");
        }

        WHERE("cd_attachment_id = #{cdAttachmentId}");

        return SQL();
	}

    public String selectAllByRecord(CdAttachment record) {
        BEGIN();
        SELECT("*");
        FROM("cd_attachment");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getCdAttachmentId() != null) {
            stringBuffer.append(" AND CD_ATTACHMENT_ID = #{cdAttachmentId}");
        }
        if (record.getFileName() != null) {
            stringBuffer.append(" AND FILE_NAME = #{fileName}");
        }
        if (record.getFileUrl() != null) {
            stringBuffer.append(" AND FILE_URL = #{fileUrl}");
        }
        if (record.getFileContentType() != null) {
            stringBuffer.append(" AND FILE_CONTENT_TYPE = #{fileContentType}");
        }
        if (record.getFileSize() != null) {
            stringBuffer.append(" AND FILE_SIZE = #{fileSize}");
        }
        if (record.getAttachmentComment() != null) {
            stringBuffer.append(" AND ATTACHMENT_COMMENT = #{attachmentComment}");
        }
        if (record.getRecordVersion() != null) {
            stringBuffer.append(" AND RECORD_VERSION = #{recordVersion}");
        }
        if (record.getCreateDateTime() != null) {
            stringBuffer.append(" AND CREATE_DATE_TIME = #{createDateTime}");
        }
        if (record.getCreateUserCode() != null) {
            stringBuffer.append(" AND CREATE_USER_CODE = #{createUserCode}");
        }
        if (record.getCreateTimeZone() != null) {
            stringBuffer.append(" AND CREATE_TIME_ZONE = #{createTimeZone}");
        }
        if (record.getUpdateDateTime() != null) {
            stringBuffer.append(" AND UPDATE_DATE_TIME = #{updateDateTime}");
        }
        if (record.getUpdateUserCode() != null) {
            stringBuffer.append(" AND UPDATE_USER_CODE = #{updateUserCode}");
        }
        if (record.getUpdateTimeZone() != null) {
            stringBuffer.append(" AND UPDATE_TIME_ZONE = #{updateTimeZone}");
        }

        WHERE(stringBuffer.toString());

        return SQL();
    }
}
