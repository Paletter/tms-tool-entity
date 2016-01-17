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

import com.palette.busi.project.tms.core.entity.CdDistrict;
import com.palette.busi.project.tms.core.dao.CdDistrictSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdDistrictIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_DISTRICT_ID  AS cdDistrictId, DISTRICT_CODE  AS districtCode, DISTRICT_NAME  AS districtName, DISTRICT_ENGLISH_NAME  AS districtEnglishName, CITY_CODE  AS cityCode, IS_REMOTE_AREA  AS isRemoteArea, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_district WHERE cd_district_id=#{cdDistrictId}")
	public CdDistrict selectCdDistrictById(@Param("cdDistrictId") int cdDistrictId);
	
	@Select("SELECT  CD_DISTRICT_ID  AS cdDistrictId, DISTRICT_CODE  AS districtCode, DISTRICT_NAME  AS districtName, DISTRICT_ENGLISH_NAME  AS districtEnglishName, CITY_CODE  AS cityCode, IS_REMOTE_AREA  AS isRemoteArea, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_district")
	public List<CdDistrict> selectAllCdDistrict();
	
	@Insert("insert into cd_district ( CD_DISTRICT_ID, DISTRICT_CODE, DISTRICT_NAME, DISTRICT_ENGLISH_NAME, CITY_CODE, IS_REMOTE_AREA, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdDistrictId},#{districtCode},#{districtName},#{districtEnglishName},#{cityCode},#{isRemoteArea},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdDistrict(CdDistrict cdDistrict);

	@UpdateProvider(type=CdDistrictSqlProvider.class, method="update")
	public int updateCdDistrict(CdDistrict cdDistrict);
	
	@Delete("delete from cd_district where cd_district_id = #{cdDistrictId}")
	public int deleteCdDistrict(@Param("cdDistrictId") int cdDistrictId);

    @SelectProvider(type=CdDistrictSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdDistrict.class)
    public List<CdDistrict> selectAllByRecord(CdDistrict record);
    
}