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

import com.palette.busi.project.tms.core.entity.WmLocation;
import com.palette.busi.project.tms.core.dao.WmLocationSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface WmLocationIntf extends BaseMybatisMapper {


	@Select("SELECT  WM_LOCATION_ID  AS wmLocationId, LOCATION_CODE  AS locationCode, MEMO  AS memo, WAREHOUSE_CODE  AS warehouseCode, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM wm_location WHERE wm_location_id=#{wmLocationId}")
	public WmLocation selectWmLocationById(@Param("wmLocationId") int wmLocationId);
	
	@Select("SELECT  WM_LOCATION_ID  AS wmLocationId, LOCATION_CODE  AS locationCode, MEMO  AS memo, WAREHOUSE_CODE  AS warehouseCode, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM wm_location")
	public List<WmLocation> selectAllWmLocation();
	
	@Insert("insert into wm_location ( WM_LOCATION_ID, LOCATION_CODE, MEMO, WAREHOUSE_CODE, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{wmLocationId},#{locationCode},#{memo},#{warehouseCode},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertWmLocation(WmLocation wmLocation);

	@UpdateProvider(type=WmLocationSqlProvider.class, method="update")
	public int updateWmLocation(WmLocation wmLocation);
	
	@Delete("delete from wm_location where wm_location_id = #{wmLocationId}")
	public int deleteWmLocation(@Param("wmLocationId") int wmLocationId);

    @SelectProvider(type=WmLocationSqlProvider.class, method="selectAllByRecord")
    @ResultType(WmLocation.class)
    public List<WmLocation> selectAllByRecord(WmLocation record);
    
}