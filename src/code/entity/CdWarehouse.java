package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CdWarehouse extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer cdWarehouseId;
    private String warehouseCode;
    private String warehouseDesc;
    private String countryCode;
    private String stateCode;
    private String cityCode;
    private String street;
    private String postCode;
    private String memo;
    private Integer isActive;
    private String defaultServiceProductCode;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getCdWarehouseId() {
        return cdWarehouseId;
    }
        
    public void setCdWarehouseId(Integer cdWarehouseId) {
        this.cdWarehouseId = cdWarehouseId;
    }
        
    public String getWarehouseCode() {
        return warehouseCode;
    }
        
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }
        
    public String getWarehouseDesc() {
        return warehouseDesc;
    }
        
    public void setWarehouseDesc(String warehouseDesc) {
        this.warehouseDesc = warehouseDesc;
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
        
    public String getStreet() {
        return street;
    }
        
    public void setStreet(String street) {
        this.street = street;
    }
        
    public String getPostCode() {
        return postCode;
    }
        
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
        
    public String getMemo() {
        return memo;
    }
        
    public void setMemo(String memo) {
        this.memo = memo;
    }
        
    public Integer getIsActive() {
        return isActive;
    }
        
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
        
    public String getDefaultServiceProductCode() {
        return defaultServiceProductCode;
    }
        
    public void setDefaultServiceProductCode(String defaultServiceProductCode) {
        this.defaultServiceProductCode = defaultServiceProductCode;
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