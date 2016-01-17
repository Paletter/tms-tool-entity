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

import com.palette.busi.project.tms.core.entity.TrDataSyncBusi;
import com.palette.busi.project.tms.core.dao.TrDataSyncBusiSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface TrDataSyncBusiIntf extends BaseMybatisMapper {


	@Select("SELECT  TR_DATA_SYNC_BUSI_ID  AS trDataSyncBusiId, TARGET_ID  AS targetId, KEY_ID  AS keyId, SYNC_CODE  AS syncCode, SYNC_DATA  AS syncData, MSG_FROM  AS msgFrom, MSG_TO  AS msgTo, SYNC_STATUS  AS syncStatus, CREATE_TIME  AS createTime, SEND_TIME  AS sendTime, ARRIVE_TIME  AS arriveTime, FAIL_NUMBER  AS failNumber, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM tr_data_sync_busi WHERE tr_data_sync_busi_id=#{trDataSyncBusiId}")
	public TrDataSyncBusi selectTrDataSyncBusiById(@Param("trDataSyncBusiId") int trDataSyncBusiId);
	
	@Select("SELECT  TR_DATA_SYNC_BUSI_ID  AS trDataSyncBusiId, TARGET_ID  AS targetId, KEY_ID  AS keyId, SYNC_CODE  AS syncCode, SYNC_DATA  AS syncData, MSG_FROM  AS msgFrom, MSG_TO  AS msgTo, SYNC_STATUS  AS syncStatus, CREATE_TIME  AS createTime, SEND_TIME  AS sendTime, ARRIVE_TIME  AS arriveTime, FAIL_NUMBER  AS failNumber, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM tr_data_sync_busi")
	public List<TrDataSyncBusi> selectAllTrDataSyncBusi();
	
	@Insert("insert into tr_data_sync_busi ( TR_DATA_SYNC_BUSI_ID, TARGET_ID, KEY_ID, SYNC_CODE, SYNC_DATA, MSG_FROM, MSG_TO, SYNC_STATUS, CREATE_TIME, SEND_TIME, ARRIVE_TIME, FAIL_NUMBER, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{trDataSyncBusiId},#{targetId},#{keyId},#{syncCode},#{syncData},#{msgFrom},#{msgTo},#{syncStatus},#{createTime},#{sendTime},#{arriveTime},#{failNumber},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertTrDataSyncBusi(TrDataSyncBusi trDataSyncBusi);

	@UpdateProvider(type=TrDataSyncBusiSqlProvider.class, method="update")
	public int updateTrDataSyncBusi(TrDataSyncBusi trDataSyncBusi);
	
	@Delete("delete from tr_data_sync_busi where tr_data_sync_busi_id = #{trDataSyncBusiId}")
	public int deleteTrDataSyncBusi(@Param("trDataSyncBusiId") int trDataSyncBusiId);

    @SelectProvider(type=TrDataSyncBusiSqlProvider.class, method="selectAllByRecord")
    @ResultType(TrDataSyncBusi.class)
    public List<TrDataSyncBusi> selectAllByRecord(TrDataSyncBusi record);
    
}