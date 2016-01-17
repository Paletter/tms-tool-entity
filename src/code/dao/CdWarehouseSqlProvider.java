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

import com.palette.busi.project.tms.core.entity.CdWarehouse;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class CdWarehouseSqlProvider extends BaseSqlProvider {

	public String update(CdWarehouse record) {
		BEGIN();
        UPDATE("cd_warehouse");
        if (record.getCdWarehouseId() != null) {
            SET("CD_WAREHOUSE_ID = #{cdWarehouseId}");
        }
        if (record.getWarehouseCode() != null) {
            SET("WAREHOUSE_CODE = #{warehouseCode}");
        }
        if (record.getWarehouseDesc() != null) {
            SET("WAREHOUSE_DESC = #{warehouseDesc}");
        }
        if (record.getCountryCode() != null) {
            SET("COUNTRY_CODE = #{countryCode}");
        }
        if (record.getStateCode() != null) {
            SET("STATE_CODE = #{stateCode}");
        }
        if (record.getCityCode() != null) {
            SET("CITY_CODE = #{cityCode}");
        }
        if (record.getStreet() != null) {
            SET("STREET = #{street}");
        }
        if (record.getPostCode() != null) {
            SET("POST_CODE = #{postCode}");
        }
        if (record.getMemo() != null) {
            SET("MEMO = #{memo}");
        }
        if (record.getIsActive() != null) {
            SET("IS_ACTIVE = #{isActive}");
        }
        if (record.getDefaultServiceProductCode() != null) {
            SET("DEFAULT_SERVICE_PRODUCT_CODE = #{defaultServiceProductCode}");
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

        WHERE("cd_warehouse_id = #{cdWarehouseId}");

        return SQL();
	}

    public String selectAllByRecord(CdWarehouse record) {
        BEGIN();
        SELECT("*");
        FROM("cd_warehouse");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getCdWarehouseId() != null) {
            stringBuffer.append(" AND CD_WAREHOUSE_ID = #{cdWarehouseId}");
        }
        if (record.getWarehouseCode() != null) {
            stringBuffer.append(" AND WAREHOUSE_CODE = #{warehouseCode}");
        }
        if (record.getWarehouseDesc() != null) {
            stringBuffer.append(" AND WAREHOUSE_DESC = #{warehouseDesc}");
        }
        if (record.getCountryCode() != null) {
            stringBuffer.append(" AND COUNTRY_CODE = #{countryCode}");
        }
        if (record.getStateCode() != null) {
            stringBuffer.append(" AND STATE_CODE = #{stateCode}");
        }
        if (record.getCityCode() != null) {
            stringBuffer.append(" AND CITY_CODE = #{cityCode}");
        }
        if (record.getStreet() != null) {
            stringBuffer.append(" AND STREET = #{street}");
        }
        if (record.getPostCode() != null) {
            stringBuffer.append(" AND POST_CODE = #{postCode}");
        }
        if (record.getMemo() != null) {
            stringBuffer.append(" AND MEMO = #{memo}");
        }
        if (record.getIsActive() != null) {
            stringBuffer.append(" AND IS_ACTIVE = #{isActive}");
        }
        if (record.getDefaultServiceProductCode() != null) {
            stringBuffer.append(" AND DEFAULT_SERVICE_PRODUCT_CODE = #{defaultServiceProductCode}");
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
