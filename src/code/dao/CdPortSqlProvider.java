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

import com.palette.busi.project.tms.core.entity.CdPort;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class CdPortSqlProvider extends BaseSqlProvider {

	public String update(CdPort record) {
		BEGIN();
        UPDATE("cd_port");
        if (record.getCdPortId() != null) {
            SET("CD_PORT_ID = #{cdPortId}");
        }
        if (record.getPortCode() != null) {
            SET("PORT_CODE = #{portCode}");
        }
        if (record.getPortName() != null) {
            SET("PORT_NAME = #{portName}");
        }
        if (record.getPortEnglishName() != null) {
            SET("PORT_ENGLISH_NAME = #{portEnglishName}");
        }
        if (record.getCityCode() != null) {
            SET("CITY_CODE = #{cityCode}");
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

        WHERE("cd_port_id = #{cdPortId}");

        return SQL();
	}

    public String selectAllByRecord(CdPort record) {
        BEGIN();
        SELECT("*");
        FROM("cd_port");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getCdPortId() != null) {
            stringBuffer.append(" AND CD_PORT_ID = #{cdPortId}");
        }
        if (record.getPortCode() != null) {
            stringBuffer.append(" AND PORT_CODE = #{portCode}");
        }
        if (record.getPortName() != null) {
            stringBuffer.append(" AND PORT_NAME = #{portName}");
        }
        if (record.getPortEnglishName() != null) {
            stringBuffer.append(" AND PORT_ENGLISH_NAME = #{portEnglishName}");
        }
        if (record.getCityCode() != null) {
            stringBuffer.append(" AND CITY_CODE = #{cityCode}");
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
