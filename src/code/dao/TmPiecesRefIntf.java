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

import com.palette.busi.project.tms.core.entity.TmPiecesRef;
import com.palette.busi.project.tms.core.dao.TmPiecesRefSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface TmPiecesRefIntf extends BaseMybatisMapper {


	@Select("SELECT  TM_PIECES_REF_ID  AS tmPiecesRefId, TM_PIECES_ID  AS tmPiecesId, PIECES_NO  AS piecesNo, REF_TYPE  AS refType, REF_ID  AS refId, REF_CODE  AS refCode, SUMMARY  AS summary, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM tm_pieces_ref WHERE tm_pieces_ref_id=#{tmPiecesRefId}")
	public TmPiecesRef selectTmPiecesRefById(@Param("tmPiecesRefId") int tmPiecesRefId);
	
	@Select("SELECT  TM_PIECES_REF_ID  AS tmPiecesRefId, TM_PIECES_ID  AS tmPiecesId, PIECES_NO  AS piecesNo, REF_TYPE  AS refType, REF_ID  AS refId, REF_CODE  AS refCode, SUMMARY  AS summary, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM tm_pieces_ref")
	public List<TmPiecesRef> selectAllTmPiecesRef();
	
	@Insert("insert into tm_pieces_ref ( TM_PIECES_REF_ID, TM_PIECES_ID, PIECES_NO, REF_TYPE, REF_ID, REF_CODE, SUMMARY, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{tmPiecesRefId},#{tmPiecesId},#{piecesNo},#{refType},#{refId},#{refCode},#{summary},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertTmPiecesRef(TmPiecesRef tmPiecesRef);

	@UpdateProvider(type=TmPiecesRefSqlProvider.class, method="update")
	public int updateTmPiecesRef(TmPiecesRef tmPiecesRef);
	
	@Delete("delete from tm_pieces_ref where tm_pieces_ref_id = #{tmPiecesRefId}")
	public int deleteTmPiecesRef(@Param("tmPiecesRefId") int tmPiecesRefId);

    @SelectProvider(type=TmPiecesRefSqlProvider.class, method="selectAllByRecord")
    @ResultType(TmPiecesRef.class)
    public List<TmPiecesRef> selectAllByRecord(TmPiecesRef record);
    
}