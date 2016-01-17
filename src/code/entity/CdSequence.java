package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CdSequence extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer cdSequenceId;
    private Integer fixedLength;
    private String typeCode;
    private String prefix;
    private String suffix;
    private Integer incrementBy;
    private String dateFormat;
    private Integer curval;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getCdSequenceId() {
        return cdSequenceId;
    }
        
    public void setCdSequenceId(Integer cdSequenceId) {
        this.cdSequenceId = cdSequenceId;
    }
        
    public Integer getFixedLength() {
        return fixedLength;
    }
        
    public void setFixedLength(Integer fixedLength) {
        this.fixedLength = fixedLength;
    }
        
    public String getTypeCode() {
        return typeCode;
    }
        
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
        
    public String getPrefix() {
        return prefix;
    }
        
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
        
    public String getSuffix() {
        return suffix;
    }
        
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
        
    public Integer getIncrementBy() {
        return incrementBy;
    }
        
    public void setIncrementBy(Integer incrementBy) {
        this.incrementBy = incrementBy;
    }
        
    public String getDateFormat() {
        return dateFormat;
    }
        
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }
        
    public Integer getCurval() {
        return curval;
    }
        
    public void setCurval(Integer curval) {
        this.curval = curval;
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