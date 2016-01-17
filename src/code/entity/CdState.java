package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CdState extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer cdStateId;
    private String stateCode;
    private String stateName;
    private String stateChineseName;
    private String stateEnglishName;
    private String countryCode;
    private String memo;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getCdStateId() {
        return cdStateId;
    }
        
    public void setCdStateId(Integer cdStateId) {
        this.cdStateId = cdStateId;
    }
        
    public String getStateCode() {
        return stateCode;
    }
        
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
        
    public String getStateName() {
        return stateName;
    }
        
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
        
    public String getStateChineseName() {
        return stateChineseName;
    }
        
    public void setStateChineseName(String stateChineseName) {
        this.stateChineseName = stateChineseName;
    }
        
    public String getStateEnglishName() {
        return stateEnglishName;
    }
        
    public void setStateEnglishName(String stateEnglishName) {
        this.stateEnglishName = stateEnglishName;
    }
        
    public String getCountryCode() {
        return countryCode;
    }
        
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
        
    public String getMemo() {
        return memo;
    }
        
    public void setMemo(String memo) {
        this.memo = memo;
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