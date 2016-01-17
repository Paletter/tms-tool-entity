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

import com.palette.busi.project.tms.core.entity.WmTransitPiecesRecord;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class WmTransitPiecesRecordSqlProvider extends BaseSqlProvider {

	public String update(WmTransitPiecesRecord record) {
		BEGIN();
        UPDATE("wm_transit_pieces_record");
        if (record.getWmTransitPiecesRecordId() != null) {
            SET("WM_TRANSIT_PIECES_RECORD_ID = #{wmTransitPiecesRecordId}");
        }
        if (record.getLogisticsNo() != null) {
            SET("LOGISTICS_NO = #{logisticsNo}");
        }
        if (record.getConsignmentNo() != null) {
            SET("CONSIGNMENT_NO = #{consignmentNo}");
        }
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{createTime}");
        }
        if (record.getCreateUser() != null) {
            SET("CREATE_USER = #{createUser}");
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

        WHERE("wm_transit_pieces_record_id = #{wmTransitPiecesRecordId}");

        return SQL();
	}

    public String selectAllByRecord(WmTransitPiecesRecord record) {
        BEGIN();
        SELECT("*");
        FROM("wm_transit_pieces_record");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getWmTransitPiecesRecordId() != null) {
            stringBuffer.append(" AND WM_TRANSIT_PIECES_RECORD_ID = #{wmTransitPiecesRecordId}");
        }
        if (record.getLogisticsNo() != null) {
            stringBuffer.append(" AND LOGISTICS_NO = #{logisticsNo}");
        }
        if (record.getConsignmentNo() != null) {
            stringBuffer.append(" AND CONSIGNMENT_NO = #{consignmentNo}");
        }
        if (record.getCreateTime() != null) {
            stringBuffer.append(" AND CREATE_TIME = #{createTime}");
        }
        if (record.getCreateUser() != null) {
            stringBuffer.append(" AND CREATE_USER = #{createUser}");
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
