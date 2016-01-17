package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class TmSector extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer tmSectorId;
    private String sectorLabel;
    private String sectorCode;
    private String flightCode;
    private String origPort;
    private String destPort;
    private Date etd;
    private Date eta;
    private String mawbCode;
    private BigDecimal totalQty;
    private BigDecimal totalWeight;
    private String totalGoodsDescription;
    private Date createTime;
    private String warehouseCode;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getTmSectorId() {
        return tmSectorId;
    }
        
    public void setTmSectorId(Integer tmSectorId) {
        this.tmSectorId = tmSectorId;
    }
        
    public String getSectorLabel() {
        return sectorLabel;
    }
        
    public void setSectorLabel(String sectorLabel) {
        this.sectorLabel = sectorLabel;
    }
        
    public String getSectorCode() {
        return sectorCode;
    }
        
    public void setSectorCode(String sectorCode) {
        this.sectorCode = sectorCode;
    }
        
    public String getFlightCode() {
        return flightCode;
    }
        
    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }
        
    public String getOrigPort() {
        return origPort;
    }
        
    public void setOrigPort(String origPort) {
        this.origPort = origPort;
    }
        
    public String getDestPort() {
        return destPort;
    }
        
    public void setDestPort(String destPort) {
        this.destPort = destPort;
    }
        
    public Date getEtd() {
        return etd;
    }
        
    public void setEtd(Date etd) {
        this.etd = etd;
    }
        
    public Date getEta() {
        return eta;
    }
        
    public void setEta(Date eta) {
        this.eta = eta;
    }
        
    public String getMawbCode() {
        return mawbCode;
    }
        
    public void setMawbCode(String mawbCode) {
        this.mawbCode = mawbCode;
    }
        
    public BigDecimal getTotalQty() {
        return totalQty;
    }
        
    public void setTotalQty(BigDecimal totalQty) {
        this.totalQty = totalQty;
    }
        
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }
        
    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }
        
    public String getTotalGoodsDescription() {
        return totalGoodsDescription;
    }
        
    public void setTotalGoodsDescription(String totalGoodsDescription) {
        this.totalGoodsDescription = totalGoodsDescription;
    }
        
    public Date getCreateTime() {
        return createTime;
    }
        
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
        
    public String getWarehouseCode() {
        return warehouseCode;
    }
        
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
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