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

import com.palette.busi.project.tms.core.entity.CdPort;
import com.palette.busi.project.tms.core.dao.CdPortSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdPortIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_PORT_ID  AS cdPortId, PORT_CODE  AS portCode, PORT_NAME  AS portName, PORT_ENGLISH_NAME  AS portEnglishName, CITY_CODE  AS cityCode, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_port WHERE cd_port_id=#{cdPortId}")
	public CdPort selectCdPortById(@Param("cdPortId") int cdPortId);
	
	@Select("SELECT  CD_PORT_ID  AS cdPortId, PORT_CODE  AS portCode, PORT_NAME  AS portName, PORT_ENGLISH_NAME  AS portEnglishName, CITY_CODE  AS cityCode, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_port")
	public List<CdPort> selectAllCdPort();
	
	@Insert("insert into cd_port ( CD_PORT_ID, PORT_CODE, PORT_NAME, PORT_ENGLISH_NAME, CITY_CODE, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdPortId},#{portCode},#{portName},#{portEnglishName},#{cityCode},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdPort(CdPort cdPort);

	@UpdateProvider(type=CdPortSqlProvider.class, method="update")
	public int updateCdPort(CdPort cdPort);
	
	@Delete("delete from cd_port where cd_port_id = #{cdPortId}")
	public int deleteCdPort(@Param("cdPortId") int cdPortId);

    @SelectProvider(type=CdPortSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdPort.class)
    public List<CdPort> selectAllByRecord(CdPort record);
    
}