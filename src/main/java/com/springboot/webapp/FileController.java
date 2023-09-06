package com.springboot.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/files")
public class FileController {

    private final IFileService fileService;

    @Autowired
    public FileController(IFileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping("/upload")
    public ResponseEntity<Void> uploadFile(@RequestParam("file") MultipartFile file, @RequestPart("fileDto") FileDto fileDto) {
        return new ResponseEntity<>(fileService.saveFile(file, fileDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFile(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(fileService.deleteFile(id));
    }

}
