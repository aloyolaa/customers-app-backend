package com.aloyolaa.customerappbackend.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

public interface UploadService {
    Resource charge(String fileName) throws MalformedURLException;

    String save(MultipartFile file) throws IOException;

    Boolean delete(String fileName);

    Path getPath(String fileName);
}
