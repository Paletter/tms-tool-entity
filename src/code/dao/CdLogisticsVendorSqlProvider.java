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

import com.palette.busi.project.tms.core.entity.CdLogisticsVendor;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class CdLogisticsVendorSqlProvider extends BaseSqlProvider {

	public String update(CdLogisticsVendor record) {
		BEGIN();
        UPDATE("cd_logistics_vendor");
        if (record.getCdLogisticsVendorId() != null) {
            SET("CD_LOGISTICS_VENDOR_ID = #{cdLogisticsVendorId}");
        }
        if (record.getLogisticsVendorCode() != null) {
            SET("LOGISTICS_VENDOR_CODE = #{logisticsVendorCode}");
        }
        if (record.getLogisticsVendorName() != null) {
            SET("LOGISTICS_VENDOR_NAME = #{logisticsVendorName}");
        }
        if (record.getCountryCode() != null) {
            SET("COUNTRY_CODE = #{countryCode}");
        }
        if (record.getIsActive() != null) {
            SET("IS_ACTIVE = #{isActive}");
        }
        if (record.getSeq() != null) {
            SET("SEQ = #{seq}");
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

        WHERE("cd_logistics_vendor_id = #{cdLogisticsVendorId}");

        return SQL();
	}

    public String selectAllByRecord(CdLogisticsVendor record) {
        BEGIN();
        SELECT("*");
        FROM("cd_logistics_vendor");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getCdLogisticsVendorId() != null) {
            stringBuffer.append(" AND CD_LOGISTICS_VENDOR_ID = #{cdLogisticsVendorId}");
        }
        if (record.getLogisticsVendorCode() != null) {
            stringBuffer.append(" AND LOGISTICS_VENDOR_CODE = #{logisticsVendorCode}");
        }
        if (record.getLogisticsVendorName() != null) {
            stringBuffer.append(" AND LOGISTICS_VENDOR_NAME = #{logisticsVendorName}");
        }
        if (record.getCountryCode() != null) {
            stringBuffer.append(" AND COUNTRY_CODE = #{countryCode}");
        }
        if (record.getIsActive() != null) {
            stringBuffer.append(" AND IS_ACTIVE = #{isActive}");
        }
        if (record.getSeq() != null) {
            stringBuffer.append(" AND SEQ = #{seq}");
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
