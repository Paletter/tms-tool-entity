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

import com.palette.busi.project.tms.core.entity.CdUser;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class CdUserSqlProvider extends BaseSqlProvider {

	public String update(CdUser record) {
		BEGIN();
        UPDATE("cd_user");
        if (record.getCdUserId() != null) {
            SET("CD_USER_ID = #{cdUserId}");
        }
        if (record.getUserName() != null) {
            SET("USER_NAME = #{userName}");
        }
        if (record.getFirstName() != null) {
            SET("FIRST_NAME = #{firstName}");
        }
        if (record.getLastName() != null) {
            SET("LAST_NAME = #{lastName}");
        }
        if (record.getFullName() != null) {
            SET("FULL_NAME = #{fullName}");
        }
        if (record.getGender() != null) {
            SET("GENDER = #{gender}");
        }
        if (record.getMemo() != null) {
            SET("MEMO = #{memo}");
        }
        if (record.getCdDeptId() != null) {
            SET("CD_DEPT_ID = #{cdDeptId}");
        }
        if (record.getWarehouseCode() != null) {
            SET("WAREHOUSE_CODE = #{warehouseCode}");
        }
        if (record.getCdCountryId() != null) {
            SET("CD_COUNTRY_ID = #{cdCountryId}");
        }
        if (record.getCountryCode() != null) {
            SET("COUNTRY_CODE = #{countryCode}");
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

        WHERE("cd_user_id = #{cdUserId}");

        return SQL();
	}

    public String selectAllByRecord(CdUser record) {
        BEGIN();
        SELECT("*");
        FROM("cd_user");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getCdUserId() != null) {
            stringBuffer.append(" AND CD_USER_ID = #{cdUserId}");
        }
        if (record.getUserName() != null) {
            stringBuffer.append(" AND USER_NAME = #{userName}");
        }
        if (record.getFirstName() != null) {
            stringBuffer.append(" AND FIRST_NAME = #{firstName}");
        }
        if (record.getLastName() != null) {
            stringBuffer.append(" AND LAST_NAME = #{lastName}");
        }
        if (record.getFullName() != null) {
            stringBuffer.append(" AND FULL_NAME = #{fullName}");
        }
        if (record.getGender() != null) {
            stringBuffer.append(" AND GENDER = #{gender}");
        }
        if (record.getMemo() != null) {
            stringBuffer.append(" AND MEMO = #{memo}");
        }
        if (record.getCdDeptId() != null) {
            stringBuffer.append(" AND CD_DEPT_ID = #{cdDeptId}");
        }
        if (record.getWarehouseCode() != null) {
            stringBuffer.append(" AND WAREHOUSE_CODE = #{warehouseCode}");
        }
        if (record.getCdCountryId() != null) {
            stringBuffer.append(" AND CD_COUNTRY_ID = #{cdCountryId}");
        }
        if (record.getCountryCode() != null) {
            stringBuffer.append(" AND COUNTRY_CODE = #{countryCode}");
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
