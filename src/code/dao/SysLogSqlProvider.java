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

import com.palette.busi.project.tms.core.entity.SysLog;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class SysLogSqlProvider extends BaseSqlProvider {

	public String update(SysLog record) {
		BEGIN();
        UPDATE("sys_log");
        if (record.getSysLogId() != null) {
            SET("SYS_LOG_ID = #{sysLogId}");
        }
        if (record.getClassPathName() != null) {
            SET("CLASS_PATH_NAME = #{classPathName}");
        }
        if (record.getClassName() != null) {
            SET("CLASS_NAME = #{className}");
        }
        if (record.getMethodName() != null) {
            SET("METHOD_NAME = #{methodName}");
        }
        if (record.getParameters() != null) {
            SET("PARAMETERS = #{parameters}");
        }
        if (record.getResult() != null) {
            SET("RESULT = #{result}");
        }
        if (record.getActionUserCode() != null) {
            SET("ACTION_USER_CODE = #{actionUserCode}");
        }
        if (record.getActionDateTime() != null) {
            SET("ACTION_DATE_TIME = #{actionDateTime}");
        }
        if (record.getSeesionId() != null) {
            SET("SEESION_ID = #{seesionId}");
        }
        if (record.getIp() != null) {
            SET("IP = #{ip}");
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

        WHERE("sys_log_id = #{sysLogId}");

        return SQL();
	}

    public String selectAllByRecord(SysLog record) {
        BEGIN();
        SELECT("*");
        FROM("sys_log");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getSysLogId() != null) {
            stringBuffer.append(" AND SYS_LOG_ID = #{sysLogId}");
        }
        if (record.getClassPathName() != null) {
            stringBuffer.append(" AND CLASS_PATH_NAME = #{classPathName}");
        }
        if (record.getClassName() != null) {
            stringBuffer.append(" AND CLASS_NAME = #{className}");
        }
        if (record.getMethodName() != null) {
            stringBuffer.append(" AND METHOD_NAME = #{methodName}");
        }
        if (record.getParameters() != null) {
            stringBuffer.append(" AND PARAMETERS = #{parameters}");
        }
        if (record.getResult() != null) {
            stringBuffer.append(" AND RESULT = #{result}");
        }
        if (record.getActionUserCode() != null) {
            stringBuffer.append(" AND ACTION_USER_CODE = #{actionUserCode}");
        }
        if (record.getActionDateTime() != null) {
            stringBuffer.append(" AND ACTION_DATE_TIME = #{actionDateTime}");
        }
        if (record.getSeesionId() != null) {
            stringBuffer.append(" AND SEESION_ID = #{seesionId}");
        }
        if (record.getIp() != null) {
            stringBuffer.append(" AND IP = #{ip}");
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
