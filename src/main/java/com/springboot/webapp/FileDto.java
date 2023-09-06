package com.springboot.webapp;

public class FileDto {
    private Long userId;
    private String fileDescription;

    public FileDto(Long userId, String fileDescription) {
        this.userId = userId;
        this.fileDescription = fileDescription;
    }

    public FileDto() {
    }

    public Long getUserId() {
        return userId;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }
}