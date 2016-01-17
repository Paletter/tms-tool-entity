package com.palette.busi.project.tms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.ResultType;

import com.palette.busi.project.tms.core.entity.TmSector;
import com.palette.busi.project.tms.core.dao.TmSectorSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface TmSectorIntf extends BaseMybatisMapper {


	@Select("SELECT  TM_SECTOR_ID  AS tmSectorId, SECTOR_LABEL  AS sectorLabel, SECTOR_CODE  AS sectorCode, FLIGHT_CODE  AS flightCode, ORIG_PORT  AS origPort, DEST_PORT  AS destPort, ETD  AS etd, ETA  AS eta, MAWB_CODE  AS mawbCode, TOTAL_QTY  AS totalQty, TOTAL_WEIGHT  AS totalWeight, TOTAL_GOODS_DESCRIPTION  AS totalGoodsDescription, CREATE_TIME  AS createTime, WAREHOUSE_CODE  AS warehouseCode, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM tm_sector WHERE tm_sector_id=#{tmSectorId}")
	public TmSector selectTmSectorById(@Param("tmSectorId") int tmSectorId);
	
	@Select("SELECT  TM_SECTOR_ID  AS tmSectorId, SECTOR_LABEL  AS sectorLabel, SECTOR_CODE  AS sectorCode, FLIGHT_CODE  AS flightCode, ORIG_PORT  AS origPort, DEST_PORT  AS destPort, ETD  AS etd, ETA  AS eta, MAWB_CODE  AS mawbCode, TOTAL_QTY  AS totalQty, TOTAL_WEIGHT  AS totalWeight, TOTAL_GOODS_DESCRIPTION  AS totalGoodsDescription, CREATE_TIME  AS createTime, WAREHOUSE_CODE  AS warehouseCode, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM tm_sector")
	public List<TmSector> selectAllTmSector();
	
	@Insert("insert into tm_sector ( TM_SECTOR_ID, SECTOR_LABEL, SECTOR_CODE, FLIGHT_CODE, ORIG_PORT, DEST_PORT, ETD, ETA, MAWB_CODE, TOTAL_QTY, TOTAL_WEIGHT, TOTAL_GOODS_DESCRIPTION, CREATE_TIME, WAREHOUSE_CODE, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{tmSectorId},#{sectorLabel},#{sectorCode},#{flightCode},#{origPort},#{destPort},#{etd},#{eta},#{mawbCode},#{totalQty},#{totalWeight},#{totalGoodsDescription},#{createTime},#{warehouseCode},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertTmSector(TmSector tmSector);

	@UpdateProvider(type=TmSectorSqlProvider.class, method="update")
	public int updateTmSector(TmSector tmSector);
	
	@Delete("delete from tm_sector where tm_sector_id = #{tmSectorId}")
	public int deleteTmSector(@Param("tmSectorId") int tmSectorId);

    @SelectProvider(type=TmSectorSqlProvider.class, method="selectAllByRecord")
    @ResultType(TmSector.class)
    public List<TmSector> selectAllByRecord(TmSector record);
    
}