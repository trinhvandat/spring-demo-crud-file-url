package com.spring.uploadfile.demo.service;

import com.spring.uploadfile.demo.model.Photo;

import java.util.List;
import java.util.Optional;

public interface FileService {

    Photo create(Photo photo);

    Optional<Photo> findById(int id);

    Photo deleteById(int id);

    Photo update(Photo photo);

    List<Photo> findAll();

}
