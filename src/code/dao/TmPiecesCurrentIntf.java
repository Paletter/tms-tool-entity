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

import com.palette.busi.project.tms.core.entity.TmPiecesCurrent;
import com.palette.busi.project.tms.core.dao.TmPiecesCurrentSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface TmPiecesCurrentIntf extends BaseMybatisMapper {


	@Select("SELECT  TM_PIECES_CURRENT_ID  AS tmPiecesCurrentId, TM_PIECES_ID  AS tmPiecesId, PIECES_NO  AS piecesNo, ACTION_CODE  AS actionCode, MEMO  AS memo, ACTION_USER_NAME  AS actionUserName, ACTION_DATE_TIME  AS actionDateTime, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime FROM tm_pieces_current WHERE tm_pieces_current_id=#{tmPiecesCurrentId}")
	public TmPiecesCurrent selectTmPiecesCurrentById(@Param("tmPiecesCurrentId") int tmPiecesCurrentId);
	
	@Select("SELECT  TM_PIECES_CURRENT_ID  AS tmPiecesCurrentId, TM_PIECES_ID  AS tmPiecesId, PIECES_NO  AS piecesNo, ACTION_CODE  AS actionCode, MEMO  AS memo, ACTION_USER_NAME  AS actionUserName, ACTION_DATE_TIME  AS actionDateTime, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime FROM tm_pieces_current")
	public List<TmPiecesCurrent> selectAllTmPiecesCurrent();
	
	@Insert("insert into tm_pieces_current ( TM_PIECES_CURRENT_ID, TM_PIECES_ID, PIECES_NO, ACTION_CODE, MEMO, ACTION_USER_NAME, ACTION_DATE_TIME, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, UPDATE_USER_CODE, UPDATE_DATE_TIME ) values (#{tmPiecesCurrentId},#{tmPiecesId},#{piecesNo},#{actionCode},#{memo},#{actionUserName},#{actionDateTime},#{recordVersion},#{createUserCode},#{createDateTime},#{updateUserCode},#{updateDateTime})")
	public int insertTmPiecesCurrent(TmPiecesCurrent tmPiecesCurrent);

	@UpdateProvider(type=TmPiecesCurrentSqlProvider.class, method="update")
	public int updateTmPiecesCurrent(TmPiecesCurrent tmPiecesCurrent);
	
	@Delete("delete from tm_pieces_current where tm_pieces_current_id = #{tmPiecesCurrentId}")
	public int deleteTmPiecesCurrent(@Param("tmPiecesCurrentId") int tmPiecesCurrentId);

    @SelectProvider(type=TmPiecesCurrentSqlProvider.class, method="selectAllByRecord")
    @ResultType(TmPiecesCurrent.class)
    public List<TmPiecesCurrent> selectAllByRecord(TmPiecesCurrent record);
    
}