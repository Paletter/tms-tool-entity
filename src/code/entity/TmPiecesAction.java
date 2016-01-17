package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class TmPiecesAction extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer tmPiecesActionId;
    private String actionCode;
    private String actionDesc;
    private String actionCodeDesc;
    private Integer addrViewNo;
    private String addrViewCode;
    private Integer userViewNo;
    private String userViewCode;
    private Integer isActivity;
    private Integer isLogistics;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String updateUserCode;
    private Date updateDateTime;
    
    public Integer getTmPiecesActionId() {
        return tmPiecesActionId;
    }
        
    public void setTmPiecesActionId(Integer tmPiecesActionId) {
        this.tmPiecesActionId = tmPiecesActionId;
    }
        
    public String getActionCode() {
        return actionCode;
    }
        
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }
        
    public String getActionDesc() {
        return actionDesc;
    }
        
    public void setActionDesc(String actionDesc) {
        this.actionDesc = actionDesc;
    }
        
    public String getActionCodeDesc() {
        return actionCodeDesc;
    }
        
    public void setActionCodeDesc(String actionCodeDesc) {
        this.actionCodeDesc = actionCodeDesc;
    }
        
    public Integer getAddrViewNo() {
        return addrViewNo;
    }
        
    public void setAddrViewNo(Integer addrViewNo) {
        this.addrViewNo = addrViewNo;
    }
        
    public String getAddrViewCode() {
        return addrViewCode;
    }
        
    public void setAddrViewCode(String addrViewCode) {
        this.addrViewCode = addrViewCode;
    }
        
    public Integer getUserViewNo() {
        return userViewNo;
    }
        
    public void setUserViewNo(Integer userViewNo) {
        this.userViewNo = userViewNo;
    }
        
    public String getUserViewCode() {
        return userViewCode;
    }
        
    public void setUserViewCode(String userViewCode) {
        this.userViewCode = userViewCode;
    }
        
    public Integer getIsActivity() {
        return isActivity;
    }
        
    public void setIsActivity(Integer isActivity) {
        this.isActivity = isActivity;
    }
        
    public Integer getIsLogistics() {
        return isLogistics;
    }
        
    public void setIsLogistics(Integer isLogistics) {
        this.isLogistics = isLogistics;
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
        
}