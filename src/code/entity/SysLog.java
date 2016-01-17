package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class SysLog extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer sysLogId;
    private String classPathName;
    private String className;
    private String methodName;
    private String parameters;
    private String result;
    private String actionUserCode;
    private Date actionDateTime;
    private String seesionId;
    private String ip;
    private Integer recordVersion;
    private String createUserCode;
    private Date createDateTime;
    private String createTimeZone;
    private String updateUserCode;
    private Date updateDateTime;
    private String updateTimeZone;
    
    public Integer getSysLogId() {
        return sysLogId;
    }
        
    public void setSysLogId(Integer sysLogId) {
        this.sysLogId = sysLogId;
    }
        
    public String getClassPathName() {
        return classPathName;
    }
        
    public void setClassPathName(String classPathName) {
        this.classPathName = classPathName;
    }
        
    public String getClassName() {
        return className;
    }
        
    public void setClassName(String className) {
        this.className = className;
    }
        
    public String getMethodName() {
        return methodName;
    }
        
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
        
    public String getParameters() {
        return parameters;
    }
        
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }
        
    public String getResult() {
        return result;
    }
        
    public void setResult(String result) {
        this.result = result;
    }
        
    public String getActionUserCode() {
        return actionUserCode;
    }
        
    public void setActionUserCode(String actionUserCode) {
        this.actionUserCode = actionUserCode;
    }
        
    public Date getActionDateTime() {
        return actionDateTime;
    }
        
    public void setActionDateTime(Date actionDateTime) {
        this.actionDateTime = actionDateTime;
    }
        
    public String getSeesionId() {
        return seesionId;
    }
        
    public void setSeesionId(String seesionId) {
        this.seesionId = seesionId;
    }
        
    public String getIp() {
        return ip;
    }
        
    public void setIp(String ip) {
        this.ip = ip;
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