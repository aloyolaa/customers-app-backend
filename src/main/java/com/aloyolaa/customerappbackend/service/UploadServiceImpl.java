package com.aloyolaa.customerappbackend.service;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class UploadServiceImpl implements UploadService {
    @Override
    public Resource charge(String fileName) throws MalformedURLException {
        Path path = getPath(fileName);
        Resource resource = new UrlResource(path.toUri());
        if (!resource.exists() && !resource.isReadable()) {
            path = Paths.get("src/main/resources/static/img").resolve("not-user.png").toAbsolutePath();
            resource = new UrlResource(path.toUri());
        }
        return resource;
    }

    @Override
    public String save(MultipartFile file) throws IOException {
        String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        Path path = getPath(fileName);
        Files.copy(file.getInputStream(), path);
        return fileName;
    }

    @Override
    public Boolean delete(String fileName) {
        if (fileName != null && fileName.length() > 0) {
            Path pathPreviousPhoto = Paths.get("uploads").resolve(fileName).toAbsolutePath();
            File filePreviousPhoto = pathPreviousPhoto.toFile();
            if (filePreviousPhoto.exists() && filePreviousPhoto.canRead()) {
                filePreviousPhoto.delete();
                return true;
            }
        }
        return false;
    }

    @Override
    public Path getPath(String fileName) {
        return Paths.get("uploads").resolve(fileName).toAbsolutePath();
    }
}
