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

import com.palette.busi.project.tms.core.entity.TmPiecesAction;
import com.palette.busi.project.tms.core.dao.TmPiecesActionSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface TmPiecesActionIntf extends BaseMybatisMapper {


	@Select("SELECT  TM_PIECES_ACTION_ID  AS tmPiecesActionId, ACTION_CODE  AS actionCode, ACTION_DESC  AS actionDesc, ACTION_CODE_DESC  AS actionCodeDesc, ADDR_VIEW_NO  AS addrViewNo, ADDR_VIEW_CODE  AS addrViewCode, USER_VIEW_NO  AS userViewNo, USER_VIEW_CODE  AS userViewCode, IS_ACTIVITY  AS isActivity, IS_LOGISTICS  AS isLogistics, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime FROM tm_pieces_action WHERE tm_pieces_action_id=#{tmPiecesActionId}")
	public TmPiecesAction selectTmPiecesActionById(@Param("tmPiecesActionId") int tmPiecesActionId);
	
	@Select("SELECT  TM_PIECES_ACTION_ID  AS tmPiecesActionId, ACTION_CODE  AS actionCode, ACTION_DESC  AS actionDesc, ACTION_CODE_DESC  AS actionCodeDesc, ADDR_VIEW_NO  AS addrViewNo, ADDR_VIEW_CODE  AS addrViewCode, USER_VIEW_NO  AS userViewNo, USER_VIEW_CODE  AS userViewCode, IS_ACTIVITY  AS isActivity, IS_LOGISTICS  AS isLogistics, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime FROM tm_pieces_action")
	public List<TmPiecesAction> selectAllTmPiecesAction();
	
	@Insert("insert into tm_pieces_action ( TM_PIECES_ACTION_ID, ACTION_CODE, ACTION_DESC, ACTION_CODE_DESC, ADDR_VIEW_NO, ADDR_VIEW_CODE, USER_VIEW_NO, USER_VIEW_CODE, IS_ACTIVITY, IS_LOGISTICS, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, UPDATE_USER_CODE, UPDATE_DATE_TIME ) values (#{tmPiecesActionId},#{actionCode},#{actionDesc},#{actionCodeDesc},#{addrViewNo},#{addrViewCode},#{userViewNo},#{userViewCode},#{isActivity},#{isLogistics},#{recordVersion},#{createUserCode},#{createDateTime},#{updateUserCode},#{updateDateTime})")
	public int insertTmPiecesAction(TmPiecesAction tmPiecesAction);

	@UpdateProvider(type=TmPiecesActionSqlProvider.class, method="update")
	public int updateTmPiecesAction(TmPiecesAction tmPiecesAction);
	
	@Delete("delete from tm_pieces_action where tm_pieces_action_id = #{tmPiecesActionId}")
	public int deleteTmPiecesAction(@Param("tmPiecesActionId") int tmPiecesActionId);

    @SelectProvider(type=TmPiecesActionSqlProvider.class, method="selectAllByRecord")
    @ResultType(TmPiecesAction.class)
    public List<TmPiecesAction> selectAllByRecord(TmPiecesAction record);
    
}