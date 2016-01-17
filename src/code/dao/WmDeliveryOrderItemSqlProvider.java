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

import com.palette.busi.project.tms.core.entity.WmDeliveryOrderItem;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class WmDeliveryOrderItemSqlProvider extends BaseSqlProvider {

	public String update(WmDeliveryOrderItem record) {
		BEGIN();
        UPDATE("wm_delivery_order_item");
        if (record.getWmDeliveryOrderItemId() != null) {
            SET("WM_DELIVERY_ORDER_ITEM_ID = #{wmDeliveryOrderItemId}");
        }
        if (record.getWmDeliveryOrderId() != null) {
            SET("WM_DELIVERY_ORDER_ID = #{wmDeliveryOrderId}");
        }
        if (record.getPiecesNo() != null) {
            SET("PIECES_NO = #{piecesNo}");
        }
        if (record.getConsignmentNo() != null) {
            SET("CONSIGNMENT_NO = #{consignmentNo}");
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

        WHERE("wm_delivery_order_item_id = #{wmDeliveryOrderItemId}");

        return SQL();
	}

    public String selectAllByRecord(WmDeliveryOrderItem record) {
        BEGIN();
        SELECT("*");
        FROM("wm_delivery_order_item");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getWmDeliveryOrderItemId() != null) {
            stringBuffer.append(" AND WM_DELIVERY_ORDER_ITEM_ID = #{wmDeliveryOrderItemId}");
        }
        if (record.getWmDeliveryOrderId() != null) {
            stringBuffer.append(" AND WM_DELIVERY_ORDER_ID = #{wmDeliveryOrderId}");
        }
        if (record.getPiecesNo() != null) {
            stringBuffer.append(" AND PIECES_NO = #{piecesNo}");
        }
        if (record.getConsignmentNo() != null) {
            stringBuffer.append(" AND CONSIGNMENT_NO = #{consignmentNo}");
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
