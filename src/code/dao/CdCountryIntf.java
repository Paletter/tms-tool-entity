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

import com.palette.busi.project.tms.core.entity.CdCountry;
import com.palette.busi.project.tms.core.dao.CdCountrySqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdCountryIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_COUNTRY_ID  AS cdCountryId, COUNTRY_CODE  AS countryCode, COUNTRY_NAME  AS countryName, COUNTRY_ENGLISH_NAME  AS countryEnglishName, REGION_CODE  AS regionCode, MEMO  AS memo, IS_ACTIVE  AS isActive, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_country WHERE cd_country_id=#{cdCountryId}")
	public CdCountry selectCdCountryById(@Param("cdCountryId") int cdCountryId);
	
	@Select("SELECT  CD_COUNTRY_ID  AS cdCountryId, COUNTRY_CODE  AS countryCode, COUNTRY_NAME  AS countryName, COUNTRY_ENGLISH_NAME  AS countryEnglishName, REGION_CODE  AS regionCode, MEMO  AS memo, IS_ACTIVE  AS isActive, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_country")
	public List<CdCountry> selectAllCdCountry();
	
	@Insert("insert into cd_country ( CD_COUNTRY_ID, COUNTRY_CODE, COUNTRY_NAME, COUNTRY_ENGLISH_NAME, REGION_CODE, MEMO, IS_ACTIVE, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdCountryId},#{countryCode},#{countryName},#{countryEnglishName},#{regionCode},#{memo},#{isActive},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdCountry(CdCountry cdCountry);

	@UpdateProvider(type=CdCountrySqlProvider.class, method="update")
	public int updateCdCountry(CdCountry cdCountry);
	
	@Delete("delete from cd_country where cd_country_id = #{cdCountryId}")
	public int deleteCdCountry(@Param("cdCountryId") int cdCountryId);

    @SelectProvider(type=CdCountrySqlProvider.class, method="selectAllByRecord")
    @ResultType(CdCountry.class)
    public List<CdCountry> selectAllByRecord(CdCountry record);
    
}