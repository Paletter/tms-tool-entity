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

import com.palette.busi.project.tms.core.entity.CdState;
import com.palette.busi.project.tms.core.dao.CdStateSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdStateIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_STATE_ID  AS cdStateId, STATE_CODE  AS stateCode, STATE_NAME  AS stateName, STATE_CHINESE_NAME  AS stateChineseName, STATE_ENGLISH_NAME  AS stateEnglishName, COUNTRY_CODE  AS countryCode, MEMO  AS memo, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_state WHERE cd_state_id=#{cdStateId}")
	public CdState selectCdStateById(@Param("cdStateId") int cdStateId);
	
	@Select("SELECT  CD_STATE_ID  AS cdStateId, STATE_CODE  AS stateCode, STATE_NAME  AS stateName, STATE_CHINESE_NAME  AS stateChineseName, STATE_ENGLISH_NAME  AS stateEnglishName, COUNTRY_CODE  AS countryCode, MEMO  AS memo, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_state")
	public List<CdState> selectAllCdState();
	
	@Insert("insert into cd_state ( CD_STATE_ID, STATE_CODE, STATE_NAME, STATE_CHINESE_NAME, STATE_ENGLISH_NAME, COUNTRY_CODE, MEMO, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdStateId},#{stateCode},#{stateName},#{stateChineseName},#{stateEnglishName},#{countryCode},#{memo},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdState(CdState cdState);

	@UpdateProvider(type=CdStateSqlProvider.class, method="update")
	public int updateCdState(CdState cdState);
	
	@Delete("delete from cd_state where cd_state_id = #{cdStateId}")
	public int deleteCdState(@Param("cdStateId") int cdStateId);

    @SelectProvider(type=CdStateSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdState.class)
    public List<CdState> selectAllByRecord(CdState record);
    
}