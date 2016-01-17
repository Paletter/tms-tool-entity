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

import com.palette.busi.project.tms.core.entity.TmUnit;
import com.palette.busi.project.tms.core.dao.TmUnitSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface TmUnitIntf extends BaseMybatisMapper {


	@Select("SELECT  TM_UNIT_ID  AS tmUnitId, UNIT_LABEL  AS unitLabel, UNIT_NO  AS unitNo, UNIT_TYPE  AS unitType, ORIG_PORT  AS origPort, DEST_PORT  AS destPort, ETD  AS etd, ETA  AS eta, SEAL_NUMBER  AS sealNumber, VALUE_TYPE  AS valueType, SECTOR_CODE  AS sectorCode, TM_SECTOR_ID  AS tmSectorId, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM tm_unit WHERE tm_unit_id=#{tmUnitId}")
	public TmUnit selectTmUnitById(@Param("tmUnitId") int tmUnitId);
	
	@Select("SELECT  TM_UNIT_ID  AS tmUnitId, UNIT_LABEL  AS unitLabel, UNIT_NO  AS unitNo, UNIT_TYPE  AS unitType, ORIG_PORT  AS origPort, DEST_PORT  AS destPort, ETD  AS etd, ETA  AS eta, SEAL_NUMBER  AS sealNumber, VALUE_TYPE  AS valueType, SECTOR_CODE  AS sectorCode, TM_SECTOR_ID  AS tmSectorId, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM tm_unit")
	public List<TmUnit> selectAllTmUnit();
	
	@Insert("insert into tm_unit ( TM_UNIT_ID, UNIT_LABEL, UNIT_NO, UNIT_TYPE, ORIG_PORT, DEST_PORT, ETD, ETA, SEAL_NUMBER, VALUE_TYPE, SECTOR_CODE, TM_SECTOR_ID, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{tmUnitId},#{unitLabel},#{unitNo},#{unitType},#{origPort},#{destPort},#{etd},#{eta},#{sealNumber},#{valueType},#{sectorCode},#{tmSectorId},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertTmUnit(TmUnit tmUnit);

	@UpdateProvider(type=TmUnitSqlProvider.class, method="update")
	public int updateTmUnit(TmUnit tmUnit);
	
	@Delete("delete from tm_unit where tm_unit_id = #{tmUnitId}")
	public int deleteTmUnit(@Param("tmUnitId") int tmUnitId);

    @SelectProvider(type=TmUnitSqlProvider.class, method="selectAllByRecord")
    @ResultType(TmUnit.class)
    public List<TmUnit> selectAllByRecord(TmUnit record);
    
}