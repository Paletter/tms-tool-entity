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

import com.palette.busi.project.tms.core.entity.CdResRole;
import com.palette.busi.project.tms.core.dao.CdResRoleSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdResRoleIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_RES_ROLE_ID  AS cdResRoleId, CD_ROLE_ID  AS cdRoleId, CD_RESOURCE_ID  AS cdResourceId, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_res_role WHERE cd_res_role_id=#{cdResRoleId}")
	public CdResRole selectCdResRoleById(@Param("cdResRoleId") int cdResRoleId);
	
	@Select("SELECT  CD_RES_ROLE_ID  AS cdResRoleId, CD_ROLE_ID  AS cdRoleId, CD_RESOURCE_ID  AS cdResourceId, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_res_role")
	public List<CdResRole> selectAllCdResRole();
	
	@Insert("insert into cd_res_role ( CD_RES_ROLE_ID, CD_ROLE_ID, CD_RESOURCE_ID, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdResRoleId},#{cdRoleId},#{cdResourceId},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdResRole(CdResRole cdResRole);

	@UpdateProvider(type=CdResRoleSqlProvider.class, method="update")
	public int updateCdResRole(CdResRole cdResRole);
	
	@Delete("delete from cd_res_role where cd_res_role_id = #{cdResRoleId}")
	public int deleteCdResRole(@Param("cdResRoleId") int cdResRoleId);

    @SelectProvider(type=CdResRoleSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdResRole.class)
    public List<CdResRole> selectAllByRecord(CdResRole record);
    
}