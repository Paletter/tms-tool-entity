package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class WmDeliveryOrderRef extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer wmDeliveryOrderRefId;
    private Integer wmDeliveryOrderId;
    private String deliveryOrderNo;
    private String refType;
    private Integer refId;
    private String refCode;
    private Date createDateTime;
    private String createUserCode;
    private Date updateDateTime;
    private String updateUserCode;
    
    public Integer getWmDeliveryOrderRefId() {
        return wmDeliveryOrderRefId;
    }
        
    public void setWmDeliveryOrderRefId(Integer wmDeliveryOrderRefId) {
        this.wmDeliveryOrderRefId = wmDeliveryOrderRefId;
    }
        
    public Integer getWmDeliveryOrderId() {
        return wmDeliveryOrderId;
    }
        
    public void setWmDeliveryOrderId(Integer wmDeliveryOrderId) {
        this.wmDeliveryOrderId = wmDeliveryOrderId;
    }
        
    public String getDeliveryOrderNo() {
        return deliveryOrderNo;
    }
        
    public void setDeliveryOrderNo(String deliveryOrderNo) {
        this.deliveryOrderNo = deliveryOrderNo;
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
        
    public Date getCreateDateTime() {
        return createDateTime;
    }
        
    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }
        
    public String getCreateUserCode() {
        return createUserCode;
    }
        
    public void setCreateUserCode(String createUserCode) {
        this.createUserCode = createUserCode;
    }
        
    public Date getUpdateDateTime() {
        return updateDateTime;
    }
        
    public void setUpdateDateTime(Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }
        
    public String getUpdateUserCode() {
        return updateUserCode;
    }
        
    public void setUpdateUserCode(String updateUserCode) {
        this.updateUserCode = updateUserCode;
    }
        
}