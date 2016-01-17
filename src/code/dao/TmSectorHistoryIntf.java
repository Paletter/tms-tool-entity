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

import com.palette.busi.project.tms.core.entity.TmSectorHistory;
import com.palette.busi.project.tms.core.dao.TmSectorHistorySqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface TmSectorHistoryIntf extends BaseMybatisMapper {


	@Select("SELECT  TM_SECTOR_HISTORY_ID  AS tmSectorHistoryId, SECTOR_CODE  AS sectorCode, ACTION_CODE  AS actionCode, ACTION_PLACE  AS actionPlace, ACTION_DATE_TIME  AS actionDateTime, UPDATED_USER_NAME  AS updatedUserName, UPDATED_DATE_TIME  AS updatedDateTime, MEMO  AS memo, TM_SECTOR_ID  AS tmSectorId, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM tm_sector_history WHERE tm_sector_history_id=#{tmSectorHistoryId}")
	public TmSectorHistory selectTmSectorHistoryById(@Param("tmSectorHistoryId") int tmSectorHistoryId);
	
	@Select("SELECT  TM_SECTOR_HISTORY_ID  AS tmSectorHistoryId, SECTOR_CODE  AS sectorCode, ACTION_CODE  AS actionCode, ACTION_PLACE  AS actionPlace, ACTION_DATE_TIME  AS actionDateTime, UPDATED_USER_NAME  AS updatedUserName, UPDATED_DATE_TIME  AS updatedDateTime, MEMO  AS memo, TM_SECTOR_ID  AS tmSectorId, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM tm_sector_history")
	public List<TmSectorHistory> selectAllTmSectorHistory();
	
	@Insert("insert into tm_sector_history ( TM_SECTOR_HISTORY_ID, SECTOR_CODE, ACTION_CODE, ACTION_PLACE, ACTION_DATE_TIME, UPDATED_USER_NAME, UPDATED_DATE_TIME, MEMO, TM_SECTOR_ID, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{tmSectorHistoryId},#{sectorCode},#{actionCode},#{actionPlace},#{actionDateTime},#{updatedUserName},#{updatedDateTime},#{memo},#{tmSectorId},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertTmSectorHistory(TmSectorHistory tmSectorHistory);

	@UpdateProvider(type=TmSectorHistorySqlProvider.class, method="update")
	public int updateTmSectorHistory(TmSectorHistory tmSectorHistory);
	
	@Delete("delete from tm_sector_history where tm_sector_history_id = #{tmSectorHistoryId}")
	public int deleteTmSectorHistory(@Param("tmSectorHistoryId") int tmSectorHistoryId);

    @SelectProvider(type=TmSectorHistorySqlProvider.class, method="selectAllByRecord")
    @ResultType(TmSectorHistory.class)
    public List<TmSectorHistory> selectAllByRecord(TmSectorHistory record);
    
}