package com.springboot.webapp;

public class FileDtoFull {
    private Long fileId;
    private Long userId;
    private String fileName;
    private String fileDescription;

    private String location;




    public FileDtoFull() {
    }


    public FileDtoFull(Long fileId, Long userId, String fileName, String fileDescription, String location) {
        this.fileId = fileId;
        this.userId = userId;
        this.fileName = fileName;
        this.fileDescription = fileDescription;
        this.location = location;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFileId() {
        return fileId;
    }

    public Long getUserId() {
        return userId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public String getLocation() {
        return location;
    }


    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
