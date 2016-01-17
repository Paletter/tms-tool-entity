package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class WmDeliveryOrder extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer wmDeliveryOrderId;
    private String deliveryOrderNo;
    private Date deliveryDate;
    private String countryCode;
    private String warehouseCode;
    private String serviceProductCode;
    private String sectorCode;
    private String mawbCode;
    private String type;
    private String status;
    private Date createDateTime;
    private String createUserCode;
    private Date updateDateTime;
    private String updateUserCode;
    
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
        
    public Date getDeliveryDate() {
        return deliveryDate;
    }
        
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
        
    public String getCountryCode() {
        return countryCode;
    }
        
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
        
    public String getWarehouseCode() {
        return warehouseCode;
    }
        
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }
        
    public String getServiceProductCode() {
        return serviceProductCode;
    }
        
    public void setServiceProductCode(String serviceProductCode) {
        this.serviceProductCode = serviceProductCode;
    }
        
    public String getSectorCode() {
        return sectorCode;
    }
        
    public void setSectorCode(String sectorCode) {
        this.sectorCode = sectorCode;
    }
        
    public String getMawbCode() {
        return mawbCode;
    }
        
    public void setMawbCode(String mawbCode) {
        this.mawbCode = mawbCode;
    }
        
    public String getType() {
        return type;
    }
        
    public void setType(String type) {
        this.type = type;
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