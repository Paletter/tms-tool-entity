package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class TrDataSyncBusi extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer trDataSyncBusiId;
    private String targetId;
    private String keyId;
    private Integer syncCode;
    private String syncData;
    private String msgFrom;
    private String msgTo;
    private Integer syncStatus;
    private Date createTime;
    private Date sendTime;
    private Date arriveTime;
    private Integer failNumber;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getTrDataSyncBusiId() {
        return trDataSyncBusiId;
    }
        
    public void setTrDataSyncBusiId(Integer trDataSyncBusiId) {
        this.trDataSyncBusiId = trDataSyncBusiId;
    }
        
    public String getTargetId() {
        return targetId;
    }
        
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }
        
    public String getKeyId() {
        return keyId;
    }
        
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
        
    public Integer getSyncCode() {
        return syncCode;
    }
        
    public void setSyncCode(Integer syncCode) {
        this.syncCode = syncCode;
    }
        
    public String getSyncData() {
        return syncData;
    }
        
    public void setSyncData(String syncData) {
        this.syncData = syncData;
    }
        
    public String getMsgFrom() {
        return msgFrom;
    }
        
    public void setMsgFrom(String msgFrom) {
        this.msgFrom = msgFrom;
    }
        
    public String getMsgTo() {
        return msgTo;
    }
        
    public void setMsgTo(String msgTo) {
        this.msgTo = msgTo;
    }
        
    public Integer getSyncStatus() {
        return syncStatus;
    }
        
    public void setSyncStatus(Integer syncStatus) {
        this.syncStatus = syncStatus;
    }
        
    public Date getCreateTime() {
        return createTime;
    }
        
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
        
    public Date getSendTime() {
        return sendTime;
    }
        
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
        
    public Date getArriveTime() {
        return arriveTime;
    }
        
    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }
        
    public Integer getFailNumber() {
        return failNumber;
    }
        
    public void setFailNumber(Integer failNumber) {
        this.failNumber = failNumber;
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