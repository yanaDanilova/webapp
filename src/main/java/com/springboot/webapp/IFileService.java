package com.springboot.webapp;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface IFileService {

    HttpStatus saveFile(MultipartFile file, FileDto fileDto);

    HttpStatus deleteFile(Long id);


    HttpStatus updateFile(Long id, MultipartFile file, FileDto fileDto);



    List<FileDtoFull> getAllFiles(Long userId);
}
