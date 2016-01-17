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

import com.palette.busi.project.tms.core.entity.WmDeliveryOrder;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class WmDeliveryOrderSqlProvider extends BaseSqlProvider {

	public String update(WmDeliveryOrder record) {
		BEGIN();
        UPDATE("wm_delivery_order");
        if (record.getWmDeliveryOrderId() != null) {
            SET("WM_DELIVERY_ORDER_ID = #{wmDeliveryOrderId}");
        }
        if (record.getDeliveryOrderNo() != null) {
            SET("DELIVERY_ORDER_NO = #{deliveryOrderNo}");
        }
        if (record.getDeliveryDate() != null) {
            SET("DELIVERY_DATE = #{deliveryDate}");
        }
        if (record.getCountryCode() != null) {
            SET("COUNTRY_CODE = #{countryCode}");
        }
        if (record.getWarehouseCode() != null) {
            SET("WAREHOUSE_CODE = #{warehouseCode}");
        }
        if (record.getServiceProductCode() != null) {
            SET("SERVICE_PRODUCT_CODE = #{serviceProductCode}");
        }
        if (record.getSectorCode() != null) {
            SET("SECTOR_CODE = #{sectorCode}");
        }
        if (record.getMawbCode() != null) {
            SET("MAWB_CODE = #{mawbCode}");
        }
        if (record.getType() != null) {
            SET("TYPE = #{type}");
        }
        if (record.getStatus() != null) {
            SET("STATUS = #{status}");
        }
        if (record.getCreateDateTime() != null) {
            SET("CREATE_DATE_TIME = #{createDateTime}");
        }
        if (record.getCreateUserCode() != null) {
            SET("CREATE_USER_CODE = #{createUserCode}");
        }
        if (record.getUpdateDateTime() != null) {
            SET("UPDATE_DATE_TIME = #{updateDateTime}");
        }
        if (record.getUpdateUserCode() != null) {
            SET("UPDATE_USER_CODE = #{updateUserCode}");
        }

        WHERE("wm_delivery_order_id = #{wmDeliveryOrderId}");

        return SQL();
	}

    public String selectAllByRecord(WmDeliveryOrder record) {
        BEGIN();
        SELECT("*");
        FROM("wm_delivery_order");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getWmDeliveryOrderId() != null) {
            stringBuffer.append(" AND WM_DELIVERY_ORDER_ID = #{wmDeliveryOrderId}");
        }
        if (record.getDeliveryOrderNo() != null) {
            stringBuffer.append(" AND DELIVERY_ORDER_NO = #{deliveryOrderNo}");
        }
        if (record.getDeliveryDate() != null) {
            stringBuffer.append(" AND DELIVERY_DATE = #{deliveryDate}");
        }
        if (record.getCountryCode() != null) {
            stringBuffer.append(" AND COUNTRY_CODE = #{countryCode}");
        }
        if (record.getWarehouseCode() != null) {
            stringBuffer.append(" AND WAREHOUSE_CODE = #{warehouseCode}");
        }
        if (record.getServiceProductCode() != null) {
            stringBuffer.append(" AND SERVICE_PRODUCT_CODE = #{serviceProductCode}");
        }
        if (record.getSectorCode() != null) {
            stringBuffer.append(" AND SECTOR_CODE = #{sectorCode}");
        }
        if (record.getMawbCode() != null) {
            stringBuffer.append(" AND MAWB_CODE = #{mawbCode}");
        }
        if (record.getType() != null) {
            stringBuffer.append(" AND TYPE = #{type}");
        }
        if (record.getStatus() != null) {
            stringBuffer.append(" AND STATUS = #{status}");
        }
        if (record.getCreateDateTime() != null) {
            stringBuffer.append(" AND CREATE_DATE_TIME = #{createDateTime}");
        }
        if (record.getCreateUserCode() != null) {
            stringBuffer.append(" AND CREATE_USER_CODE = #{createUserCode}");
        }
        if (record.getUpdateDateTime() != null) {
            stringBuffer.append(" AND UPDATE_DATE_TIME = #{updateDateTime}");
        }
        if (record.getUpdateUserCode() != null) {
            stringBuffer.append(" AND UPDATE_USER_CODE = #{updateUserCode}");
        }

        WHERE(stringBuffer.toString());

        return SQL();
    }
}
