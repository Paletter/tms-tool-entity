package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CdResource extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer cdResourceId;
    private String resourceName;
    private String resourceUrl;
    private Integer menuOrder;
    private Integer menuCate;
    private String descpt;
    private Integer isActive;
    private String category;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getCdResourceId() {
        return cdResourceId;
    }
        
    public void setCdResourceId(Integer cdResourceId) {
        this.cdResourceId = cdResourceId;
    }
        
    public String getResourceName() {
        return resourceName;
    }
        
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
        
    public String getResourceUrl() {
        return resourceUrl;
    }
        
    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }
        
    public Integer getMenuOrder() {
        return menuOrder;
    }
        
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }
        
    public Integer getMenuCate() {
        return menuCate;
    }
        
    public void setMenuCate(Integer menuCate) {
        this.menuCate = menuCate;
    }
        
    public String getDescpt() {
        return descpt;
    }
        
    public void setDescpt(String descpt) {
        this.descpt = descpt;
    }
        
    public Integer getIsActive() {
        return isActive;
    }
        
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
        
    public String getCategory() {
        return category;
    }
        
    public void setCategory(String category) {
        this.category = category;
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