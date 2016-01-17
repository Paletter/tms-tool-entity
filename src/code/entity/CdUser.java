package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CdUser extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer cdUserId;
    private String userName;
    private String firstName;
    private String lastName;
    private String fullName;
    private String gender;
    private String memo;
    private Integer cdDeptId;
    private String warehouseCode;
    private Integer cdCountryId;
    private String countryCode;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getCdUserId() {
        return cdUserId;
    }
        
    public void setCdUserId(Integer cdUserId) {
        this.cdUserId = cdUserId;
    }
        
    public String getUserName() {
        return userName;
    }
        
    public void setUserName(String userName) {
        this.userName = userName;
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
        
    public String getFullName() {
        return fullName;
    }
        
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
        
    public String getGender() {
        return gender;
    }
        
    public void setGender(String gender) {
        this.gender = gender;
    }
        
    public String getMemo() {
        return memo;
    }
        
    public void setMemo(String memo) {
        this.memo = memo;
    }
        
    public Integer getCdDeptId() {
        return cdDeptId;
    }
        
    public void setCdDeptId(Integer cdDeptId) {
        this.cdDeptId = cdDeptId;
    }
        
    public String getWarehouseCode() {
        return warehouseCode;
    }
        
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }
        
    public Integer getCdCountryId() {
        return cdCountryId;
    }
        
    public void setCdCountryId(Integer cdCountryId) {
        this.cdCountryId = cdCountryId;
    }
        
    public String getCountryCode() {
        return countryCode;
    }
        
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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