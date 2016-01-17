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

import com.palette.busi.project.tms.core.entity.TmPieces;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class TmPiecesSqlProvider extends BaseSqlProvider {

	public String update(TmPieces record) {
		BEGIN();
        UPDATE("tm_pieces");
        if (record.getTmPiecesId() != null) {
            SET("TM_PIECES_ID = #{tmPiecesId}");
        }
        if (record.getSeq() != null) {
            SET("SEQ = #{seq}");
        }
        if (record.getWarehouseCode() != null) {
            SET("WAREHOUSE_CODE = #{warehouseCode}");
        }
        if (record.getMemberCode() != null) {
            SET("MEMBER_CODE = #{memberCode}");
        }
        if (record.getPiecesNo() != null) {
            SET("PIECES_NO = #{piecesNo}");
        }
        if (record.getLogisticsNo() != null) {
            SET("LOGISTICS_NO = #{logisticsNo}");
        }
        if (record.getActualWeight() != null) {
            SET("ACTUAL_WEIGHT = #{actualWeight}");
        }
        if (record.getVolumeWeight() != null) {
            SET("VOLUME_WEIGHT = #{volumeWeight}");
        }
        if (record.getLength() != null) {
            SET("LENGTH = #{length}");
        }
        if (record.getWidth() != null) {
            SET("WIDTH = #{width}");
        }
        if (record.getHeight() != null) {
            SET("HEIGHT = #{height}");
        }
        if (record.getCheckDate() != null) {
            SET("CHECK_DATE = #{checkDate}");
        }
        if (record.getMemo() != null) {
            SET("MEMO = #{memo}");
        }
        if (record.getDeliveryDate() != null) {
            SET("DELIVERY_DATE = #{deliveryDate}");
        }
        if (record.getIsBindDelivery() != null) {
            SET("IS_BIND_DELIVERY = #{isBindDelivery}");
        }
        if (record.getTmConsignmentId() != null) {
            SET("TM_CONSIGNMENT_ID = #{tmConsignmentId}");
        }
        if (record.getConsignmentNo() != null) {
            SET("CONSIGNMENT_NO = #{consignmentNo}");
        }
        if (record.getUnitNo() != null) {
            SET("UNIT_NO = #{unitNo}");
        }
        if (record.getTmUnitId() != null) {
            SET("TM_UNIT_ID = #{tmUnitId}");
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
        if (record.getUpdateUserCode() != null) {
            SET("UPDATE_USER_CODE = #{updateUserCode}");
        }
        if (record.getUpdateDateTime() != null) {
            SET("UPDATE_DATE_TIME = #{updateDateTime}");
        }

        WHERE("tm_pieces_id = #{tmPiecesId}");

        return SQL();
	}

    public String selectAllByRecord(TmPieces record) {
        BEGIN();
        SELECT("*");
        FROM("tm_pieces");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getTmPiecesId() != null) {
            stringBuffer.append(" AND TM_PIECES_ID = #{tmPiecesId}");
        }
        if (record.getSeq() != null) {
            stringBuffer.append(" AND SEQ = #{seq}");
        }
        if (record.getWarehouseCode() != null) {
            stringBuffer.append(" AND WAREHOUSE_CODE = #{warehouseCode}");
        }
        if (record.getMemberCode() != null) {
            stringBuffer.append(" AND MEMBER_CODE = #{memberCode}");
        }
        if (record.getPiecesNo() != null) {
            stringBuffer.append(" AND PIECES_NO = #{piecesNo}");
        }
        if (record.getLogisticsNo() != null) {
            stringBuffer.append(" AND LOGISTICS_NO = #{logisticsNo}");
        }
        if (record.getActualWeight() != null) {
            stringBuffer.append(" AND ACTUAL_WEIGHT = #{actualWeight}");
        }
        if (record.getVolumeWeight() != null) {
            stringBuffer.append(" AND VOLUME_WEIGHT = #{volumeWeight}");
        }
        if (record.getLength() != null) {
            stringBuffer.append(" AND LENGTH = #{length}");
        }
        if (record.getWidth() != null) {
            stringBuffer.append(" AND WIDTH = #{width}");
        }
        if (record.getHeight() != null) {
            stringBuffer.append(" AND HEIGHT = #{height}");
        }
        if (record.getCheckDate() != null) {
            stringBuffer.append(" AND CHECK_DATE = #{checkDate}");
        }
        if (record.getMemo() != null) {
            stringBuffer.append(" AND MEMO = #{memo}");
        }
        if (record.getDeliveryDate() != null) {
            stringBuffer.append(" AND DELIVERY_DATE = #{deliveryDate}");
        }
        if (record.getIsBindDelivery() != null) {
            stringBuffer.append(" AND IS_BIND_DELIVERY = #{isBindDelivery}");
        }
        if (record.getTmConsignmentId() != null) {
            stringBuffer.append(" AND TM_CONSIGNMENT_ID = #{tmConsignmentId}");
        }
        if (record.getConsignmentNo() != null) {
            stringBuffer.append(" AND CONSIGNMENT_NO = #{consignmentNo}");
        }
        if (record.getUnitNo() != null) {
            stringBuffer.append(" AND UNIT_NO = #{unitNo}");
        }
        if (record.getTmUnitId() != null) {
            stringBuffer.append(" AND TM_UNIT_ID = #{tmUnitId}");
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
        if (record.getUpdateUserCode() != null) {
            stringBuffer.append(" AND UPDATE_USER_CODE = #{updateUserCode}");
        }
        if (record.getUpdateDateTime() != null) {
            stringBuffer.append(" AND UPDATE_DATE_TIME = #{updateDateTime}");
        }

        WHERE(stringBuffer.toString());

        return SQL();
    }
}
