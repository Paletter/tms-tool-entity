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

import com.palette.busi.project.tms.core.entity.TmPiecesAction;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class TmPiecesActionSqlProvider extends BaseSqlProvider {

	public String update(TmPiecesAction record) {
		BEGIN();
        UPDATE("tm_pieces_action");
        if (record.getTmPiecesActionId() != null) {
            SET("TM_PIECES_ACTION_ID = #{tmPiecesActionId}");
        }
        if (record.getActionCode() != null) {
            SET("ACTION_CODE = #{actionCode}");
        }
        if (record.getActionDesc() != null) {
            SET("ACTION_DESC = #{actionDesc}");
        }
        if (record.getActionCodeDesc() != null) {
            SET("ACTION_CODE_DESC = #{actionCodeDesc}");
        }
        if (record.getAddrViewNo() != null) {
            SET("ADDR_VIEW_NO = #{addrViewNo}");
        }
        if (record.getAddrViewCode() != null) {
            SET("ADDR_VIEW_CODE = #{addrViewCode}");
        }
        if (record.getUserViewNo() != null) {
            SET("USER_VIEW_NO = #{userViewNo}");
        }
        if (record.getUserViewCode() != null) {
            SET("USER_VIEW_CODE = #{userViewCode}");
        }
        if (record.getIsActivity() != null) {
            SET("IS_ACTIVITY = #{isActivity}");
        }
        if (record.getIsLogistics() != null) {
            SET("IS_LOGISTICS = #{isLogistics}");
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

        WHERE("tm_pieces_action_id = #{tmPiecesActionId}");

        return SQL();
	}

    public String selectAllByRecord(TmPiecesAction record) {
        BEGIN();
        SELECT("*");
        FROM("tm_pieces_action");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getTmPiecesActionId() != null) {
            stringBuffer.append(" AND TM_PIECES_ACTION_ID = #{tmPiecesActionId}");
        }
        if (record.getActionCode() != null) {
            stringBuffer.append(" AND ACTION_CODE = #{actionCode}");
        }
        if (record.getActionDesc() != null) {
            stringBuffer.append(" AND ACTION_DESC = #{actionDesc}");
        }
        if (record.getActionCodeDesc() != null) {
            stringBuffer.append(" AND ACTION_CODE_DESC = #{actionCodeDesc}");
        }
        if (record.getAddrViewNo() != null) {
            stringBuffer.append(" AND ADDR_VIEW_NO = #{addrViewNo}");
        }
        if (record.getAddrViewCode() != null) {
            stringBuffer.append(" AND ADDR_VIEW_CODE = #{addrViewCode}");
        }
        if (record.getUserViewNo() != null) {
            stringBuffer.append(" AND USER_VIEW_NO = #{userViewNo}");
        }
        if (record.getUserViewCode() != null) {
            stringBuffer.append(" AND USER_VIEW_CODE = #{userViewCode}");
        }
        if (record.getIsActivity() != null) {
            stringBuffer.append(" AND IS_ACTIVITY = #{isActivity}");
        }
        if (record.getIsLogistics() != null) {
            stringBuffer.append(" AND IS_LOGISTICS = #{isLogistics}");
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
