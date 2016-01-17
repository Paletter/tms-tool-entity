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

import com.palette.busi.project.tms.core.entity.CdAttachmentRef;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class CdAttachmentRefSqlProvider extends BaseSqlProvider {

	public String update(CdAttachmentRef record) {
		BEGIN();
        UPDATE("cd_attachment_ref");
        if (record.getCdAttachmentRefId() != null) {
            SET("CD_ATTACHMENT_REF_ID = #{cdAttachmentRefId}");
        }
        if (record.getCdAttachmentId() != null) {
            SET("CD_ATTACHMENT_ID = #{cdAttachmentId}");
        }
        if (record.getRelationNo() != null) {
            SET("RELATION_NO = #{relationNo}");
        }
        if (record.getRelationCode() != null) {
            SET("RELATION_CODE = #{relationCode}");
        }
        if (record.getRecordVersion() != null) {
            SET("RECORD_VERSION = #{recordVersion}");
        }
        if (record.getCreateUserCode() != null) {
            SET("CREATE_USER_CODE = #{createUserCode}");
        }
        if (record.getCreateDateTime() != null) {
            SET("CREATE_DATE_TIME = #{createDateTime}");
        }
        if (record.getCreateTimeZone() != null) {
            SET("CREATE_TIME_ZONE = #{createTimeZone}");
        }
        if (record.getUpdateUserCode() != null) {
            SET("UPDATE_USER_CODE = #{updateUserCode}");
        }
        if (record.getUpdateDateTime() != null) {
            SET("UPDATE_DATE_TIME = #{updateDateTime}");
        }
        if (record.getUpdateTimeZone() != null) {
            SET("UPDATE_TIME_ZONE = #{updateTimeZone}");
        }

        WHERE("cd_attachment_ref_id = #{cdAttachmentRefId}");

        return SQL();
	}

    public String selectAllByRecord(CdAttachmentRef record) {
        BEGIN();
        SELECT("*");
        FROM("cd_attachment_ref");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getCdAttachmentRefId() != null) {
            stringBuffer.append(" AND CD_ATTACHMENT_REF_ID = #{cdAttachmentRefId}");
        }
        if (record.getCdAttachmentId() != null) {
            stringBuffer.append(" AND CD_ATTACHMENT_ID = #{cdAttachmentId}");
        }
        if (record.getRelationNo() != null) {
            stringBuffer.append(" AND RELATION_NO = #{relationNo}");
        }
        if (record.getRelationCode() != null) {
            stringBuffer.append(" AND RELATION_CODE = #{relationCode}");
        }
        if (record.getRecordVersion() != null) {
            stringBuffer.append(" AND RECORD_VERSION = #{recordVersion}");
        }
        if (record.getCreateUserCode() != null) {
            stringBuffer.append(" AND CREATE_USER_CODE = #{createUserCode}");
        }
        if (record.getCreateDateTime() != null) {
            stringBuffer.append(" AND CREATE_DATE_TIME = #{createDateTime}");
        }
        if (record.getCreateTimeZone() != null) {
            stringBuffer.append(" AND CREATE_TIME_ZONE = #{createTimeZone}");
        }
        if (record.getUpdateUserCode() != null) {
            stringBuffer.append(" AND UPDATE_USER_CODE = #{updateUserCode}");
        }
        if (record.getUpdateDateTime() != null) {
            stringBuffer.append(" AND UPDATE_DATE_TIME = #{updateDateTime}");
        }
        if (record.getUpdateTimeZone() != null) {
            stringBuffer.append(" AND UPDATE_TIME_ZONE = #{updateTimeZone}");
        }

        WHERE(stringBuffer.toString());

        return SQL();
    }
}
