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

import com.palette.busi.project.tms.core.entity.CdResource;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class CdResourceSqlProvider extends BaseSqlProvider {

	public String update(CdResource record) {
		BEGIN();
        UPDATE("cd_resource");
        if (record.getCdResourceId() != null) {
            SET("CD_RESOURCE_ID = #{cdResourceId}");
        }
        if (record.getResourceName() != null) {
            SET("RESOURCE_NAME = #{resourceName}");
        }
        if (record.getResourceUrl() != null) {
            SET("RESOURCE_URL = #{resourceUrl}");
        }
        if (record.getMenuOrder() != null) {
            SET("MENU_ORDER = #{menuOrder}");
        }
        if (record.getMenuCate() != null) {
            SET("MENU_CATE = #{menuCate}");
        }
        if (record.getDescpt() != null) {
            SET("DESCPT = #{descpt}");
        }
        if (record.getIsActive() != null) {
            SET("IS_ACTIVE = #{isActive}");
        }
        if (record.getCategory() != null) {
            SET("CATEGORY = #{category}");
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

        WHERE("cd_resource_id = #{cdResourceId}");

        return SQL();
	}

    public String selectAllByRecord(CdResource record) {
        BEGIN();
        SELECT("*");
        FROM("cd_resource");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getCdResourceId() != null) {
            stringBuffer.append(" AND CD_RESOURCE_ID = #{cdResourceId}");
        }
        if (record.getResourceName() != null) {
            stringBuffer.append(" AND RESOURCE_NAME = #{resourceName}");
        }
        if (record.getResourceUrl() != null) {
            stringBuffer.append(" AND RESOURCE_URL = #{resourceUrl}");
        }
        if (record.getMenuOrder() != null) {
            stringBuffer.append(" AND MENU_ORDER = #{menuOrder}");
        }
        if (record.getMenuCate() != null) {
            stringBuffer.append(" AND MENU_CATE = #{menuCate}");
        }
        if (record.getDescpt() != null) {
            stringBuffer.append(" AND DESCPT = #{descpt}");
        }
        if (record.getIsActive() != null) {
            stringBuffer.append(" AND IS_ACTIVE = #{isActive}");
        }
        if (record.getCategory() != null) {
            stringBuffer.append(" AND CATEGORY = #{category}");
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
