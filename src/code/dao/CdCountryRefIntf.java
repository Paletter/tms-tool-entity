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

import com.palette.busi.project.tms.core.entity.CdCountryRef;
import com.palette.busi.project.tms.core.dao.CdCountryRefSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdCountryRefIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_COUNTRY_REF_ID  AS cdCountryRefId, WEIGHT_UNIT  AS weightUnit, VOLUME_UNIT  AS volumeUnit, MEASURE_UNIT  AS measureUnit, CURRENCY  AS currency, CURRENCY_SYMBOL  AS currencySymbol, LANGUAGE  AS language, VOLUME_WEIGHT_BASE  AS volumeWeightBase, CONVERT_TO_KG  AS convertToKg, CD_COUNTRY_ID  AS cdCountryId, COUNTRY_CODE  AS countryCode, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_country_ref WHERE cd_country_ref_id=#{cdCountryRefId}")
	public CdCountryRef selectCdCountryRefById(@Param("cdCountryRefId") int cdCountryRefId);
	
	@Select("SELECT  CD_COUNTRY_REF_ID  AS cdCountryRefId, WEIGHT_UNIT  AS weightUnit, VOLUME_UNIT  AS volumeUnit, MEASURE_UNIT  AS measureUnit, CURRENCY  AS currency, CURRENCY_SYMBOL  AS currencySymbol, LANGUAGE  AS language, VOLUME_WEIGHT_BASE  AS volumeWeightBase, CONVERT_TO_KG  AS convertToKg, CD_COUNTRY_ID  AS cdCountryId, COUNTRY_CODE  AS countryCode, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_country_ref")
	public List<CdCountryRef> selectAllCdCountryRef();
	
	@Insert("insert into cd_country_ref ( CD_COUNTRY_REF_ID, WEIGHT_UNIT, VOLUME_UNIT, MEASURE_UNIT, CURRENCY, CURRENCY_SYMBOL, LANGUAGE, VOLUME_WEIGHT_BASE, CONVERT_TO_KG, CD_COUNTRY_ID, COUNTRY_CODE, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdCountryRefId},#{weightUnit},#{volumeUnit},#{measureUnit},#{currency},#{currencySymbol},#{language},#{volumeWeightBase},#{convertToKg},#{cdCountryId},#{countryCode},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdCountryRef(CdCountryRef cdCountryRef);

	@UpdateProvider(type=CdCountryRefSqlProvider.class, method="update")
	public int updateCdCountryRef(CdCountryRef cdCountryRef);
	
	@Delete("delete from cd_country_ref where cd_country_ref_id = #{cdCountryRefId}")
	public int deleteCdCountryRef(@Param("cdCountryRefId") int cdCountryRefId);

    @SelectProvider(type=CdCountryRefSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdCountryRef.class)
    public List<CdCountryRef> selectAllByRecord(CdCountryRef record);
    
}