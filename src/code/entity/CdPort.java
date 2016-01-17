package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CdPort extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer cdPortId;
    private String portCode;
    private String portName;
    private String portEnglishName;
    private String cityCode;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getCdPortId() {
        return cdPortId;
    }
        
    public void setCdPortId(Integer cdPortId) {
        this.cdPortId = cdPortId;
    }
        
    public String getPortCode() {
        return portCode;
    }
        
    public void setPortCode(String portCode) {
        this.portCode = portCode;
    }
        
    public String getPortName() {
        return portName;
    }
        
    public void setPortName(String portName) {
        this.portName = portName;
    }
        
    public String getPortEnglishName() {
        return portEnglishName;
    }
        
    public void setPortEnglishName(String portEnglishName) {
        this.portEnglishName = portEnglishName;
    }
        
    public String getCityCode() {
        return cityCode;
    }
        
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
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