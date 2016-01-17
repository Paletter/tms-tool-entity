package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CdCity extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer cdCityId;
    private String cityCode;
    private String cityName;
    private String cityEnglishName;
    private String stateCode;
    private Integer isRemoteArea;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getCdCityId() {
        return cdCityId;
    }
        
    public void setCdCityId(Integer cdCityId) {
        this.cdCityId = cdCityId;
    }
        
    public String getCityCode() {
        return cityCode;
    }
        
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
        
    public String getCityName() {
        return cityName;
    }
        
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
        
    public String getCityEnglishName() {
        return cityEnglishName;
    }
        
    public void setCityEnglishName(String cityEnglishName) {
        this.cityEnglishName = cityEnglishName;
    }
        
    public String getStateCode() {
        return stateCode;
    }
        
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
        
    public Integer getIsRemoteArea() {
        return isRemoteArea;
    }
        
    public void setIsRemoteArea(Integer isRemoteArea) {
        this.isRemoteArea = isRemoteArea;
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