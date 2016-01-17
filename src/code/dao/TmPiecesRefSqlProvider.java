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

import com.palette.busi.project.tms.core.entity.TmPiecesRef;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class TmPiecesRefSqlProvider extends BaseSqlProvider {

	public String update(TmPiecesRef record) {
		BEGIN();
        UPDATE("tm_pieces_ref");
        if (record.getTmPiecesRefId() != null) {
            SET("TM_PIECES_REF_ID = #{tmPiecesRefId}");
        }
        if (record.getTmPiecesId() != null) {
            SET("TM_PIECES_ID = #{tmPiecesId}");
        }
        if (record.getPiecesNo() != null) {
            SET("PIECES_NO = #{piecesNo}");
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
        if (record.getSummary() != null) {
            SET("SUMMARY = #{summary}");
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

        WHERE("tm_pieces_ref_id = #{tmPiecesRefId}");

        return SQL();
	}

    public String selectAllByRecord(TmPiecesRef record) {
        BEGIN();
        SELECT("*");
        FROM("tm_pieces_ref");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getTmPiecesRefId() != null) {
            stringBuffer.append(" AND TM_PIECES_REF_ID = #{tmPiecesRefId}");
        }
        if (record.getTmPiecesId() != null) {
            stringBuffer.append(" AND TM_PIECES_ID = #{tmPiecesId}");
        }
        if (record.getPiecesNo() != null) {
            stringBuffer.append(" AND PIECES_NO = #{piecesNo}");
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
        if (record.getSummary() != null) {
            stringBuffer.append(" AND SUMMARY = #{summary}");
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
