package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CdDelivery extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer cdDeliveryId;
    private String deliveryName;
    private String deliveryCode;
    private Integer deliveryOrder;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getCdDeliveryId() {
        return cdDeliveryId;
    }
        
    public void setCdDeliveryId(Integer cdDeliveryId) {
        this.cdDeliveryId = cdDeliveryId;
    }
        
    public String getDeliveryName() {
        return deliveryName;
    }
        
    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }
        
    public String getDeliveryCode() {
        return deliveryCode;
    }
        
    public void setDeliveryCode(String deliveryCode) {
        this.deliveryCode = deliveryCode;
    }
        
    public Integer getDeliveryOrder() {
        return deliveryOrder;
    }
        
    public void setDeliveryOrder(Integer deliveryOrder) {
        this.deliveryOrder = deliveryOrder;
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