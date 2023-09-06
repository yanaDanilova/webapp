package com.springboot.webapp;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface IFileService {

    HttpStatus saveFile(MultipartFile file, FileDto fileDto);

    HttpStatus deleteFile(Long id);

}
