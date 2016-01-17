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

import com.palette.busi.project.tms.core.entity.WmDeliveryOrderRef;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class WmDeliveryOrderRefSqlProvider extends BaseSqlProvider {

	public String update(WmDeliveryOrderRef record) {
		BEGIN();
        UPDATE("wm_delivery_order_ref");
        if (record.getWmDeliveryOrderRefId() != null) {
            SET("WM_DELIVERY_ORDER_REF_ID = #{wmDeliveryOrderRefId}");
        }
        if (record.getWmDeliveryOrderId() != null) {
            SET("WM_DELIVERY_ORDER_ID = #{wmDeliveryOrderId}");
        }
        if (record.getDeliveryOrderNo() != null) {
            SET("DELIVERY_ORDER_NO = #{deliveryOrderNo}");
        }
        if (record.getRefType() != null) {
            SET("REF_TYPE = #{refType}");
        }
        if (record.getRefId() != null) {
            SET("REF_ID = #{refId}");
        }
        if (record.getRefCode() != null) {
            SET("REF_CODE = #{refCode}");
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

        WHERE("wm_delivery_order_ref_id = #{wmDeliveryOrderRefId}");

        return SQL();
	}

    public String selectAllByRecord(WmDeliveryOrderRef record) {
        BEGIN();
        SELECT("*");
        FROM("wm_delivery_order_ref");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getWmDeliveryOrderRefId() != null) {
            stringBuffer.append(" AND WM_DELIVERY_ORDER_REF_ID = #{wmDeliveryOrderRefId}");
        }
        if (record.getWmDeliveryOrderId() != null) {
            stringBuffer.append(" AND WM_DELIVERY_ORDER_ID = #{wmDeliveryOrderId}");
        }
        if (record.getDeliveryOrderNo() != null) {
            stringBuffer.append(" AND DELIVERY_ORDER_NO = #{deliveryOrderNo}");
        }
        if (record.getRefType() != null) {
            stringBuffer.append(" AND REF_TYPE = #{refType}");
        }
        if (record.getRefId() != null) {
            stringBuffer.append(" AND REF_ID = #{refId}");
        }
        if (record.getRefCode() != null) {
            stringBuffer.append(" AND REF_CODE = #{refCode}");
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
