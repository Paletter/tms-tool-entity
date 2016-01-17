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

import com.palette.busi.project.tms.core.entity.CdCity;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class CdCitySqlProvider extends BaseSqlProvider {

	public String update(CdCity record) {
		BEGIN();
        UPDATE("cd_city");
        if (record.getCdCityId() != null) {
            SET("CD_CITY_ID = #{cdCityId}");
        }
        if (record.getCityCode() != null) {
            SET("CITY_CODE = #{cityCode}");
        }
        if (record.getCityName() != null) {
            SET("CITY_NAME = #{cityName}");
        }
        if (record.getCityEnglishName() != null) {
            SET("CITY_ENGLISH_NAME = #{cityEnglishName}");
        }
        if (record.getStateCode() != null) {
            SET("STATE_CODE = #{stateCode}");
        }
        if (record.getIsRemoteArea() != null) {
            SET("IS_REMOTE_AREA = #{isRemoteArea}");
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

        WHERE("cd_city_id = #{cdCityId}");

        return SQL();
	}

    public String selectAllByRecord(CdCity record) {
        BEGIN();
        SELECT("*");
        FROM("cd_city");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getCdCityId() != null) {
            stringBuffer.append(" AND CD_CITY_ID = #{cdCityId}");
        }
        if (record.getCityCode() != null) {
            stringBuffer.append(" AND CITY_CODE = #{cityCode}");
        }
        if (record.getCityName() != null) {
            stringBuffer.append(" AND CITY_NAME = #{cityName}");
        }
        if (record.getCityEnglishName() != null) {
            stringBuffer.append(" AND CITY_ENGLISH_NAME = #{cityEnglishName}");
        }
        if (record.getStateCode() != null) {
            stringBuffer.append(" AND STATE_CODE = #{stateCode}");
        }
        if (record.getIsRemoteArea() != null) {
            stringBuffer.append(" AND IS_REMOTE_AREA = #{isRemoteArea}");
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
