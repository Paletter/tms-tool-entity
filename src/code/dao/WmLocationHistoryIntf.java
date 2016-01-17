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

import com.palette.busi.project.tms.core.entity.WmLocationHistory;
import com.palette.busi.project.tms.core.dao.WmLocationHistorySqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface WmLocationHistoryIntf extends BaseMybatisMapper {


	@Select("SELECT  WM_LOCATION_HISTORY_ID  AS wmLocationHistoryId, WM_LOCATION_ID  AS wmLocationId, LOCATION_CODE  AS locationCode, WAREHOUSE_CODE  AS warehouseCode, TM_PIECES_ID  AS tmPiecesId, PIECES_NO  AS piecesNo, TM_CONSIGNMENT_ID  AS tmConsignmentId, CONSIGNMENT_NO  AS consignmentNo, ACTION_CODE  AS actionCode, MEMO  AS memo, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM wm_location_history WHERE wm_location_history_id=#{wmLocationHistoryId}")
	public WmLocationHistory selectWmLocationHistoryById(@Param("wmLocationHistoryId") int wmLocationHistoryId);
	
	@Select("SELECT  WM_LOCATION_HISTORY_ID  AS wmLocationHistoryId, WM_LOCATION_ID  AS wmLocationId, LOCATION_CODE  AS locationCode, WAREHOUSE_CODE  AS warehouseCode, TM_PIECES_ID  AS tmPiecesId, PIECES_NO  AS piecesNo, TM_CONSIGNMENT_ID  AS tmConsignmentId, CONSIGNMENT_NO  AS consignmentNo, ACTION_CODE  AS actionCode, MEMO  AS memo, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM wm_location_history")
	public List<WmLocationHistory> selectAllWmLocationHistory();
	
	@Insert("insert into wm_location_history ( WM_LOCATION_HISTORY_ID, WM_LOCATION_ID, LOCATION_CODE, WAREHOUSE_CODE, TM_PIECES_ID, PIECES_NO, TM_CONSIGNMENT_ID, CONSIGNMENT_NO, ACTION_CODE, MEMO, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{wmLocationHistoryId},#{wmLocationId},#{locationCode},#{warehouseCode},#{tmPiecesId},#{piecesNo},#{tmConsignmentId},#{consignmentNo},#{actionCode},#{memo},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertWmLocationHistory(WmLocationHistory wmLocationHistory);

	@UpdateProvider(type=WmLocationHistorySqlProvider.class, method="update")
	public int updateWmLocationHistory(WmLocationHistory wmLocationHistory);
	
	@Delete("delete from wm_location_history where wm_location_history_id = #{wmLocationHistoryId}")
	public int deleteWmLocationHistory(@Param("wmLocationHistoryId") int wmLocationHistoryId);

    @SelectProvider(type=WmLocationHistorySqlProvider.class, method="selectAllByRecord")
    @ResultType(WmLocationHistory.class)
    public List<WmLocationHistory> selectAllByRecord(WmLocationHistory record);
    
}