package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CdUserPwd extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer cdUserPwdId;
    private Integer cdUserId;
    private String userName;
    private String salt;
    private String pwd;
    private Date lastLoginTime;
    private String lastLoginIp;
    private String cookie;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getCdUserPwdId() {
        return cdUserPwdId;
    }
        
    public void setCdUserPwdId(Integer cdUserPwdId) {
        this.cdUserPwdId = cdUserPwdId;
    }
        
    public Integer getCdUserId() {
        return cdUserId;
    }
        
    public void setCdUserId(Integer cdUserId) {
        this.cdUserId = cdUserId;
    }
        
    public String getUserName() {
        return userName;
    }
        
    public void setUserName(String userName) {
        this.userName = userName;
    }
        
    public String getSalt() {
        return salt;
    }
        
    public void setSalt(String salt) {
        this.salt = salt;
    }
        
    public String getPwd() {
        return pwd;
    }
        
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
        
    public Date getLastLoginTime() {
        return lastLoginTime;
    }
        
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
        
    public String getLastLoginIp() {
        return lastLoginIp;
    }
        
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }
        
    public String getCookie() {
        return cookie;
    }
        
    public void setCookie(String cookie) {
        this.cookie = cookie;
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