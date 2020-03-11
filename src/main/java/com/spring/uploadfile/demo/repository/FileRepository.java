package com.spring.uploadfile.demo.repository;

import com.spring.uploadfile.demo.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FileRepository extends JpaRepository<Photo, Integer> {



}
