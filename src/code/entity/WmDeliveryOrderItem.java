package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class WmDeliveryOrderItem extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer wmDeliveryOrderItemId;
    private Integer wmDeliveryOrderId;
    private String piecesNo;
    private String consignmentNo;
    private String status;
    private Date createDateTime;
    private String createUserCode;
    private Date updateDateTime;
    private String updateUserCode;
    
    public Integer getWmDeliveryOrderItemId() {
        return wmDeliveryOrderItemId;
    }
        
    public void setWmDeliveryOrderItemId(Integer wmDeliveryOrderItemId) {
        this.wmDeliveryOrderItemId = wmDeliveryOrderItemId;
    }
        
    public Integer getWmDeliveryOrderId() {
        return wmDeliveryOrderId;
    }
        
    public void setWmDeliveryOrderId(Integer wmDeliveryOrderId) {
        this.wmDeliveryOrderId = wmDeliveryOrderId;
    }
        
    public String getPiecesNo() {
        return piecesNo;
    }
        
    public void setPiecesNo(String piecesNo) {
        this.piecesNo = piecesNo;
    }
        
    public String getConsignmentNo() {
        return consignmentNo;
    }
        
    public void setConsignmentNo(String consignmentNo) {
        this.consignmentNo = consignmentNo;
    }
        
    public String getStatus() {
        return status;
    }
        
    public void setStatus(String status) {
        this.status = status;
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