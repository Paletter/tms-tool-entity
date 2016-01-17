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

import com.palette.busi.project.tms.core.entity.CdDelivery;
import com.palette.busi.project.tms.core.dao.CdDeliverySqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdDeliveryIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_DELIVERY_ID  AS cdDeliveryId, DELIVERY_NAME  AS deliveryName, DELIVERY_CODE  AS deliveryCode, DELIVERY_ORDER  AS deliveryOrder, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_delivery WHERE cd_delivery_id=#{cdDeliveryId}")
	public CdDelivery selectCdDeliveryById(@Param("cdDeliveryId") int cdDeliveryId);
	
	@Select("SELECT  CD_DELIVERY_ID  AS cdDeliveryId, DELIVERY_NAME  AS deliveryName, DELIVERY_CODE  AS deliveryCode, DELIVERY_ORDER  AS deliveryOrder, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_delivery")
	public List<CdDelivery> selectAllCdDelivery();
	
	@Insert("insert into cd_delivery ( CD_DELIVERY_ID, DELIVERY_NAME, DELIVERY_CODE, DELIVERY_ORDER, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdDeliveryId},#{deliveryName},#{deliveryCode},#{deliveryOrder},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdDelivery(CdDelivery cdDelivery);

	@UpdateProvider(type=CdDeliverySqlProvider.class, method="update")
	public int updateCdDelivery(CdDelivery cdDelivery);
	
	@Delete("delete from cd_delivery where cd_delivery_id = #{cdDeliveryId}")
	public int deleteCdDelivery(@Param("cdDeliveryId") int cdDeliveryId);

    @SelectProvider(type=CdDeliverySqlProvider.class, method="selectAllByRecord")
    @ResultType(CdDelivery.class)
    public List<CdDelivery> selectAllByRecord(CdDelivery record);
    
}