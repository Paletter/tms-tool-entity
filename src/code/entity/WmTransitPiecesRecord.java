package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class WmTransitPiecesRecord extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer wmTransitPiecesRecordId;
    private String logisticsNo;
    private String consignmentNo;
    private Date createTime;
    private String createUser;
    private Date createDateTime;
    private String createUserCode;
    private Date updateDateTime;
    private String updateUserCode;
    
    public Integer getWmTransitPiecesRecordId() {
        return wmTransitPiecesRecordId;
    }
        
    public void setWmTransitPiecesRecordId(Integer wmTransitPiecesRecordId) {
        this.wmTransitPiecesRecordId = wmTransitPiecesRecordId;
    }
        
    public String getLogisticsNo() {
        return logisticsNo;
    }
        
    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }
        
    public String getConsignmentNo() {
        return consignmentNo;
    }
        
    public void setConsignmentNo(String consignmentNo) {
        this.consignmentNo = consignmentNo;
    }
        
    public Date getCreateTime() {
        return createTime;
    }
        
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
        
    public String getCreateUser() {
        return createUser;
    }
        
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
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