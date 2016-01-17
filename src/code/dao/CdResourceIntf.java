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

import com.palette.busi.project.tms.core.entity.CdResource;
import com.palette.busi.project.tms.core.dao.CdResourceSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdResourceIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_RESOURCE_ID  AS cdResourceId, RESOURCE_NAME  AS resourceName, RESOURCE_URL  AS resourceUrl, MENU_ORDER  AS menuOrder, MENU_CATE  AS menuCate, DESCPT  AS descpt, IS_ACTIVE  AS isActive, CATEGORY  AS category, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_resource WHERE cd_resource_id=#{cdResourceId}")
	public CdResource selectCdResourceById(@Param("cdResourceId") int cdResourceId);
	
	@Select("SELECT  CD_RESOURCE_ID  AS cdResourceId, RESOURCE_NAME  AS resourceName, RESOURCE_URL  AS resourceUrl, MENU_ORDER  AS menuOrder, MENU_CATE  AS menuCate, DESCPT  AS descpt, IS_ACTIVE  AS isActive, CATEGORY  AS category, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_resource")
	public List<CdResource> selectAllCdResource();
	
	@Insert("insert into cd_resource ( CD_RESOURCE_ID, RESOURCE_NAME, RESOURCE_URL, MENU_ORDER, MENU_CATE, DESCPT, IS_ACTIVE, CATEGORY, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdResourceId},#{resourceName},#{resourceUrl},#{menuOrder},#{menuCate},#{descpt},#{isActive},#{category},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdResource(CdResource cdResource);

	@UpdateProvider(type=CdResourceSqlProvider.class, method="update")
	public int updateCdResource(CdResource cdResource);
	
	@Delete("delete from cd_resource where cd_resource_id = #{cdResourceId}")
	public int deleteCdResource(@Param("cdResourceId") int cdResourceId);

    @SelectProvider(type=CdResourceSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdResource.class)
    public List<CdResource> selectAllByRecord(CdResource record);
    
}