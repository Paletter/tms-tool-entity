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

import com.palette.busi.project.tms.core.entity.CdLogisticsVendor;
import com.palette.busi.project.tms.core.dao.CdLogisticsVendorSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdLogisticsVendorIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_LOGISTICS_VENDOR_ID  AS cdLogisticsVendorId, LOGISTICS_VENDOR_CODE  AS logisticsVendorCode, LOGISTICS_VENDOR_NAME  AS logisticsVendorName, COUNTRY_CODE  AS countryCode, IS_ACTIVE  AS isActive, SEQ  AS seq, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_logistics_vendor WHERE cd_logistics_vendor_id=#{cdLogisticsVendorId}")
	public CdLogisticsVendor selectCdLogisticsVendorById(@Param("cdLogisticsVendorId") int cdLogisticsVendorId);
	
	@Select("SELECT  CD_LOGISTICS_VENDOR_ID  AS cdLogisticsVendorId, LOGISTICS_VENDOR_CODE  AS logisticsVendorCode, LOGISTICS_VENDOR_NAME  AS logisticsVendorName, COUNTRY_CODE  AS countryCode, IS_ACTIVE  AS isActive, SEQ  AS seq, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_logistics_vendor")
	public List<CdLogisticsVendor> selectAllCdLogisticsVendor();
	
	@Insert("insert into cd_logistics_vendor ( CD_LOGISTICS_VENDOR_ID, LOGISTICS_VENDOR_CODE, LOGISTICS_VENDOR_NAME, COUNTRY_CODE, IS_ACTIVE, SEQ, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdLogisticsVendorId},#{logisticsVendorCode},#{logisticsVendorName},#{countryCode},#{isActive},#{seq},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdLogisticsVendor(CdLogisticsVendor cdLogisticsVendor);

	@UpdateProvider(type=CdLogisticsVendorSqlProvider.class, method="update")
	public int updateCdLogisticsVendor(CdLogisticsVendor cdLogisticsVendor);
	
	@Delete("delete from cd_logistics_vendor where cd_logistics_vendor_id = #{cdLogisticsVendorId}")
	public int deleteCdLogisticsVendor(@Param("cdLogisticsVendorId") int cdLogisticsVendorId);

    @SelectProvider(type=CdLogisticsVendorSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdLogisticsVendor.class)
    public List<CdLogisticsVendor> selectAllByRecord(CdLogisticsVendor record);
    
}