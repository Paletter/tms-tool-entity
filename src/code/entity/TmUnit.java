package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class TmUnit extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer tmUnitId;
    private String unitLabel;
    private String unitNo;
    private String unitType;
    private String origPort;
    private String destPort;
    private Date etd;
    private Date eta;
    private String sealNumber;
    private String valueType;
    private String sectorCode;
    private Integer tmSectorId;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getTmUnitId() {
        return tmUnitId;
    }
        
    public void setTmUnitId(Integer tmUnitId) {
        this.tmUnitId = tmUnitId;
    }
        
    public String getUnitLabel() {
        return unitLabel;
    }
        
    public void setUnitLabel(String unitLabel) {
        this.unitLabel = unitLabel;
    }
        
    public String getUnitNo() {
        return unitNo;
    }
        
    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }
        
    public String getUnitType() {
        return unitType;
    }
        
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }
        
    public String getOrigPort() {
        return origPort;
    }
        
    public void setOrigPort(String origPort) {
        this.origPort = origPort;
    }
        
    public String getDestPort() {
        return destPort;
    }
        
    public void setDestPort(String destPort) {
        this.destPort = destPort;
    }
        
    public Date getEtd() {
        return etd;
    }
        
    public void setEtd(Date etd) {
        this.etd = etd;
    }
        
    public Date getEta() {
        return eta;
    }
        
    public void setEta(Date eta) {
        this.eta = eta;
    }
        
    public String getSealNumber() {
        return sealNumber;
    }
        
    public void setSealNumber(String sealNumber) {
        this.sealNumber = sealNumber;
    }
        
    public String getValueType() {
        return valueType;
    }
        
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }
        
    public String getSectorCode() {
        return sectorCode;
    }
        
    public void setSectorCode(String sectorCode) {
        this.sectorCode = sectorCode;
    }
        
    public Integer getTmSectorId() {
        return tmSectorId;
    }
        
    public void setTmSectorId(Integer tmSectorId) {
        this.tmSectorId = tmSectorId;
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