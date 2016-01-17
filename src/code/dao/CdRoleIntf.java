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

import com.palette.busi.project.tms.core.entity.CdRole;
import com.palette.busi.project.tms.core.dao.CdRoleSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdRoleIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_ROLE_ID  AS cdRoleId, ROLE_NAME  AS roleName, DESCPT  AS descpt, CATEGORY  AS category, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_role WHERE cd_role_id=#{cdRoleId}")
	public CdRole selectCdRoleById(@Param("cdRoleId") int cdRoleId);
	
	@Select("SELECT  CD_ROLE_ID  AS cdRoleId, ROLE_NAME  AS roleName, DESCPT  AS descpt, CATEGORY  AS category, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_role")
	public List<CdRole> selectAllCdRole();
	
	@Insert("insert into cd_role ( CD_ROLE_ID, ROLE_NAME, DESCPT, CATEGORY, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdRoleId},#{roleName},#{descpt},#{category},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdRole(CdRole cdRole);

	@UpdateProvider(type=CdRoleSqlProvider.class, method="update")
	public int updateCdRole(CdRole cdRole);
	
	@Delete("delete from cd_role where cd_role_id = #{cdRoleId}")
	public int deleteCdRole(@Param("cdRoleId") int cdRoleId);

    @SelectProvider(type=CdRoleSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdRole.class)
    public List<CdRole> selectAllByRecord(CdRole record);
    
}