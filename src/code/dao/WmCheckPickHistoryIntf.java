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

import com.palette.busi.project.tms.core.entity.WmCheckPickHistory;
import com.palette.busi.project.tms.core.dao.WmCheckPickHistorySqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface WmCheckPickHistoryIntf extends BaseMybatisMapper {


	@Select("SELECT  WM_CHECK_PICK_HISTORY_ID  AS wmCheckPickHistoryId, TYPE  AS type, SUMMARY  AS summary, RESULT_STATUS  AS resultStatus, ACTION_DATE_TIME  AS actionDateTime, MEMO  AS memo, WAREHOUSE_CODE  AS warehouseCode, COUNTRY_CODE  AS countryCode, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM wm_check_pick_history WHERE wm_check_pick_history_id=#{wmCheckPickHistoryId}")
	public WmCheckPickHistory selectWmCheckPickHistoryById(@Param("wmCheckPickHistoryId") int wmCheckPickHistoryId);
	
	@Select("SELECT  WM_CHECK_PICK_HISTORY_ID  AS wmCheckPickHistoryId, TYPE  AS type, SUMMARY  AS summary, RESULT_STATUS  AS resultStatus, ACTION_DATE_TIME  AS actionDateTime, MEMO  AS memo, WAREHOUSE_CODE  AS warehouseCode, COUNTRY_CODE  AS countryCode, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM wm_check_pick_history")
	public List<WmCheckPickHistory> selectAllWmCheckPickHistory();
	
	@Insert("insert into wm_check_pick_history ( WM_CHECK_PICK_HISTORY_ID, TYPE, SUMMARY, RESULT_STATUS, ACTION_DATE_TIME, MEMO, WAREHOUSE_CODE, COUNTRY_CODE, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{wmCheckPickHistoryId},#{type},#{summary},#{resultStatus},#{actionDateTime},#{memo},#{warehouseCode},#{countryCode},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertWmCheckPickHistory(WmCheckPickHistory wmCheckPickHistory);

	@UpdateProvider(type=WmCheckPickHistorySqlProvider.class, method="update")
	public int updateWmCheckPickHistory(WmCheckPickHistory wmCheckPickHistory);
	
	@Delete("delete from wm_check_pick_history where wm_check_pick_history_id = #{wmCheckPickHistoryId}")
	public int deleteWmCheckPickHistory(@Param("wmCheckPickHistoryId") int wmCheckPickHistoryId);

    @SelectProvider(type=WmCheckPickHistorySqlProvider.class, method="selectAllByRecord")
    @ResultType(WmCheckPickHistory.class)
    public List<WmCheckPickHistory> selectAllByRecord(WmCheckPickHistory record);
    
}