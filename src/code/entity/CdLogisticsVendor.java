package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CdLogisticsVendor extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer cdLogisticsVendorId;
    private String logisticsVendorCode;
    private String logisticsVendorName;
    private String countryCode;
    private Integer isActive;
    private Integer seq;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getCdLogisticsVendorId() {
        return cdLogisticsVendorId;
    }
        
    public void setCdLogisticsVendorId(Integer cdLogisticsVendorId) {
        this.cdLogisticsVendorId = cdLogisticsVendorId;
    }
        
    public String getLogisticsVendorCode() {
        return logisticsVendorCode;
    }
        
    public void setLogisticsVendorCode(String logisticsVendorCode) {
        this.logisticsVendorCode = logisticsVendorCode;
    }
        
    public String getLogisticsVendorName() {
        return logisticsVendorName;
    }
        
    public void setLogisticsVendorName(String logisticsVendorName) {
        this.logisticsVendorName = logisticsVendorName;
    }
        
    public String getCountryCode() {
        return countryCode;
    }
        
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
        
    public Integer getIsActive() {
        return isActive;
    }
        
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
        
    public Integer getSeq() {
        return seq;
    }
        
    public void setSeq(Integer seq) {
        this.seq = seq;
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