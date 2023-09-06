package com.springboot.webapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FileEntity {
    @Id
    @GeneratedValue
    private Long id;

    private Long userId;

    private String filePath;

    private String fileDescription;

    public FileEntity() {
    }

    public FileEntity(Long userId, String filePath, String fileDescription) {
        this.userId = userId;
        this.filePath = filePath;
        this.fileDescription = fileDescription;
    }


    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }
}