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

import com.palette.busi.project.tms.core.entity.CrMember;
import com.palette.busi.project.tms.core.dao.CrMemberSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CrMemberIntf extends BaseMybatisMapper {


	@Select("SELECT  CR_MEMBER_ID  AS crMemberId, MEMBER_CODE  AS memberCode, EMAIL  AS email, FULL_NAME  AS fullName, FIRST_NAME  AS firstName, LAST_NAME  AS lastName, MOBILE_NO  AS mobileNo, COUNTRY_CODE  AS countryCode, STATE_CODE  AS stateCode, CITY_CODE  AS cityCode, LOCAL_ADDRESS  AS localAddress, POST_CODE  AS postCode, IDCARD_NO  AS idcardNo, PHONE_NO  AS phoneNo, OTHER_CONTACT_NO  AS otherContactNo, QQ  AS qq, HEAD_ICON  AS headIcon, MEMBER_NAME  AS memberName, SEX  AS sex, IS_ACTIVATE  AS isActivate, TEMP_EMAIL  AS tempEmail, CHINESE_FULL_NAME  AS chineseFullName, CARD_TYPE  AS cardType, DISTRICT_CODE  AS districtCode, IS_BIND_EMAIL  AS isBindEmail, IS_BIND_PHONE  AS isBindPhone, CREATE_TIME  AS createTime, LAST_LOGIN_DATE_TIME  AS lastLoginDateTime, SESSION_CODE  AS sessionCode, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cr_member WHERE cr_member_id=#{crMemberId}")
	public CrMember selectCrMemberById(@Param("crMemberId") int crMemberId);
	
	@Select("SELECT  CR_MEMBER_ID  AS crMemberId, MEMBER_CODE  AS memberCode, EMAIL  AS email, FULL_NAME  AS fullName, FIRST_NAME  AS firstName, LAST_NAME  AS lastName, MOBILE_NO  AS mobileNo, COUNTRY_CODE  AS countryCode, STATE_CODE  AS stateCode, CITY_CODE  AS cityCode, LOCAL_ADDRESS  AS localAddress, POST_CODE  AS postCode, IDCARD_NO  AS idcardNo, PHONE_NO  AS phoneNo, OTHER_CONTACT_NO  AS otherContactNo, QQ  AS qq, HEAD_ICON  AS headIcon, MEMBER_NAME  AS memberName, SEX  AS sex, IS_ACTIVATE  AS isActivate, TEMP_EMAIL  AS tempEmail, CHINESE_FULL_NAME  AS chineseFullName, CARD_TYPE  AS cardType, DISTRICT_CODE  AS districtCode, IS_BIND_EMAIL  AS isBindEmail, IS_BIND_PHONE  AS isBindPhone, CREATE_TIME  AS createTime, LAST_LOGIN_DATE_TIME  AS lastLoginDateTime, SESSION_CODE  AS sessionCode, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cr_member")
	public List<CrMember> selectAllCrMember();
	
	@Insert("insert into cr_member ( CR_MEMBER_ID, MEMBER_CODE, EMAIL, FULL_NAME, FIRST_NAME, LAST_NAME, MOBILE_NO, COUNTRY_CODE, STATE_CODE, CITY_CODE, LOCAL_ADDRESS, POST_CODE, IDCARD_NO, PHONE_NO, OTHER_CONTACT_NO, QQ, HEAD_ICON, MEMBER_NAME, SEX, IS_ACTIVATE, TEMP_EMAIL, CHINESE_FULL_NAME, CARD_TYPE, DISTRICT_CODE, IS_BIND_EMAIL, IS_BIND_PHONE, CREATE_TIME, LAST_LOGIN_DATE_TIME, SESSION_CODE, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{crMemberId},#{memberCode},#{email},#{fullName},#{firstName},#{lastName},#{mobileNo},#{countryCode},#{stateCode},#{cityCode},#{localAddress},#{postCode},#{idcardNo},#{phoneNo},#{otherContactNo},#{qq},#{headIcon},#{memberName},#{sex},#{isActivate},#{tempEmail},#{chineseFullName},#{cardType},#{districtCode},#{isBindEmail},#{isBindPhone},#{createTime},#{lastLoginDateTime},#{sessionCode},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCrMember(CrMember crMember);

	@UpdateProvider(type=CrMemberSqlProvider.class, method="update")
	public int updateCrMember(CrMember crMember);
	
	@Delete("delete from cr_member where cr_member_id = #{crMemberId}")
	public int deleteCrMember(@Param("crMemberId") int crMemberId);

    @SelectProvider(type=CrMemberSqlProvider.class, method="selectAllByRecord")
    @ResultType(CrMember.class)
    public List<CrMember> selectAllByRecord(CrMember record);
    
}