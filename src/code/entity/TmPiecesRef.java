package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class TmPiecesRef extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer tmPiecesRefId;
    private Integer tmPiecesId;
    private String piecesNo;
    private String refType;
    private Integer refId;
    private String refCode;
    private String summary;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getTmPiecesRefId() {
        return tmPiecesRefId;
    }
        
    public void setTmPiecesRefId(Integer tmPiecesRefId) {
        this.tmPiecesRefId = tmPiecesRefId;
    }
        
    public Integer getTmPiecesId() {
        return tmPiecesId;
    }
        
    public void setTmPiecesId(Integer tmPiecesId) {
        this.tmPiecesId = tmPiecesId;
    }
        
    public String getPiecesNo() {
        return piecesNo;
    }
        
    public void setPiecesNo(String piecesNo) {
        this.piecesNo = piecesNo;
    }
        
    public String getRefType() {
        return refType;
    }
        
    public void setRefType(String refType) {
        this.refType = refType;
    }
        
    public Integer getRefId() {
        return refId;
    }
        
    public void setRefId(Integer refId) {
        this.refId = refId;
    }
        
    public String getRefCode() {
        return refCode;
    }
        
    public void setRefCode(String refCode) {
        this.refCode = refCode;
    }
        
    public String getSummary() {
        return summary;
    }
        
    public void setSummary(String summary) {
        this.summary = summary;
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