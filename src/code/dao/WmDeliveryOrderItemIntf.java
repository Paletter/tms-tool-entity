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

import com.palette.busi.project.tms.core.entity.WmDeliveryOrderItem;
import com.palette.busi.project.tms.core.dao.WmDeliveryOrderItemSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface WmDeliveryOrderItemIntf extends BaseMybatisMapper {


	@Select("SELECT  WM_DELIVERY_ORDER_ITEM_ID  AS wmDeliveryOrderItemId, WM_DELIVERY_ORDER_ID  AS wmDeliveryOrderId, PIECES_NO  AS piecesNo, CONSIGNMENT_NO  AS consignmentNo, STATUS  AS status, CREATE_DATE_TIME  AS createDateTime, CREATE_USER_CODE  AS createUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_USER_CODE  AS updateUserCode FROM wm_delivery_order_item WHERE wm_delivery_order_item_id=#{wmDeliveryOrderItemId}")
	public WmDeliveryOrderItem selectWmDeliveryOrderItemById(@Param("wmDeliveryOrderItemId") int wmDeliveryOrderItemId);
	
	@Select("SELECT  WM_DELIVERY_ORDER_ITEM_ID  AS wmDeliveryOrderItemId, WM_DELIVERY_ORDER_ID  AS wmDeliveryOrderId, PIECES_NO  AS piecesNo, CONSIGNMENT_NO  AS consignmentNo, STATUS  AS status, CREATE_DATE_TIME  AS createDateTime, CREATE_USER_CODE  AS createUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_USER_CODE  AS updateUserCode FROM wm_delivery_order_item")
	public List<WmDeliveryOrderItem> selectAllWmDeliveryOrderItem();
	
	@Insert("insert into wm_delivery_order_item ( WM_DELIVERY_ORDER_ITEM_ID, WM_DELIVERY_ORDER_ID, PIECES_NO, CONSIGNMENT_NO, STATUS, CREATE_DATE_TIME, CREATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_USER_CODE ) values (#{wmDeliveryOrderItemId},#{wmDeliveryOrderId},#{piecesNo},#{consignmentNo},#{status},#{createDateTime},#{createUserCode},#{updateDateTime},#{updateUserCode})")
	public int insertWmDeliveryOrderItem(WmDeliveryOrderItem wmDeliveryOrderItem);

	@UpdateProvider(type=WmDeliveryOrderItemSqlProvider.class, method="update")
	public int updateWmDeliveryOrderItem(WmDeliveryOrderItem wmDeliveryOrderItem);
	
	@Delete("delete from wm_delivery_order_item where wm_delivery_order_item_id = #{wmDeliveryOrderItemId}")
	public int deleteWmDeliveryOrderItem(@Param("wmDeliveryOrderItemId") int wmDeliveryOrderItemId);

    @SelectProvider(type=WmDeliveryOrderItemSqlProvider.class, method="selectAllByRecord")
    @ResultType(WmDeliveryOrderItem.class)
    public List<WmDeliveryOrderItem> selectAllByRecord(WmDeliveryOrderItem record);
    
}