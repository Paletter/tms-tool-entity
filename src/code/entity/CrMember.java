package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CrMember extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer crMemberId;
    private String memberCode;
    private String email;
    private String fullName;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String countryCode;
    private String stateCode;
    private String cityCode;
    private String localAddress;
    private String postCode;
    private String idcardNo;
    private String phoneNo;
    private String otherContactNo;
    private String qq;
    private String headIcon;
    private String memberName;
    private Integer sex;
    private String isActivate;
    private String tempEmail;
    private String chineseFullName;
    private String cardType;
    private String districtCode;
    private Integer isBindEmail;
    private Integer isBindPhone;
    private Date createTime;
    private Date lastLoginDateTime;
    private String sessionCode;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getCrMemberId() {
        return crMemberId;
    }
        
    public void setCrMemberId(Integer crMemberId) {
        this.crMemberId = crMemberId;
    }
        
    public String getMemberCode() {
        return memberCode;
    }
        
    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }
        
    public String getEmail() {
        return email;
    }
        
    public void setEmail(String email) {
        this.email = email;
    }
        
    public String getFullName() {
        return fullName;
    }
        
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
        
    public String getFirstName() {
        return firstName;
    }
        
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
        
    public String getLastName() {
        return lastName;
    }
        
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
        
    public String getMobileNo() {
        return mobileNo;
    }
        
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
        
    public String getCountryCode() {
        return countryCode;
    }
        
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
        
    public String getStateCode() {
        return stateCode;
    }
        
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
        
    public String getCityCode() {
        return cityCode;
    }
        
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
        
    public String getLocalAddress() {
        return localAddress;
    }
        
    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }
        
    public String getPostCode() {
        return postCode;
    }
        
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
        
    public String getIdcardNo() {
        return idcardNo;
    }
        
    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo;
    }
        
    public String getPhoneNo() {
        return phoneNo;
    }
        
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
        
    public String getOtherContactNo() {
        return otherContactNo;
    }
        
    public void setOtherContactNo(String otherContactNo) {
        this.otherContactNo = otherContactNo;
    }
        
    public String getQq() {
        return qq;
    }
        
    public void setQq(String qq) {
        this.qq = qq;
    }
        
    public String getHeadIcon() {
        return headIcon;
    }
        
    public void setHeadIcon(String headIcon) {
        this.headIcon = headIcon;
    }
        
    public String getMemberName() {
        return memberName;
    }
        
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
        
    public Integer getSex() {
        return sex;
    }
        
    public void setSex(Integer sex) {
        this.sex = sex;
    }
        
    public String getIsActivate() {
        return isActivate;
    }
        
    public void setIsActivate(String isActivate) {
        this.isActivate = isActivate;
    }
        
    public String getTempEmail() {
        return tempEmail;
    }
        
    public void setTempEmail(String tempEmail) {
        this.tempEmail = tempEmail;
    }
        
    public String getChineseFullName() {
        return chineseFullName;
    }
        
    public void setChineseFullName(String chineseFullName) {
        this.chineseFullName = chineseFullName;
    }
        
    public String getCardType() {
        return cardType;
    }
        
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
        
    public String getDistrictCode() {
        return districtCode;
    }
        
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }
        
    public Integer getIsBindEmail() {
        return isBindEmail;
    }
        
    public void setIsBindEmail(Integer isBindEmail) {
        this.isBindEmail = isBindEmail;
    }
        
    public Integer getIsBindPhone() {
        return isBindPhone;
    }
        
    public void setIsBindPhone(Integer isBindPhone) {
        this.isBindPhone = isBindPhone;
    }
        
    public Date getCreateTime() {
        return createTime;
    }
        
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
        
    public Date getLastLoginDateTime() {
        return lastLoginDateTime;
    }
        
    public void setLastLoginDateTime(Date lastLoginDateTime) {
        this.lastLoginDateTime = lastLoginDateTime;
    }
        
    public String getSessionCode() {
        return sessionCode;
    }
        
    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }
        
    public Integer getRecordVersion() {
        return recordVersion;
    }
        
    public void setRecordVersion(Integer recordVersion) {
        this.recordVersion = recordVersion;
    }
        
    public String getCreateUserCode() {
        return createUserCode;
    }
        
    public void setCreateUserCode(String createUserCode) {
        this.createUserCode = createUserCode;
    }
        
    public Date getCreateDateTime() {
        return createDateTime;
    }
        
    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }
        
    public String getCreateTimeZone() {
        return createTimeZone;
    }
        
    public void setCreateTimeZone(String createTimeZone) {
        this.createTimeZone = createTimeZone;
    }
        
    public String getUpdateUserCode() {
        return updateUserCode;
    }
        
    public void setUpdateUserCode(String updateUserCode) {
        this.updateUserCode = updateUserCode;
    }
        
    public Date getUpdateDateTime() {
        return updateDateTime;
    }
        
    public void setUpdateDateTime(Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }
        
    public String getUpdateTimeZone() {
        return updateTimeZone;
    }
        
    public void setUpdateTimeZone(String updateTimeZone) {
        this.updateTimeZone = updateTimeZone;
    }
        
}