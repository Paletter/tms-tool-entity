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

import com.palette.busi.project.tms.core.entity.TmUnit;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class TmUnitSqlProvider extends BaseSqlProvider {

	public String update(TmUnit record) {
		BEGIN();
        UPDATE("tm_unit");
        if (record.getTmUnitId() != null) {
            SET("TM_UNIT_ID = #{tmUnitId}");
        }
        if (record.getUnitLabel() != null) {
            SET("UNIT_LABEL = #{unitLabel}");
        }
        if (record.getUnitNo() != null) {
            SET("UNIT_NO = #{unitNo}");
        }
        if (record.getUnitType() != null) {
            SET("UNIT_TYPE = #{unitType}");
        }
        if (record.getOrigPort() != null) {
            SET("ORIG_PORT = #{origPort}");
        }
        if (record.getDestPort() != null) {
            SET("DEST_PORT = #{destPort}");
        }
        if (record.getEtd() != null) {
            SET("ETD = #{etd}");
        }
        if (record.getEta() != null) {
            SET("ETA = #{eta}");
        }
        if (record.getSealNumber() != null) {
            SET("SEAL_NUMBER = #{sealNumber}");
        }
        if (record.getValueType() != null) {
            SET("VALUE_TYPE = #{valueType}");
        }
        if (record.getSectorCode() != null) {
            SET("SECTOR_CODE = #{sectorCode}");
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

        WHERE("tm_unit_id = #{tmUnitId}");

        return SQL();
	}

    public String selectAllByRecord(TmUnit record) {
        BEGIN();
        SELECT("*");
        FROM("tm_unit");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getTmUnitId() != null) {
            stringBuffer.append(" AND TM_UNIT_ID = #{tmUnitId}");
        }
        if (record.getUnitLabel() != null) {
            stringBuffer.append(" AND UNIT_LABEL = #{unitLabel}");
        }
        if (record.getUnitNo() != null) {
            stringBuffer.append(" AND UNIT_NO = #{unitNo}");
        }
        if (record.getUnitType() != null) {
            stringBuffer.append(" AND UNIT_TYPE = #{unitType}");
        }
        if (record.getOrigPort() != null) {
            stringBuffer.append(" AND ORIG_PORT = #{origPort}");
        }
        if (record.getDestPort() != null) {
            stringBuffer.append(" AND DEST_PORT = #{destPort}");
        }
        if (record.getEtd() != null) {
            stringBuffer.append(" AND ETD = #{etd}");
        }
        if (record.getEta() != null) {
            stringBuffer.append(" AND ETA = #{eta}");
        }
        if (record.getSealNumber() != null) {
            stringBuffer.append(" AND SEAL_NUMBER = #{sealNumber}");
        }
        if (record.getValueType() != null) {
            stringBuffer.append(" AND VALUE_TYPE = #{valueType}");
        }
        if (record.getSectorCode() != null) {
            stringBuffer.append(" AND SECTOR_CODE = #{sectorCode}");
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
