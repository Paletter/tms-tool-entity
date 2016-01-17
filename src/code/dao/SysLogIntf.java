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

import com.palette.busi.project.tms.core.entity.SysLog;
import com.palette.busi.project.tms.core.dao.SysLogSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface SysLogIntf extends BaseMybatisMapper {


	@Select("SELECT  SYS_LOG_ID  AS sysLogId, CLASS_PATH_NAME  AS classPathName, CLASS_NAME  AS className, METHOD_NAME  AS methodName, PARAMETERS  AS parameters, RESULT  AS result, ACTION_USER_CODE  AS actionUserCode, ACTION_DATE_TIME  AS actionDateTime, SEESION_ID  AS seesionId, IP  AS ip, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM sys_log WHERE sys_log_id=#{sysLogId}")
	public SysLog selectSysLogById(@Param("sysLogId") int sysLogId);
	
	@Select("SELECT  SYS_LOG_ID  AS sysLogId, CLASS_PATH_NAME  AS classPathName, CLASS_NAME  AS className, METHOD_NAME  AS methodName, PARAMETERS  AS parameters, RESULT  AS result, ACTION_USER_CODE  AS actionUserCode, ACTION_DATE_TIME  AS actionDateTime, SEESION_ID  AS seesionId, IP  AS ip, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM sys_log")
	public List<SysLog> selectAllSysLog();
	
	@Insert("insert into sys_log ( SYS_LOG_ID, CLASS_PATH_NAME, CLASS_NAME, METHOD_NAME, PARAMETERS, RESULT, ACTION_USER_CODE, ACTION_DATE_TIME, SEESION_ID, IP, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{sysLogId},#{classPathName},#{className},#{methodName},#{parameters},#{result},#{actionUserCode},#{actionDateTime},#{seesionId},#{ip},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertSysLog(SysLog sysLog);

	@UpdateProvider(type=SysLogSqlProvider.class, method="update")
	public int updateSysLog(SysLog sysLog);
	
	@Delete("delete from sys_log where sys_log_id = #{sysLogId}")
	public int deleteSysLog(@Param("sysLogId") int sysLogId);

    @SelectProvider(type=SysLogSqlProvider.class, method="selectAllByRecord")
    @ResultType(SysLog.class)
    public List<SysLog> selectAllByRecord(SysLog record);
    
}