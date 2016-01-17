package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class TmSectorHistory extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer tmSectorHistoryId;
    private String sectorCode;
    private String actionCode;
    private String actionPlace;
    private Date actionDateTime;
    private String updatedUserName;
    private Date updatedDateTime;
    private String memo;
    private Integer tmSectorId;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getTmSectorHistoryId() {
        return tmSectorHistoryId;
    }
        
    public void setTmSectorHistoryId(Integer tmSectorHistoryId) {
        this.tmSectorHistoryId = tmSectorHistoryId;
    }
        
    public String getSectorCode() {
        return sectorCode;
    }
        
    public void setSectorCode(String sectorCode) {
        this.sectorCode = sectorCode;
    }
        
    public String getActionCode() {
        return actionCode;
    }
        
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }
        
    public String getActionPlace() {
        return actionPlace;
    }
        
    public void setActionPlace(String actionPlace) {
        this.actionPlace = actionPlace;
    }
        
    public Date getActionDateTime() {
        return actionDateTime;
    }
        
    public void setActionDateTime(Date actionDateTime) {
        this.actionDateTime = actionDateTime;
    }
        
    public String getUpdatedUserName() {
        return updatedUserName;
    }
        
    public void setUpdatedUserName(String updatedUserName) {
        this.updatedUserName = updatedUserName;
    }
        
    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }
        
    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }
        
    public String getMemo() {
        return memo;
    }
        
    public void setMemo(String memo) {
        this.memo = memo;
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