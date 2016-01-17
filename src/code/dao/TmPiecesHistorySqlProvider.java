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

import com.palette.busi.project.tms.core.entity.TmPiecesHistory;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class TmPiecesHistorySqlProvider extends BaseSqlProvider {

	public String update(TmPiecesHistory record) {
		BEGIN();
        UPDATE("tm_pieces_history");
        if (record.getTmPiecesHistoryId() != null) {
            SET("TM_PIECES_HISTORY_ID = #{tmPiecesHistoryId}");
        }
        if (record.getPiecesNo() != null) {
            SET("PIECES_NO = #{piecesNo}");
        }
        if (record.getTmPiecesId() != null) {
            SET("TM_PIECES_ID = #{tmPiecesId}");
        }
        if (record.getActionCode() != null) {
            SET("ACTION_CODE = #{actionCode}");
        }
        if (record.getMemo() != null) {
            SET("MEMO = #{memo}");
        }
        if (record.getActionUserName() != null) {
            SET("ACTION_USER_NAME = #{actionUserName}");
        }
        if (record.getActionDateTime() != null) {
            SET("ACTION_DATE_TIME = #{actionDateTime}");
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

        WHERE("tm_pieces_history_id = #{tmPiecesHistoryId}");

        return SQL();
	}

    public String selectAllByRecord(TmPiecesHistory record) {
        BEGIN();
        SELECT("*");
        FROM("tm_pieces_history");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getTmPiecesHistoryId() != null) {
            stringBuffer.append(" AND TM_PIECES_HISTORY_ID = #{tmPiecesHistoryId}");
        }
        if (record.getPiecesNo() != null) {
            stringBuffer.append(" AND PIECES_NO = #{piecesNo}");
        }
        if (record.getTmPiecesId() != null) {
            stringBuffer.append(" AND TM_PIECES_ID = #{tmPiecesId}");
        }
        if (record.getActionCode() != null) {
            stringBuffer.append(" AND ACTION_CODE = #{actionCode}");
        }
        if (record.getMemo() != null) {
            stringBuffer.append(" AND MEMO = #{memo}");
        }
        if (record.getActionUserName() != null) {
            stringBuffer.append(" AND ACTION_USER_NAME = #{actionUserName}");
        }
        if (record.getActionDateTime() != null) {
            stringBuffer.append(" AND ACTION_DATE_TIME = #{actionDateTime}");
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
