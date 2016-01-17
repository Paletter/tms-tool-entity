package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CdCountryRef extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer cdCountryRefId;
    private String weightUnit;
    private String volumeUnit;
    private String measureUnit;
    private String currency;
    private String currencySymbol;
    private String language;
    private BigDecimal volumeWeightBase;
    private BigDecimal convertToKg;
    private Integer cdCountryId;
    private String countryCode;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getCdCountryRefId() {
        return cdCountryRefId;
    }
        
    public void setCdCountryRefId(Integer cdCountryRefId) {
        this.cdCountryRefId = cdCountryRefId;
    }
        
    public String getWeightUnit() {
        return weightUnit;
    }
        
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }
        
    public String getVolumeUnit() {
        return volumeUnit;
    }
        
    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }
        
    public String getMeasureUnit() {
        return measureUnit;
    }
        
    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }
        
    public String getCurrency() {
        return currency;
    }
        
    public void setCurrency(String currency) {
        this.currency = currency;
    }
        
    public String getCurrencySymbol() {
        return currencySymbol;
    }
        
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }
        
    public String getLanguage() {
        return language;
    }
        
    public void setLanguage(String language) {
        this.language = language;
    }
        
    public BigDecimal getVolumeWeightBase() {
        return volumeWeightBase;
    }
        
    public void setVolumeWeightBase(BigDecimal volumeWeightBase) {
        this.volumeWeightBase = volumeWeightBase;
    }
        
    public BigDecimal getConvertToKg() {
        return convertToKg;
    }
        
    public void setConvertToKg(BigDecimal convertToKg) {
        this.convertToKg = convertToKg;
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