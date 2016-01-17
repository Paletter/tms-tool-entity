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

import com.palette.busi.project.tms.core.entity.TmSector;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class TmSectorSqlProvider extends BaseSqlProvider {

	public String update(TmSector record) {
		BEGIN();
        UPDATE("tm_sector");
        if (record.getTmSectorId() != null) {
            SET("TM_SECTOR_ID = #{tmSectorId}");
        }
        if (record.getSectorLabel() != null) {
            SET("SECTOR_LABEL = #{sectorLabel}");
        }
        if (record.getSectorCode() != null) {
            SET("SECTOR_CODE = #{sectorCode}");
        }
        if (record.getFlightCode() != null) {
            SET("FLIGHT_CODE = #{flightCode}");
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
        if (record.getMawbCode() != null) {
            SET("MAWB_CODE = #{mawbCode}");
        }
        if (record.getTotalQty() != null) {
            SET("TOTAL_QTY = #{totalQty}");
        }
        if (record.getTotalWeight() != null) {
            SET("TOTAL_WEIGHT = #{totalWeight}");
        }
        if (record.getTotalGoodsDescription() != null) {
            SET("TOTAL_GOODS_DESCRIPTION = #{totalGoodsDescription}");
        }
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{createTime}");
        }
        if (record.getWarehouseCode() != null) {
            SET("WAREHOUSE_CODE = #{warehouseCode}");
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

        WHERE("tm_sector_id = #{tmSectorId}");

        return SQL();
	}

    public String selectAllByRecord(TmSector record) {
        BEGIN();
        SELECT("*");
        FROM("tm_sector");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getTmSectorId() != null) {
            stringBuffer.append(" AND TM_SECTOR_ID = #{tmSectorId}");
        }
        if (record.getSectorLabel() != null) {
            stringBuffer.append(" AND SECTOR_LABEL = #{sectorLabel}");
        }
        if (record.getSectorCode() != null) {
            stringBuffer.append(" AND SECTOR_CODE = #{sectorCode}");
        }
        if (record.getFlightCode() != null) {
            stringBuffer.append(" AND FLIGHT_CODE = #{flightCode}");
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
        if (record.getMawbCode() != null) {
            stringBuffer.append(" AND MAWB_CODE = #{mawbCode}");
        }
        if (record.getTotalQty() != null) {
            stringBuffer.append(" AND TOTAL_QTY = #{totalQty}");
        }
        if (record.getTotalWeight() != null) {
            stringBuffer.append(" AND TOTAL_WEIGHT = #{totalWeight}");
        }
        if (record.getTotalGoodsDescription() != null) {
            stringBuffer.append(" AND TOTAL_GOODS_DESCRIPTION = #{totalGoodsDescription}");
        }
        if (record.getCreateTime() != null) {
            stringBuffer.append(" AND CREATE_TIME = #{createTime}");
        }
        if (record.getWarehouseCode() != null) {
            stringBuffer.append(" AND WAREHOUSE_CODE = #{warehouseCode}");
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
