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

import com.palette.busi.project.tms.core.entity.TmPiecesHistory;
import com.palette.busi.project.tms.core.dao.TmPiecesHistorySqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface TmPiecesHistoryIntf extends BaseMybatisMapper {


	@Select("SELECT  TM_PIECES_HISTORY_ID  AS tmPiecesHistoryId, PIECES_NO  AS piecesNo, TM_PIECES_ID  AS tmPiecesId, ACTION_CODE  AS actionCode, MEMO  AS memo, ACTION_USER_NAME  AS actionUserName, ACTION_DATE_TIME  AS actionDateTime, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime FROM tm_pieces_history WHERE tm_pieces_history_id=#{tmPiecesHistoryId}")
	public TmPiecesHistory selectTmPiecesHistoryById(@Param("tmPiecesHistoryId") int tmPiecesHistoryId);
	
	@Select("SELECT  TM_PIECES_HISTORY_ID  AS tmPiecesHistoryId, PIECES_NO  AS piecesNo, TM_PIECES_ID  AS tmPiecesId, ACTION_CODE  AS actionCode, MEMO  AS memo, ACTION_USER_NAME  AS actionUserName, ACTION_DATE_TIME  AS actionDateTime, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime FROM tm_pieces_history")
	public List<TmPiecesHistory> selectAllTmPiecesHistory();
	
	@Insert("insert into tm_pieces_history ( TM_PIECES_HISTORY_ID, PIECES_NO, TM_PIECES_ID, ACTION_CODE, MEMO, ACTION_USER_NAME, ACTION_DATE_TIME, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, UPDATE_USER_CODE, UPDATE_DATE_TIME ) values (#{tmPiecesHistoryId},#{piecesNo},#{tmPiecesId},#{actionCode},#{memo},#{actionUserName},#{actionDateTime},#{recordVersion},#{createUserCode},#{createDateTime},#{updateUserCode},#{updateDateTime})")
	public int insertTmPiecesHistory(TmPiecesHistory tmPiecesHistory);

	@UpdateProvider(type=TmPiecesHistorySqlProvider.class, method="update")
	public int updateTmPiecesHistory(TmPiecesHistory tmPiecesHistory);
	
	@Delete("delete from tm_pieces_history where tm_pieces_history_id = #{tmPiecesHistoryId}")
	public int deleteTmPiecesHistory(@Param("tmPiecesHistoryId") int tmPiecesHistoryId);

    @SelectProvider(type=TmPiecesHistorySqlProvider.class, method="selectAllByRecord")
    @ResultType(TmPiecesHistory.class)
    public List<TmPiecesHistory> selectAllByRecord(TmPiecesHistory record);
    
}