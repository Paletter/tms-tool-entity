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

import com.palette.busi.project.tms.core.entity.TmSectorHistory;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class TmSectorHistorySqlProvider extends BaseSqlProvider {

	public String update(TmSectorHistory record) {
		BEGIN();
        UPDATE("tm_sector_history");
        if (record.getTmSectorHistoryId() != null) {
            SET("TM_SECTOR_HISTORY_ID = #{tmSectorHistoryId}");
        }
        if (record.getSectorCode() != null) {
            SET("SECTOR_CODE = #{sectorCode}");
        }
        if (record.getActionCode() != null) {
            SET("ACTION_CODE = #{actionCode}");
        }
        if (record.getActionPlace() != null) {
            SET("ACTION_PLACE = #{actionPlace}");
        }
        if (record.getActionDateTime() != null) {
            SET("ACTION_DATE_TIME = #{actionDateTime}");
        }
        if (record.getUpdatedUserName() != null) {
            SET("UPDATED_USER_NAME = #{updatedUserName}");
        }
        if (record.getUpdatedDateTime() != null) {
            SET("UPDATED_DATE_TIME = #{updatedDateTime}");
        }
        if (record.getMemo() != null) {
            SET("MEMO = #{memo}");
        }
        if (record.getTmSectorId() != null) {
            SET("TM_SECTOR_ID = #{tmSectorId}");
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

        WHERE("tm_sector_history_id = #{tmSectorHistoryId}");

        return SQL();
	}

    public String selectAllByRecord(TmSectorHistory record) {
        BEGIN();
        SELECT("*");
        FROM("tm_sector_history");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getTmSectorHistoryId() != null) {
            stringBuffer.append(" AND TM_SECTOR_HISTORY_ID = #{tmSectorHistoryId}");
        }
        if (record.getSectorCode() != null) {
            stringBuffer.append(" AND SECTOR_CODE = #{sectorCode}");
        }
        if (record.getActionCode() != null) {
            stringBuffer.append(" AND ACTION_CODE = #{actionCode}");
        }
        if (record.getActionPlace() != null) {
            stringBuffer.append(" AND ACTION_PLACE = #{actionPlace}");
        }
        if (record.getActionDateTime() != null) {
            stringBuffer.append(" AND ACTION_DATE_TIME = #{actionDateTime}");
        }
        if (record.getUpdatedUserName() != null) {
            stringBuffer.append(" AND UPDATED_USER_NAME = #{updatedUserName}");
        }
        if (record.getUpdatedDateTime() != null) {
            stringBuffer.append(" AND UPDATED_DATE_TIME = #{updatedDateTime}");
        }
        if (record.getMemo() != null) {
            stringBuffer.append(" AND MEMO = #{memo}");
        }
        if (record.getTmSectorId() != null) {
            stringBuffer.append(" AND TM_SECTOR_ID = #{tmSectorId}");
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
