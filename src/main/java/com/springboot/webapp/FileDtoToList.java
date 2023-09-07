package com.springboot.webapp;

public class FileDtoToList {
    private String fileName;
    private String fileDescription;

    private String location;

    public FileDtoToList() {
    }

    public FileDtoToList(String fileName, String fileDescription, String location) {
        this.fileName = fileName;
        this.fileDescription = fileDescription;
        this.location = location;
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
