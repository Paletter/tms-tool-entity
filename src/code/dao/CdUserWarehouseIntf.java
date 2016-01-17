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

import com.palette.busi.project.tms.core.entity.CdUserWarehouse;
import com.palette.busi.project.tms.core.dao.CdUserWarehouseSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdUserWarehouseIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_USER_WAREHOUSE_ID  AS cdUserWarehouseId, CD_USER_ID  AS cdUserId, CD_WAREHOUSE_ID  AS cdWarehouseId, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_user_warehouse WHERE cd_user_warehouse_id=#{cdUserWarehouseId}")
	public CdUserWarehouse selectCdUserWarehouseById(@Param("cdUserWarehouseId") int cdUserWarehouseId);
	
	@Select("SELECT  CD_USER_WAREHOUSE_ID  AS cdUserWarehouseId, CD_USER_ID  AS cdUserId, CD_WAREHOUSE_ID  AS cdWarehouseId, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_user_warehouse")
	public List<CdUserWarehouse> selectAllCdUserWarehouse();
	
	@Insert("insert into cd_user_warehouse ( CD_USER_WAREHOUSE_ID, CD_USER_ID, CD_WAREHOUSE_ID, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdUserWarehouseId},#{cdUserId},#{cdWarehouseId},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdUserWarehouse(CdUserWarehouse cdUserWarehouse);

	@UpdateProvider(type=CdUserWarehouseSqlProvider.class, method="update")
	public int updateCdUserWarehouse(CdUserWarehouse cdUserWarehouse);
	
	@Delete("delete from cd_user_warehouse where cd_user_warehouse_id = #{cdUserWarehouseId}")
	public int deleteCdUserWarehouse(@Param("cdUserWarehouseId") int cdUserWarehouseId);

    @SelectProvider(type=CdUserWarehouseSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdUserWarehouse.class)
    public List<CdUserWarehouse> selectAllByRecord(CdUserWarehouse record);
    
}