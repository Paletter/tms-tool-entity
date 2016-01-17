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

import com.palette.busi.project.tms.core.entity.WmTransitPiecesRecord;
import com.palette.busi.project.tms.core.dao.WmTransitPiecesRecordSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface WmTransitPiecesRecordIntf extends BaseMybatisMapper {


	@Select("SELECT  WM_TRANSIT_PIECES_RECORD_ID  AS wmTransitPiecesRecordId, LOGISTICS_NO  AS logisticsNo, CONSIGNMENT_NO  AS consignmentNo, CREATE_TIME  AS createTime, CREATE_USER  AS createUser, CREATE_DATE_TIME  AS createDateTime, CREATE_USER_CODE  AS createUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_USER_CODE  AS updateUserCode FROM wm_transit_pieces_record WHERE wm_transit_pieces_record_id=#{wmTransitPiecesRecordId}")
	public WmTransitPiecesRecord selectWmTransitPiecesRecordById(@Param("wmTransitPiecesRecordId") int wmTransitPiecesRecordId);
	
	@Select("SELECT  WM_TRANSIT_PIECES_RECORD_ID  AS wmTransitPiecesRecordId, LOGISTICS_NO  AS logisticsNo, CONSIGNMENT_NO  AS consignmentNo, CREATE_TIME  AS createTime, CREATE_USER  AS createUser, CREATE_DATE_TIME  AS createDateTime, CREATE_USER_CODE  AS createUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_USER_CODE  AS updateUserCode FROM wm_transit_pieces_record")
	public List<WmTransitPiecesRecord> selectAllWmTransitPiecesRecord();
	
	@Insert("insert into wm_transit_pieces_record ( WM_TRANSIT_PIECES_RECORD_ID, LOGISTICS_NO, CONSIGNMENT_NO, CREATE_TIME, CREATE_USER, CREATE_DATE_TIME, CREATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_USER_CODE ) values (#{wmTransitPiecesRecordId},#{logisticsNo},#{consignmentNo},#{createTime},#{createUser},#{createDateTime},#{createUserCode},#{updateDateTime},#{updateUserCode})")
	public int insertWmTransitPiecesRecord(WmTransitPiecesRecord wmTransitPiecesRecord);

	@UpdateProvider(type=WmTransitPiecesRecordSqlProvider.class, method="update")
	public int updateWmTransitPiecesRecord(WmTransitPiecesRecord wmTransitPiecesRecord);
	
	@Delete("delete from wm_transit_pieces_record where wm_transit_pieces_record_id = #{wmTransitPiecesRecordId}")
	public int deleteWmTransitPiecesRecord(@Param("wmTransitPiecesRecordId") int wmTransitPiecesRecordId);

    @SelectProvider(type=WmTransitPiecesRecordSqlProvider.class, method="selectAllByRecord")
    @ResultType(WmTransitPiecesRecord.class)
    public List<WmTransitPiecesRecord> selectAllByRecord(WmTransitPiecesRecord record);
    
}