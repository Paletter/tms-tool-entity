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

import com.palette.busi.project.tms.core.entity.TrDataSyncBusi;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class TrDataSyncBusiSqlProvider extends BaseSqlProvider {

	public String update(TrDataSyncBusi record) {
		BEGIN();
        UPDATE("tr_data_sync_busi");
        if (record.getTrDataSyncBusiId() != null) {
            SET("TR_DATA_SYNC_BUSI_ID = #{trDataSyncBusiId}");
        }
        if (record.getTargetId() != null) {
            SET("TARGET_ID = #{targetId}");
        }
        if (record.getKeyId() != null) {
            SET("KEY_ID = #{keyId}");
        }
        if (record.getSyncCode() != null) {
            SET("SYNC_CODE = #{syncCode}");
        }
        if (record.getSyncData() != null) {
            SET("SYNC_DATA = #{syncData}");
        }
        if (record.getMsgFrom() != null) {
            SET("MSG_FROM = #{msgFrom}");
        }
        if (record.getMsgTo() != null) {
            SET("MSG_TO = #{msgTo}");
        }
        if (record.getSyncStatus() != null) {
            SET("SYNC_STATUS = #{syncStatus}");
        }
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{createTime}");
        }
        if (record.getSendTime() != null) {
            SET("SEND_TIME = #{sendTime}");
        }
        if (record.getArriveTime() != null) {
            SET("ARRIVE_TIME = #{arriveTime}");
        }
        if (record.getFailNumber() != null) {
            SET("FAIL_NUMBER = #{failNumber}");
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

        WHERE("tr_data_sync_busi_id = #{trDataSyncBusiId}");

        return SQL();
	}

    public String selectAllByRecord(TrDataSyncBusi record) {
        BEGIN();
        SELECT("*");
        FROM("tr_data_sync_busi");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getTrDataSyncBusiId() != null) {
            stringBuffer.append(" AND TR_DATA_SYNC_BUSI_ID = #{trDataSyncBusiId}");
        }
        if (record.getTargetId() != null) {
            stringBuffer.append(" AND TARGET_ID = #{targetId}");
        }
        if (record.getKeyId() != null) {
            stringBuffer.append(" AND KEY_ID = #{keyId}");
        }
        if (record.getSyncCode() != null) {
            stringBuffer.append(" AND SYNC_CODE = #{syncCode}");
        }
        if (record.getSyncData() != null) {
            stringBuffer.append(" AND SYNC_DATA = #{syncData}");
        }
        if (record.getMsgFrom() != null) {
            stringBuffer.append(" AND MSG_FROM = #{msgFrom}");
        }
        if (record.getMsgTo() != null) {
            stringBuffer.append(" AND MSG_TO = #{msgTo}");
        }
        if (record.getSyncStatus() != null) {
            stringBuffer.append(" AND SYNC_STATUS = #{syncStatus}");
        }
        if (record.getCreateTime() != null) {
            stringBuffer.append(" AND CREATE_TIME = #{createTime}");
        }
        if (record.getSendTime() != null) {
            stringBuffer.append(" AND SEND_TIME = #{sendTime}");
        }
        if (record.getArriveTime() != null) {
            stringBuffer.append(" AND ARRIVE_TIME = #{arriveTime}");
        }
        if (record.getFailNumber() != null) {
            stringBuffer.append(" AND FAIL_NUMBER = #{failNumber}");
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
