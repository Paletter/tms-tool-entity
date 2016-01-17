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

import com.palette.busi.project.tms.core.entity.CdState;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class CdStateSqlProvider extends BaseSqlProvider {

	public String update(CdState record) {
		BEGIN();
        UPDATE("cd_state");
        if (record.getCdStateId() != null) {
            SET("CD_STATE_ID = #{cdStateId}");
        }
        if (record.getStateCode() != null) {
            SET("STATE_CODE = #{stateCode}");
        }
        if (record.getStateName() != null) {
            SET("STATE_NAME = #{stateName}");
        }
        if (record.getStateChineseName() != null) {
            SET("STATE_CHINESE_NAME = #{stateChineseName}");
        }
        if (record.getStateEnglishName() != null) {
            SET("STATE_ENGLISH_NAME = #{stateEnglishName}");
        }
        if (record.getCountryCode() != null) {
            SET("COUNTRY_CODE = #{countryCode}");
        }
        if (record.getMemo() != null) {
            SET("MEMO = #{memo}");
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

        WHERE("cd_state_id = #{cdStateId}");

        return SQL();
	}

    public String selectAllByRecord(CdState record) {
        BEGIN();
        SELECT("*");
        FROM("cd_state");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getCdStateId() != null) {
            stringBuffer.append(" AND CD_STATE_ID = #{cdStateId}");
        }
        if (record.getStateCode() != null) {
            stringBuffer.append(" AND STATE_CODE = #{stateCode}");
        }
        if (record.getStateName() != null) {
            stringBuffer.append(" AND STATE_NAME = #{stateName}");
        }
        if (record.getStateChineseName() != null) {
            stringBuffer.append(" AND STATE_CHINESE_NAME = #{stateChineseName}");
        }
        if (record.getStateEnglishName() != null) {
            stringBuffer.append(" AND STATE_ENGLISH_NAME = #{stateEnglishName}");
        }
        if (record.getCountryCode() != null) {
            stringBuffer.append(" AND COUNTRY_CODE = #{countryCode}");
        }
        if (record.getMemo() != null) {
            stringBuffer.append(" AND MEMO = #{memo}");
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
