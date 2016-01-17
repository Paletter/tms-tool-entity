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

import com.palette.busi.project.tms.core.entity.WmDeliveryOrder;
import com.palette.busi.project.tms.core.dao.WmDeliveryOrderSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface WmDeliveryOrderIntf extends BaseMybatisMapper {


	@Select("SELECT  WM_DELIVERY_ORDER_ID  AS wmDeliveryOrderId, DELIVERY_ORDER_NO  AS deliveryOrderNo, DELIVERY_DATE  AS deliveryDate, COUNTRY_CODE  AS countryCode, WAREHOUSE_CODE  AS warehouseCode, SERVICE_PRODUCT_CODE  AS serviceProductCode, SECTOR_CODE  AS sectorCode, MAWB_CODE  AS mawbCode, TYPE  AS type, STATUS  AS status, CREATE_DATE_TIME  AS createDateTime, CREATE_USER_CODE  AS createUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_USER_CODE  AS updateUserCode FROM wm_delivery_order WHERE wm_delivery_order_id=#{wmDeliveryOrderId}")
	public WmDeliveryOrder selectWmDeliveryOrderById(@Param("wmDeliveryOrderId") int wmDeliveryOrderId);
	
	@Select("SELECT  WM_DELIVERY_ORDER_ID  AS wmDeliveryOrderId, DELIVERY_ORDER_NO  AS deliveryOrderNo, DELIVERY_DATE  AS deliveryDate, COUNTRY_CODE  AS countryCode, WAREHOUSE_CODE  AS warehouseCode, SERVICE_PRODUCT_CODE  AS serviceProductCode, SECTOR_CODE  AS sectorCode, MAWB_CODE  AS mawbCode, TYPE  AS type, STATUS  AS status, CREATE_DATE_TIME  AS createDateTime, CREATE_USER_CODE  AS createUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_USER_CODE  AS updateUserCode FROM wm_delivery_order")
	public List<WmDeliveryOrder> selectAllWmDeliveryOrder();
	
	@Insert("insert into wm_delivery_order ( WM_DELIVERY_ORDER_ID, DELIVERY_ORDER_NO, DELIVERY_DATE, COUNTRY_CODE, WAREHOUSE_CODE, SERVICE_PRODUCT_CODE, SECTOR_CODE, MAWB_CODE, TYPE, STATUS, CREATE_DATE_TIME, CREATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_USER_CODE ) values (#{wmDeliveryOrderId},#{deliveryOrderNo},#{deliveryDate},#{countryCode},#{warehouseCode},#{serviceProductCode},#{sectorCode},#{mawbCode},#{type},#{status},#{createDateTime},#{createUserCode},#{updateDateTime},#{updateUserCode})")
	public int insertWmDeliveryOrder(WmDeliveryOrder wmDeliveryOrder);

	@UpdateProvider(type=WmDeliveryOrderSqlProvider.class, method="update")
	public int updateWmDeliveryOrder(WmDeliveryOrder wmDeliveryOrder);
	
	@Delete("delete from wm_delivery_order where wm_delivery_order_id = #{wmDeliveryOrderId}")
	public int deleteWmDeliveryOrder(@Param("wmDeliveryOrderId") int wmDeliveryOrderId);

    @SelectProvider(type=WmDeliveryOrderSqlProvider.class, method="selectAllByRecord")
    @ResultType(WmDeliveryOrder.class)
    public List<WmDeliveryOrder> selectAllByRecord(WmDeliveryOrder record);
    
}