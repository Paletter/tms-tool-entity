package com.palette.busi.project.tms.core.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.palette.busi.project.tms.core.base.BasePo;

@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class CdAttachment extends BasePo {

	private static final long serialVersionUID = 1L;
	
    private Integer cdAttachmentId;
    private String fileName;
    private String fileUrl;
    private String fileContentType;
    private Integer fileSize;
    private String attachmentComment;
    private Integer recordVersion;
    private Date createDateTime;
    private String createUserCode;
    private String createTimeZone;
    private Date updateDateTime;
    private String updateUserCode;
    private String updateTimeZone;
    
    public Integer getCdAttachmentId() {
        return cdAttachmentId;
    }
        
    public void setCdAttachmentId(Integer cdAttachmentId) {
        this.cdAttachmentId = cdAttachmentId;
    }
        
    public String getFileName() {
        return fileName;
    }
        
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
        
    public String getFileUrl() {
        return fileUrl;
    }
        
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
        
    public String getFileContentType() {
        return fileContentType;
    }
        
    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }
        
    public Integer getFileSize() {
        return fileSize;
    }
        
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
        
    public String getAttachmentComment() {
        return attachmentComment;
    }
        
    public void setAttachmentComment(String attachmentComment) {
        this.attachmentComment = attachmentComment;
    }
        
    public Integer getRecordVersion() {
        return recordVersion;
    }
        
    public void setRecordVersion(Integer recordVersion) {
        this.recordVersion = recordVersion;
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
        
    public String getCreateTimeZone() {
        return createTimeZone;
    }
        
    public void setCreateTimeZone(String createTimeZone) {
        this.createTimeZone = createTimeZone;
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
        
    public String getUpdateTimeZone() {
        return updateTimeZone;
    }
        
    public void setUpdateTimeZone(String updateTimeZone) {
        this.updateTimeZone = updateTimeZone;
    }
        
}