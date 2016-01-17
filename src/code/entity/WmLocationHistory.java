package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class WmLocationHistory extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer wmLocationHistoryId;
    private Integer wmLocationId;
    private String locationCode;
    private String warehouseCode;
    private Integer tmPiecesId;
    private String piecesNo;
    private Integer tmConsignmentId;
    private String consignmentNo;
    private String actionCode;
    private String memo;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getWmLocationHistoryId() {
        return wmLocationHistoryId;
    }
        
    public void setWmLocationHistoryId(Integer wmLocationHistoryId) {
        this.wmLocationHistoryId = wmLocationHistoryId;
    }
        
    public Integer getWmLocationId() {
        return wmLocationId;
    }
        
    public void setWmLocationId(Integer wmLocationId) {
        this.wmLocationId = wmLocationId;
    }
        
    public String getLocationCode() {
        return locationCode;
    }
        
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
        
    public String getWarehouseCode() {
        return warehouseCode;
    }
        
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
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
        
    public Integer getTmConsignmentId() {
        return tmConsignmentId;
    }
        
    public void setTmConsignmentId(Integer tmConsignmentId) {
        this.tmConsignmentId = tmConsignmentId;
    }
        
    public String getConsignmentNo() {
        return consignmentNo;
    }
        
    public void setConsignmentNo(String consignmentNo) {
        this.consignmentNo = consignmentNo;
    }
        
    public String getActionCode() {
        return actionCode;
    }
        
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }
        
    public String getMemo() {
        return memo;
    }
        
    public void setMemo(String memo) {
        this.memo = memo;
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