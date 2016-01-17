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

import com.palette.busi.project.tms.core.entity.CdUserPwd;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class CdUserPwdSqlProvider extends BaseSqlProvider {

	public String update(CdUserPwd record) {
		BEGIN();
        UPDATE("cd_user_pwd");
        if (record.getCdUserPwdId() != null) {
            SET("CD_USER_PWD_ID = #{cdUserPwdId}");
        }
        if (record.getCdUserId() != null) {
            SET("CD_USER_ID = #{cdUserId}");
        }
        if (record.getUserName() != null) {
            SET("USER_NAME = #{userName}");
        }
        if (record.getSalt() != null) {
            SET("SALT = #{salt}");
        }
        if (record.getPwd() != null) {
            SET("PWD = #{pwd}");
        }
        if (record.getLastLoginTime() != null) {
            SET("LAST_LOGIN_TIME = #{lastLoginTime}");
        }
        if (record.getLastLoginIp() != null) {
            SET("LAST_LOGIN_IP = #{lastLoginIp}");
        }
        if (record.getCookie() != null) {
            SET("COOKIE = #{cookie}");
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

        WHERE("cd_user_pwd_id = #{cdUserPwdId}");

        return SQL();
	}

    public String selectAllByRecord(CdUserPwd record) {
        BEGIN();
        SELECT("*");
        FROM("cd_user_pwd");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getCdUserPwdId() != null) {
            stringBuffer.append(" AND CD_USER_PWD_ID = #{cdUserPwdId}");
        }
        if (record.getCdUserId() != null) {
            stringBuffer.append(" AND CD_USER_ID = #{cdUserId}");
        }
        if (record.getUserName() != null) {
            stringBuffer.append(" AND USER_NAME = #{userName}");
        }
        if (record.getSalt() != null) {
            stringBuffer.append(" AND SALT = #{salt}");
        }
        if (record.getPwd() != null) {
            stringBuffer.append(" AND PWD = #{pwd}");
        }
        if (record.getLastLoginTime() != null) {
            stringBuffer.append(" AND LAST_LOGIN_TIME = #{lastLoginTime}");
        }
        if (record.getLastLoginIp() != null) {
            stringBuffer.append(" AND LAST_LOGIN_IP = #{lastLoginIp}");
        }
        if (record.getCookie() != null) {
            stringBuffer.append(" AND COOKIE = #{cookie}");
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
