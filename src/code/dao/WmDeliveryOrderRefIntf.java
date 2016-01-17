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

import com.palette.busi.project.tms.core.entity.WmDeliveryOrderRef;
import com.palette.busi.project.tms.core.dao.WmDeliveryOrderRefSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface WmDeliveryOrderRefIntf extends BaseMybatisMapper {


	@Select("SELECT  WM_DELIVERY_ORDER_REF_ID  AS wmDeliveryOrderRefId, WM_DELIVERY_ORDER_ID  AS wmDeliveryOrderId, DELIVERY_ORDER_NO  AS deliveryOrderNo, REF_TYPE  AS refType, REF_ID  AS refId, REF_CODE  AS refCode, CREATE_DATE_TIME  AS createDateTime, CREATE_USER_CODE  AS createUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_USER_CODE  AS updateUserCode FROM wm_delivery_order_ref WHERE wm_delivery_order_ref_id=#{wmDeliveryOrderRefId}")
	public WmDeliveryOrderRef selectWmDeliveryOrderRefById(@Param("wmDeliveryOrderRefId") int wmDeliveryOrderRefId);
	
	@Select("SELECT  WM_DELIVERY_ORDER_REF_ID  AS wmDeliveryOrderRefId, WM_DELIVERY_ORDER_ID  AS wmDeliveryOrderId, DELIVERY_ORDER_NO  AS deliveryOrderNo, REF_TYPE  AS refType, REF_ID  AS refId, REF_CODE  AS refCode, CREATE_DATE_TIME  AS createDateTime, CREATE_USER_CODE  AS createUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_USER_CODE  AS updateUserCode FROM wm_delivery_order_ref")
	public List<WmDeliveryOrderRef> selectAllWmDeliveryOrderRef();
	
	@Insert("insert into wm_delivery_order_ref ( WM_DELIVERY_ORDER_REF_ID, WM_DELIVERY_ORDER_ID, DELIVERY_ORDER_NO, REF_TYPE, REF_ID, REF_CODE, CREATE_DATE_TIME, CREATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_USER_CODE ) values (#{wmDeliveryOrderRefId},#{wmDeliveryOrderId},#{deliveryOrderNo},#{refType},#{refId},#{refCode},#{createDateTime},#{createUserCode},#{updateDateTime},#{updateUserCode})")
	public int insertWmDeliveryOrderRef(WmDeliveryOrderRef wmDeliveryOrderRef);

	@UpdateProvider(type=WmDeliveryOrderRefSqlProvider.class, method="update")
	public int updateWmDeliveryOrderRef(WmDeliveryOrderRef wmDeliveryOrderRef);
	
	@Delete("delete from wm_delivery_order_ref where wm_delivery_order_ref_id = #{wmDeliveryOrderRefId}")
	public int deleteWmDeliveryOrderRef(@Param("wmDeliveryOrderRefId") int wmDeliveryOrderRefId);

    @SelectProvider(type=WmDeliveryOrderRefSqlProvider.class, method="selectAllByRecord")
    @ResultType(WmDeliveryOrderRef.class)
    public List<WmDeliveryOrderRef> selectAllByRecord(WmDeliveryOrderRef record);
    
}