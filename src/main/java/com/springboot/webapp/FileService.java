package com.springboot.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;


@Service
public class FileService implements IFileService {

    private final FileRepository fileRepository;

    @Autowired
    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public HttpStatus saveFile(MultipartFile file, FileDto fileDto) {

        String uploadDir = "storage";
        String fileName = file.getOriginalFilename();
        String filePath = uploadDir + File.separator + fileName;

        try {
            file.transferTo(Path.of(filePath));
            FileEntity fileEntity = new FileEntity(1L, filePath, fileDto.getFileDescription());
            fileRepository.save(fileEntity);
            return HttpStatus.CREATED;

        } catch (IOException e) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }

    @Override
    public HttpStatus deleteFile(Long fileId) {
        Optional<FileEntity> optionalFileEntity = fileRepository.findById(fileId);

        if (optionalFileEntity.isPresent()) {
            FileEntity fileEntity = optionalFileEntity.get();
            String filePath = fileEntity.getFilePath();
            File fileToDelete = new File(filePath);
            fileToDelete.delete();
            fileRepository.delete(fileEntity);
            return HttpStatus.OK;
        }
        return HttpStatus.BAD_REQUEST;
    }

}
