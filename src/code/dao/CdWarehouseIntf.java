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

import com.palette.busi.project.tms.core.entity.CdWarehouse;
import com.palette.busi.project.tms.core.dao.CdWarehouseSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdWarehouseIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_WAREHOUSE_ID  AS cdWarehouseId, WAREHOUSE_CODE  AS warehouseCode, WAREHOUSE_DESC  AS warehouseDesc, COUNTRY_CODE  AS countryCode, STATE_CODE  AS stateCode, CITY_CODE  AS cityCode, STREET  AS street, POST_CODE  AS postCode, MEMO  AS memo, IS_ACTIVE  AS isActive, DEFAULT_SERVICE_PRODUCT_CODE  AS defaultServiceProductCode, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_warehouse WHERE cd_warehouse_id=#{cdWarehouseId}")
	public CdWarehouse selectCdWarehouseById(@Param("cdWarehouseId") int cdWarehouseId);
	
	@Select("SELECT  CD_WAREHOUSE_ID  AS cdWarehouseId, WAREHOUSE_CODE  AS warehouseCode, WAREHOUSE_DESC  AS warehouseDesc, COUNTRY_CODE  AS countryCode, STATE_CODE  AS stateCode, CITY_CODE  AS cityCode, STREET  AS street, POST_CODE  AS postCode, MEMO  AS memo, IS_ACTIVE  AS isActive, DEFAULT_SERVICE_PRODUCT_CODE  AS defaultServiceProductCode, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_warehouse")
	public List<CdWarehouse> selectAllCdWarehouse();
	
	@Insert("insert into cd_warehouse ( CD_WAREHOUSE_ID, WAREHOUSE_CODE, WAREHOUSE_DESC, COUNTRY_CODE, STATE_CODE, CITY_CODE, STREET, POST_CODE, MEMO, IS_ACTIVE, DEFAULT_SERVICE_PRODUCT_CODE, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdWarehouseId},#{warehouseCode},#{warehouseDesc},#{countryCode},#{stateCode},#{cityCode},#{street},#{postCode},#{memo},#{isActive},#{defaultServiceProductCode},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdWarehouse(CdWarehouse cdWarehouse);

	@UpdateProvider(type=CdWarehouseSqlProvider.class, method="update")
	public int updateCdWarehouse(CdWarehouse cdWarehouse);
	
	@Delete("delete from cd_warehouse where cd_warehouse_id = #{cdWarehouseId}")
	public int deleteCdWarehouse(@Param("cdWarehouseId") int cdWarehouseId);

    @SelectProvider(type=CdWarehouseSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdWarehouse.class)
    public List<CdWarehouse> selectAllByRecord(CdWarehouse record);
    
}