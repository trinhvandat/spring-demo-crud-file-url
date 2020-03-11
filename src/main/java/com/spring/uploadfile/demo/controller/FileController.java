package com.spring.uploadfile.demo.controller;

import com.spring.uploadfile.demo.model.Photo;
import com.spring.uploadfile.demo.service.FileServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/photo")
public class FileController {

    @Autowired
    private FileServiceIml fileServiceIml;


    @PostMapping(produces = "application/json")
    public ResponseEntity<?> create(@RequestBody Photo photo){

        try{
            Photo saved = fileServiceIml.create(photo);
            return new ResponseEntity<>(saved, HttpStatus.OK);
        } catch (NullPointerException ex){
            System.out.println(ex);
            return new ResponseEntity<>(HttpStatus.SEE_OTHER.getReasonPhrase(), HttpStatus.SEE_OTHER);
        }

    }

}
