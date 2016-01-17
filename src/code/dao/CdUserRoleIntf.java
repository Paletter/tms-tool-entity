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

import com.palette.busi.project.tms.core.entity.CdUserRole;
import com.palette.busi.project.tms.core.dao.CdUserRoleSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdUserRoleIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_USER_ROLE_ID  AS cdUserRoleId, CD_USER_ID  AS cdUserId, CD_ROLE_ID  AS cdRoleId, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_user_role WHERE cd_user_role_id=#{cdUserRoleId}")
	public CdUserRole selectCdUserRoleById(@Param("cdUserRoleId") int cdUserRoleId);
	
	@Select("SELECT  CD_USER_ROLE_ID  AS cdUserRoleId, CD_USER_ID  AS cdUserId, CD_ROLE_ID  AS cdRoleId, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_user_role")
	public List<CdUserRole> selectAllCdUserRole();
	
	@Insert("insert into cd_user_role ( CD_USER_ROLE_ID, CD_USER_ID, CD_ROLE_ID, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdUserRoleId},#{cdUserId},#{cdRoleId},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdUserRole(CdUserRole cdUserRole);

	@UpdateProvider(type=CdUserRoleSqlProvider.class, method="update")
	public int updateCdUserRole(CdUserRole cdUserRole);
	
	@Delete("delete from cd_user_role where cd_user_role_id = #{cdUserRoleId}")
	public int deleteCdUserRole(@Param("cdUserRoleId") int cdUserRoleId);

    @SelectProvider(type=CdUserRoleSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdUserRole.class)
    public List<CdUserRole> selectAllByRecord(CdUserRole record);
    
}