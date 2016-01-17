package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CdServiceProduct extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer cdServiceProductId;
    private String serviceProductCode;
    private String serviceProductName;
    private String serviceProductDesc;
    private String serviceProductCountryCode;
    private String serviceProductWarehouseCode;
    private String serviceType;
    private Integer isActive;
    private Integer isDefault;
    private Integer isNeedIdcontent;
    private Integer isFreeTax;
    private Integer isUseCoupon;
    private Integer feeWeight;
    private Integer isAutoDisassemble;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getCdServiceProductId() {
        return cdServiceProductId;
    }
        
    public void setCdServiceProductId(Integer cdServiceProductId) {
        this.cdServiceProductId = cdServiceProductId;
    }
        
    public String getServiceProductCode() {
        return serviceProductCode;
    }
        
    public void setServiceProductCode(String serviceProductCode) {
        this.serviceProductCode = serviceProductCode;
    }
        
    public String getServiceProductName() {
        return serviceProductName;
    }
        
    public void setServiceProductName(String serviceProductName) {
        this.serviceProductName = serviceProductName;
    }
        
    public String getServiceProductDesc() {
        return serviceProductDesc;
    }
        
    public void setServiceProductDesc(String serviceProductDesc) {
        this.serviceProductDesc = serviceProductDesc;
    }
        
    public String getServiceProductCountryCode() {
        return serviceProductCountryCode;
    }
        
    public void setServiceProductCountryCode(String serviceProductCountryCode) {
        this.serviceProductCountryCode = serviceProductCountryCode;
    }
        
    public String getServiceProductWarehouseCode() {
        return serviceProductWarehouseCode;
    }
        
    public void setServiceProductWarehouseCode(String serviceProductWarehouseCode) {
        this.serviceProductWarehouseCode = serviceProductWarehouseCode;
    }
        
    public String getServiceType() {
        return serviceType;
    }
        
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
        
    public Integer getIsActive() {
        return isActive;
    }
        
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
        
    public Integer getIsDefault() {
        return isDefault;
    }
        
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }
        
    public Integer getIsNeedIdcontent() {
        return isNeedIdcontent;
    }
        
    public void setIsNeedIdcontent(Integer isNeedIdcontent) {
        this.isNeedIdcontent = isNeedIdcontent;
    }
        
    public Integer getIsFreeTax() {
        return isFreeTax;
    }
        
    public void setIsFreeTax(Integer isFreeTax) {
        this.isFreeTax = isFreeTax;
    }
        
    public Integer getIsUseCoupon() {
        return isUseCoupon;
    }
        
    public void setIsUseCoupon(Integer isUseCoupon) {
        this.isUseCoupon = isUseCoupon;
    }
        
    public Integer getFeeWeight() {
        return feeWeight;
    }
        
    public void setFeeWeight(Integer feeWeight) {
        this.feeWeight = feeWeight;
    }
        
    public Integer getIsAutoDisassemble() {
        return isAutoDisassemble;
    }
        
    public void setIsAutoDisassemble(Integer isAutoDisassemble) {
        this.isAutoDisassemble = isAutoDisassemble;
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