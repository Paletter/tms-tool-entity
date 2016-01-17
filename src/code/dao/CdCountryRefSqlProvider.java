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

import com.palette.busi.project.tms.core.entity.CdCountryRef;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class CdCountryRefSqlProvider extends BaseSqlProvider {

	public String update(CdCountryRef record) {
		BEGIN();
        UPDATE("cd_country_ref");
        if (record.getCdCountryRefId() != null) {
            SET("CD_COUNTRY_REF_ID = #{cdCountryRefId}");
        }
        if (record.getWeightUnit() != null) {
            SET("WEIGHT_UNIT = #{weightUnit}");
        }
        if (record.getVolumeUnit() != null) {
            SET("VOLUME_UNIT = #{volumeUnit}");
        }
        if (record.getMeasureUnit() != null) {
            SET("MEASURE_UNIT = #{measureUnit}");
        }
        if (record.getCurrency() != null) {
            SET("CURRENCY = #{currency}");
        }
        if (record.getCurrencySymbol() != null) {
            SET("CURRENCY_SYMBOL = #{currencySymbol}");
        }
        if (record.getLanguage() != null) {
            SET("LANGUAGE = #{language}");
        }
        if (record.getVolumeWeightBase() != null) {
            SET("VOLUME_WEIGHT_BASE = #{volumeWeightBase}");
        }
        if (record.getConvertToKg() != null) {
            SET("CONVERT_TO_KG = #{convertToKg}");
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

        WHERE("cd_country_ref_id = #{cdCountryRefId}");

        return SQL();
	}

    public String selectAllByRecord(CdCountryRef record) {
        BEGIN();
        SELECT("*");
        FROM("cd_country_ref");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getCdCountryRefId() != null) {
            stringBuffer.append(" AND CD_COUNTRY_REF_ID = #{cdCountryRefId}");
        }
        if (record.getWeightUnit() != null) {
            stringBuffer.append(" AND WEIGHT_UNIT = #{weightUnit}");
        }
        if (record.getVolumeUnit() != null) {
            stringBuffer.append(" AND VOLUME_UNIT = #{volumeUnit}");
        }
        if (record.getMeasureUnit() != null) {
            stringBuffer.append(" AND MEASURE_UNIT = #{measureUnit}");
        }
        if (record.getCurrency() != null) {
            stringBuffer.append(" AND CURRENCY = #{currency}");
        }
        if (record.getCurrencySymbol() != null) {
            stringBuffer.append(" AND CURRENCY_SYMBOL = #{currencySymbol}");
        }
        if (record.getLanguage() != null) {
            stringBuffer.append(" AND LANGUAGE = #{language}");
        }
        if (record.getVolumeWeightBase() != null) {
            stringBuffer.append(" AND VOLUME_WEIGHT_BASE = #{volumeWeightBase}");
        }
        if (record.getConvertToKg() != null) {
            stringBuffer.append(" AND CONVERT_TO_KG = #{convertToKg}");
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
