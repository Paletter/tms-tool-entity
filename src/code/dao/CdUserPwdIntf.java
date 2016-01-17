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

import com.palette.busi.project.tms.core.entity.CdUserPwd;
import com.palette.busi.project.tms.core.dao.CdUserPwdSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdUserPwdIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_USER_PWD_ID  AS cdUserPwdId, CD_USER_ID  AS cdUserId, USER_NAME  AS userName, SALT  AS salt, PWD  AS pwd, LAST_LOGIN_TIME  AS lastLoginTime, LAST_LOGIN_IP  AS lastLoginIp, COOKIE  AS cookie, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_user_pwd WHERE cd_user_pwd_id=#{cdUserPwdId}")
	public CdUserPwd selectCdUserPwdById(@Param("cdUserPwdId") int cdUserPwdId);
	
	@Select("SELECT  CD_USER_PWD_ID  AS cdUserPwdId, CD_USER_ID  AS cdUserId, USER_NAME  AS userName, SALT  AS salt, PWD  AS pwd, LAST_LOGIN_TIME  AS lastLoginTime, LAST_LOGIN_IP  AS lastLoginIp, COOKIE  AS cookie, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_user_pwd")
	public List<CdUserPwd> selectAllCdUserPwd();
	
	@Insert("insert into cd_user_pwd ( CD_USER_PWD_ID, CD_USER_ID, USER_NAME, SALT, PWD, LAST_LOGIN_TIME, LAST_LOGIN_IP, COOKIE, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdUserPwdId},#{cdUserId},#{userName},#{salt},#{pwd},#{lastLoginTime},#{lastLoginIp},#{cookie},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdUserPwd(CdUserPwd cdUserPwd);

	@UpdateProvider(type=CdUserPwdSqlProvider.class, method="update")
	public int updateCdUserPwd(CdUserPwd cdUserPwd);
	
	@Delete("delete from cd_user_pwd where cd_user_pwd_id = #{cdUserPwdId}")
	public int deleteCdUserPwd(@Param("cdUserPwdId") int cdUserPwdId);

    @SelectProvider(type=CdUserPwdSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdUserPwd.class)
    public List<CdUserPwd> selectAllByRecord(CdUserPwd record);
    
}