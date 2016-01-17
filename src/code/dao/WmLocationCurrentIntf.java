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

import com.palette.busi.project.tms.core.entity.WmLocationCurrent;
import com.palette.busi.project.tms.core.dao.WmLocationCurrentSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface WmLocationCurrentIntf extends BaseMybatisMapper {


	@Select("SELECT  WM_LOCATION_CURRENT_ID  AS wmLocationCurrentId, WM_LOCATION_ID  AS wmLocationId, LOCATION_CODE  AS locationCode, WAREHOUSE_CODE  AS warehouseCode, TM_PIECES_ID  AS tmPiecesId, PIECES_NO  AS piecesNo, TM_CONSIGNMENT_ID  AS tmConsignmentId, CONSIGNMENT_NO  AS consignmentNo, MEMO  AS memo, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM wm_location_current WHERE wm_location_current_id=#{wmLocationCurrentId}")
	public WmLocationCurrent selectWmLocationCurrentById(@Param("wmLocationCurrentId") int wmLocationCurrentId);
	
	@Select("SELECT  WM_LOCATION_CURRENT_ID  AS wmLocationCurrentId, WM_LOCATION_ID  AS wmLocationId, LOCATION_CODE  AS locationCode, WAREHOUSE_CODE  AS warehouseCode, TM_PIECES_ID  AS tmPiecesId, PIECES_NO  AS piecesNo, TM_CONSIGNMENT_ID  AS tmConsignmentId, CONSIGNMENT_NO  AS consignmentNo, MEMO  AS memo, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM wm_location_current")
	public List<WmLocationCurrent> selectAllWmLocationCurrent();
	
	@Insert("insert into wm_location_current ( WM_LOCATION_CURRENT_ID, WM_LOCATION_ID, LOCATION_CODE, WAREHOUSE_CODE, TM_PIECES_ID, PIECES_NO, TM_CONSIGNMENT_ID, CONSIGNMENT_NO, MEMO, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{wmLocationCurrentId},#{wmLocationId},#{locationCode},#{warehouseCode},#{tmPiecesId},#{piecesNo},#{tmConsignmentId},#{consignmentNo},#{memo},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertWmLocationCurrent(WmLocationCurrent wmLocationCurrent);

	@UpdateProvider(type=WmLocationCurrentSqlProvider.class, method="update")
	public int updateWmLocationCurrent(WmLocationCurrent wmLocationCurrent);
	
	@Delete("delete from wm_location_current where wm_location_current_id = #{wmLocationCurrentId}")
	public int deleteWmLocationCurrent(@Param("wmLocationCurrentId") int wmLocationCurrentId);

    @SelectProvider(type=WmLocationCurrentSqlProvider.class, method="selectAllByRecord")
    @ResultType(WmLocationCurrent.class)
    public List<WmLocationCurrent> selectAllByRecord(WmLocationCurrent record);
    
}