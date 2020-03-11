package com.spring.uploadfile.demo.service;

import com.spring.uploadfile.demo.model.Photo;
import com.spring.uploadfile.demo.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FileServiceIml implements FileService {


    @Autowired
    private FileRepository repository;


    @Override
    public Photo create(Photo photo) {

        return repository.save(photo);
    }

    @Override
    public Optional<Photo> findById(int id) {
        return repository.findById(id);
    }

    @Override
    public Photo deleteById(int id) {
        return null;
    }

    @Override
    public Photo update(Photo photo) {
        return null;
    }

    @Override
    public List<Photo> findAll() {
        return null;
    }
}
