package com.palette.busi.project.tms.core.dao;

import java.util.List;
import java.math.BigDecimal;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.palette.busi.project.tms.core.entity.CrMember;
import com.palette.busi.project.tms.core.base.BaseSqlProvider;

public class CrMemberSqlProvider extends BaseSqlProvider {

	public String update(CrMember record) {
		BEGIN();
        UPDATE("cr_member");
        if (record.getCrMemberId() != null) {
            SET("CR_MEMBER_ID = #{crMemberId}");
        }
        if (record.getMemberCode() != null) {
            SET("MEMBER_CODE = #{memberCode}");
        }
        if (record.getEmail() != null) {
            SET("EMAIL = #{email}");
        }
        if (record.getFullName() != null) {
            SET("FULL_NAME = #{fullName}");
        }
        if (record.getFirstName() != null) {
            SET("FIRST_NAME = #{firstName}");
        }
        if (record.getLastName() != null) {
            SET("LAST_NAME = #{lastName}");
        }
        if (record.getMobileNo() != null) {
            SET("MOBILE_NO = #{mobileNo}");
        }
        if (record.getCountryCode() != null) {
            SET("COUNTRY_CODE = #{countryCode}");
        }
        if (record.getStateCode() != null) {
            SET("STATE_CODE = #{stateCode}");
        }
        if (record.getCityCode() != null) {
            SET("CITY_CODE = #{cityCode}");
        }
        if (record.getLocalAddress() != null) {
            SET("LOCAL_ADDRESS = #{localAddress}");
        }
        if (record.getPostCode() != null) {
            SET("POST_CODE = #{postCode}");
        }
        if (record.getIdcardNo() != null) {
            SET("IDCARD_NO = #{idcardNo}");
        }
        if (record.getPhoneNo() != null) {
            SET("PHONE_NO = #{phoneNo}");
        }
        if (record.getOtherContactNo() != null) {
            SET("OTHER_CONTACT_NO = #{otherContactNo}");
        }
        if (record.getQq() != null) {
            SET("QQ = #{qq}");
        }
        if (record.getHeadIcon() != null) {
            SET("HEAD_ICON = #{headIcon}");
        }
        if (record.getMemberName() != null) {
            SET("MEMBER_NAME = #{memberName}");
        }
        if (record.getSex() != null) {
            SET("SEX = #{sex}");
        }
        if (record.getIsActivate() != null) {
            SET("IS_ACTIVATE = #{isActivate}");
        }
        if (record.getTempEmail() != null) {
            SET("TEMP_EMAIL = #{tempEmail}");
        }
        if (record.getChineseFullName() != null) {
            SET("CHINESE_FULL_NAME = #{chineseFullName}");
        }
        if (record.getCardType() != null) {
            SET("CARD_TYPE = #{cardType}");
        }
        if (record.getDistrictCode() != null) {
            SET("DISTRICT_CODE = #{districtCode}");
        }
        if (record.getIsBindEmail() != null) {
            SET("IS_BIND_EMAIL = #{isBindEmail}");
        }
        if (record.getIsBindPhone() != null) {
            SET("IS_BIND_PHONE = #{isBindPhone}");
        }
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{createTime}");
        }
        if (record.getLastLoginDateTime() != null) {
            SET("LAST_LOGIN_DATE_TIME = #{lastLoginDateTime}");
        }
        if (record.getSessionCode() != null) {
            SET("SESSION_CODE = #{sessionCode}");
        }
        if (record.getRecordVersion() != null) {
            SET("RECORD_VERSION = #{recordVersion}");
        }
        if (record.getCreateUserCode() != null) {
            SET("CREATE_USER_CODE = #{createUserCode}");
        }
        if (record.getCreateDateTime() != null) {
            SET("CREATE_DATE_TIME = #{createDateTime}");
        }
        if (record.getCreateTimeZone() != null) {
            SET("CREATE_TIME_ZONE = #{createTimeZone}");
        }
        if (record.getUpdateUserCode() != null) {
            SET("UPDATE_USER_CODE = #{updateUserCode}");
        }
        if (record.getUpdateDateTime() != null) {
            SET("UPDATE_DATE_TIME = #{updateDateTime}");
        }
        if (record.getUpdateTimeZone() != null) {
            SET("UPDATE_TIME_ZONE = #{updateTimeZone}");
        }

        WHERE("cr_member_id = #{crMemberId}");

        return SQL();
	}

    public String selectAllByRecord(CrMember record) {
        BEGIN();
        SELECT("*");
        FROM("cr_member");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" 1=1 ");
        if (record.getCrMemberId() != null) {
            stringBuffer.append(" AND CR_MEMBER_ID = #{crMemberId}");
        }
        if (record.getMemberCode() != null) {
            stringBuffer.append(" AND MEMBER_CODE = #{memberCode}");
        }
        if (record.getEmail() != null) {
            stringBuffer.append(" AND EMAIL = #{email}");
        }
        if (record.getFullName() != null) {
            stringBuffer.append(" AND FULL_NAME = #{fullName}");
        }
        if (record.getFirstName() != null) {
            stringBuffer.append(" AND FIRST_NAME = #{firstName}");
        }
        if (record.getLastName() != null) {
            stringBuffer.append(" AND LAST_NAME = #{lastName}");
        }
        if (record.getMobileNo() != null) {
            stringBuffer.append(" AND MOBILE_NO = #{mobileNo}");
        }
        if (record.getCountryCode() != null) {
            stringBuffer.append(" AND COUNTRY_CODE = #{countryCode}");
        }
        if (record.getStateCode() != null) {
            stringBuffer.append(" AND STATE_CODE = #{stateCode}");
        }
        if (record.getCityCode() != null) {
            stringBuffer.append(" AND CITY_CODE = #{cityCode}");
        }
        if (record.getLocalAddress() != null) {
            stringBuffer.append(" AND LOCAL_ADDRESS = #{localAddress}");
        }
        if (record.getPostCode() != null) {
            stringBuffer.append(" AND POST_CODE = #{postCode}");
        }
        if (record.getIdcardNo() != null) {
            stringBuffer.append(" AND IDCARD_NO = #{idcardNo}");
        }
        if (record.getPhoneNo() != null) {
            stringBuffer.append(" AND PHONE_NO = #{phoneNo}");
        }
        if (record.getOtherContactNo() != null) {
            stringBuffer.append(" AND OTHER_CONTACT_NO = #{otherContactNo}");
        }
        if (record.getQq() != null) {
            stringBuffer.append(" AND QQ = #{qq}");
        }
        if (record.getHeadIcon() != null) {
            stringBuffer.append(" AND HEAD_ICON = #{headIcon}");
        }
        if (record.getMemberName() != null) {
            stringBuffer.append(" AND MEMBER_NAME = #{memberName}");
        }
        if (record.getSex() != null) {
            stringBuffer.append(" AND SEX = #{sex}");
        }
        if (record.getIsActivate() != null) {
            stringBuffer.append(" AND IS_ACTIVATE = #{isActivate}");
        }
        if (record.getTempEmail() != null) {
            stringBuffer.append(" AND TEMP_EMAIL = #{tempEmail}");
        }
        if (record.getChineseFullName() != null) {
            stringBuffer.append(" AND CHINESE_FULL_NAME = #{chineseFullName}");
        }
        if (record.getCardType() != null) {
            stringBuffer.append(" AND CARD_TYPE = #{cardType}");
        }
        if (record.getDistrictCode() != null) {
            stringBuffer.append(" AND DISTRICT_CODE = #{districtCode}");
        }
        if (record.getIsBindEmail() != null) {
            stringBuffer.append(" AND IS_BIND_EMAIL = #{isBindEmail}");
        }
        if (record.getIsBindPhone() != null) {
            stringBuffer.append(" AND IS_BIND_PHONE = #{isBindPhone}");
        }
        if (record.getCreateTime() != null) {
            stringBuffer.append(" AND CREATE_TIME = #{createTime}");
        }
        if (record.getLastLoginDateTime() != null) {
            stringBuffer.append(" AND LAST_LOGIN_DATE_TIME = #{lastLoginDateTime}");
        }
        if (record.getSessionCode() != null) {
            stringBuffer.append(" AND SESSION_CODE = #{sessionCode}");
        }
        if (record.getRecordVersion() != null) {
            stringBuffer.append(" AND RECORD_VERSION = #{recordVersion}");
        }
        if (record.getCreateUserCode() != null) {
            stringBuffer.append(" AND CREATE_USER_CODE = #{createUserCode}");
        }
        if (record.getCreateDateTime() != null) {
            stringBuffer.append(" AND CREATE_DATE_TIME = #{createDateTime}");
        }
        if (record.getCreateTimeZone() != null) {
            stringBuffer.append(" AND CREATE_TIME_ZONE = #{createTimeZone}");
        }
        if (record.getUpdateUserCode() != null) {
            stringBuffer.append(" AND UPDATE_USER_CODE = #{updateUserCode}");
        }
        if (record.getUpdateDateTime() != null) {
            stringBuffer.append(" AND UPDATE_DATE_TIME = #{updateDateTime}");
        }
        if (record.getUpdateTimeZone() != null) {
            stringBuffer.append(" AND UPDATE_TIME_ZONE = #{updateTimeZone}");
        }

        WHERE(stringBuffer.toString());

        return SQL();
    }
}
