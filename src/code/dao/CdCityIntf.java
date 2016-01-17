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

import com.palette.busi.project.tms.core.entity.CdCity;
import com.palette.busi.project.tms.core.dao.CdCitySqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdCityIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_CITY_ID  AS cdCityId, CITY_CODE  AS cityCode, CITY_NAME  AS cityName, CITY_ENGLISH_NAME  AS cityEnglishName, STATE_CODE  AS stateCode, IS_REMOTE_AREA  AS isRemoteArea, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_city WHERE cd_city_id=#{cdCityId}")
	public CdCity selectCdCityById(@Param("cdCityId") int cdCityId);
	
	@Select("SELECT  CD_CITY_ID  AS cdCityId, CITY_CODE  AS cityCode, CITY_NAME  AS cityName, CITY_ENGLISH_NAME  AS cityEnglishName, STATE_CODE  AS stateCode, IS_REMOTE_AREA  AS isRemoteArea, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_city")
	public List<CdCity> selectAllCdCity();
	
	@Insert("insert into cd_city ( CD_CITY_ID, CITY_CODE, CITY_NAME, CITY_ENGLISH_NAME, STATE_CODE, IS_REMOTE_AREA, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdCityId},#{cityCode},#{cityName},#{cityEnglishName},#{stateCode},#{isRemoteArea},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdCity(CdCity cdCity);

	@UpdateProvider(type=CdCitySqlProvider.class, method="update")
	public int updateCdCity(CdCity cdCity);
	
	@Delete("delete from cd_city where cd_city_id = #{cdCityId}")
	public int deleteCdCity(@Param("cdCityId") int cdCityId);

    @SelectProvider(type=CdCitySqlProvider.class, method="selectAllByRecord")
    @ResultType(CdCity.class)
    public List<CdCity> selectAllByRecord(CdCity record);
    
}