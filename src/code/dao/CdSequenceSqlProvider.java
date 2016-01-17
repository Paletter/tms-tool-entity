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

import com.palette.busi.project.tms.core.entity.CdSequence;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class CdSequenceSqlProvider extends BaseSqlProvider {

	public String update(CdSequence record) {
		BEGIN();
        UPDATE("cd_sequence");
        if (record.getCdSequenceId() != null) {
            SET("cd_sequence_id = #{cdSequenceId}");
        }
        if (record.getFixedLength() != null) {
            SET("fixed_length = #{fixedLength}");
        }
        if (record.getTypeCode() != null) {
            SET("type_code = #{typeCode}");
        }
        if (record.getPrefix() != null) {
            SET("prefix = #{prefix}");
        }
        if (record.getSuffix() != null) {
            SET("suffix = #{suffix}");
        }
        if (record.getIncrementBy() != null) {
            SET("increment_by = #{incrementBy}");
        }
        if (record.getDateFormat() != null) {
            SET("DATE_FORMAT = #{dateFormat}");
        }
        if (record.getCurval() != null) {
            SET("curval = #{curval}");
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

        WHERE("cd_sequence_id = #{cdSequenceId}");

        return SQL();
	}

    public String selectAllByRecord(CdSequence record) {
        BEGIN();
        SELECT("*");
        FROM("cd_sequence");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getCdSequenceId() != null) {
            stringBuffer.append(" AND cd_sequence_id = #{cdSequenceId}");
        }
        if (record.getFixedLength() != null) {
            stringBuffer.append(" AND fixed_length = #{fixedLength}");
        }
        if (record.getTypeCode() != null) {
            stringBuffer.append(" AND type_code = #{typeCode}");
        }
        if (record.getPrefix() != null) {
            stringBuffer.append(" AND prefix = #{prefix}");
        }
        if (record.getSuffix() != null) {
            stringBuffer.append(" AND suffix = #{suffix}");
        }
        if (record.getIncrementBy() != null) {
            stringBuffer.append(" AND increment_by = #{incrementBy}");
        }
        if (record.getDateFormat() != null) {
            stringBuffer.append(" AND DATE_FORMAT = #{dateFormat}");
        }
        if (record.getCurval() != null) {
            stringBuffer.append(" AND curval = #{curval}");
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
