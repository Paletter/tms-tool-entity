package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CdDistrict extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer cdDistrictId;
    private String districtCode;
    private String districtName;
    private String districtEnglishName;
    private String cityCode;
    private Integer isRemoteArea;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getCdDistrictId() {
        return cdDistrictId;
    }
        
    public void setCdDistrictId(Integer cdDistrictId) {
        this.cdDistrictId = cdDistrictId;
    }
        
    public String getDistrictCode() {
        return districtCode;
    }
        
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }
        
    public String getDistrictName() {
        return districtName;
    }
        
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
        
    public String getDistrictEnglishName() {
        return districtEnglishName;
    }
        
    public void setDistrictEnglishName(String districtEnglishName) {
        this.districtEnglishName = districtEnglishName;
    }
        
    public String getCityCode() {
        return cityCode;
    }
        
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
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