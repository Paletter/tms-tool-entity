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

import com.palette.busi.project.tms.core.entity.CdServiceProduct;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class CdServiceProductSqlProvider extends BaseSqlProvider {

	public String update(CdServiceProduct record) {
		BEGIN();
        UPDATE("cd_service_product");
        if (record.getCdServiceProductId() != null) {
            SET("CD_SERVICE_PRODUCT_ID = #{cdServiceProductId}");
        }
        if (record.getServiceProductCode() != null) {
            SET("SERVICE_PRODUCT_CODE = #{serviceProductCode}");
        }
        if (record.getServiceProductName() != null) {
            SET("SERVICE_PRODUCT_NAME = #{serviceProductName}");
        }
        if (record.getServiceProductDesc() != null) {
            SET("SERVICE_PRODUCT_DESC = #{serviceProductDesc}");
        }
        if (record.getServiceProductCountryCode() != null) {
            SET("SERVICE_PRODUCT_COUNTRY_CODE = #{serviceProductCountryCode}");
        }
        if (record.getServiceProductWarehouseCode() != null) {
            SET("SERVICE_PRODUCT_WAREHOUSE_CODE = #{serviceProductWarehouseCode}");
        }
        if (record.getServiceType() != null) {
            SET("SERVICE_TYPE = #{serviceType}");
        }
        if (record.getIsActive() != null) {
            SET("IS_ACTIVE = #{isActive}");
        }
        if (record.getIsDefault() != null) {
            SET("IS_DEFAULT = #{isDefault}");
        }
        if (record.getIsNeedIdcontent() != null) {
            SET("IS_NEED_IDCONTENT = #{isNeedIdcontent}");
        }
        if (record.getIsFreeTax() != null) {
            SET("IS_FREE_TAX = #{isFreeTax}");
        }
        if (record.getIsUseCoupon() != null) {
            SET("IS_USE_COUPON = #{isUseCoupon}");
        }
        if (record.getFeeWeight() != null) {
            SET("FEE_WEIGHT = #{feeWeight}");
        }
        if (record.getIsAutoDisassemble() != null) {
            SET("IS_AUTO_DISASSEMBLE = #{isAutoDisassemble}");
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

        WHERE("cd_service_product_id = #{cdServiceProductId}");

        return SQL();
	}

    public String selectAllByRecord(CdServiceProduct record) {
        BEGIN();
        SELECT("*");
        FROM("cd_service_product");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getCdServiceProductId() != null) {
            stringBuffer.append(" AND CD_SERVICE_PRODUCT_ID = #{cdServiceProductId}");
        }
        if (record.getServiceProductCode() != null) {
            stringBuffer.append(" AND SERVICE_PRODUCT_CODE = #{serviceProductCode}");
        }
        if (record.getServiceProductName() != null) {
            stringBuffer.append(" AND SERVICE_PRODUCT_NAME = #{serviceProductName}");
        }
        if (record.getServiceProductDesc() != null) {
            stringBuffer.append(" AND SERVICE_PRODUCT_DESC = #{serviceProductDesc}");
        }
        if (record.getServiceProductCountryCode() != null) {
            stringBuffer.append(" AND SERVICE_PRODUCT_COUNTRY_CODE = #{serviceProductCountryCode}");
        }
        if (record.getServiceProductWarehouseCode() != null) {
            stringBuffer.append(" AND SERVICE_PRODUCT_WAREHOUSE_CODE = #{serviceProductWarehouseCode}");
        }
        if (record.getServiceType() != null) {
            stringBuffer.append(" AND SERVICE_TYPE = #{serviceType}");
        }
        if (record.getIsActive() != null) {
            stringBuffer.append(" AND IS_ACTIVE = #{isActive}");
        }
        if (record.getIsDefault() != null) {
            stringBuffer.append(" AND IS_DEFAULT = #{isDefault}");
        }
        if (record.getIsNeedIdcontent() != null) {
            stringBuffer.append(" AND IS_NEED_IDCONTENT = #{isNeedIdcontent}");
        }
        if (record.getIsFreeTax() != null) {
            stringBuffer.append(" AND IS_FREE_TAX = #{isFreeTax}");
        }
        if (record.getIsUseCoupon() != null) {
            stringBuffer.append(" AND IS_USE_COUPON = #{isUseCoupon}");
        }
        if (record.getFeeWeight() != null) {
            stringBuffer.append(" AND FEE_WEIGHT = #{feeWeight}");
        }
        if (record.getIsAutoDisassemble() != null) {
            stringBuffer.append(" AND IS_AUTO_DISASSEMBLE = #{isAutoDisassemble}");
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
