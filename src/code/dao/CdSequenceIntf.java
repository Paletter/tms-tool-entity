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

import com.palette.busi.project.tms.core.entity.CdSequence;
import com.palette.busi.project.tms.core.dao.CdSequenceSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdSequenceIntf extends BaseMybatisMapper {


	@Select("SELECT  cd_sequence_id  AS cdSequenceId, fixed_length  AS fixedLength, type_code  AS typeCode, prefix  AS prefix, suffix  AS suffix, increment_by  AS incrementBy, DATE_FORMAT  AS dateFormat, curval  AS curval, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_sequence WHERE cd_sequence_id=#{cdSequenceId}")
	public CdSequence selectCdSequenceById(@Param("cdSequenceId") int cdSequenceId);
	
	@Select("SELECT  cd_sequence_id  AS cdSequenceId, fixed_length  AS fixedLength, type_code  AS typeCode, prefix  AS prefix, suffix  AS suffix, increment_by  AS incrementBy, DATE_FORMAT  AS dateFormat, curval  AS curval, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_sequence")
	public List<CdSequence> selectAllCdSequence();
	
	@Insert("insert into cd_sequence ( cd_sequence_id, fixed_length, type_code, prefix, suffix, increment_by, DATE_FORMAT, curval, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdSequenceId},#{fixedLength},#{typeCode},#{prefix},#{suffix},#{incrementBy},#{dateFormat},#{curval},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdSequence(CdSequence cdSequence);

	@UpdateProvider(type=CdSequenceSqlProvider.class, method="update")
	public int updateCdSequence(CdSequence cdSequence);
	
	@Delete("delete from cd_sequence where cd_sequence_id = #{cdSequenceId}")
	public int deleteCdSequence(@Param("cdSequenceId") int cdSequenceId);

    @SelectProvider(type=CdSequenceSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdSequence.class)
    public List<CdSequence> selectAllByRecord(CdSequence record);
    
}