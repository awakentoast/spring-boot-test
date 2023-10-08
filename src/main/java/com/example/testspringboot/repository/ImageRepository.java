package com.example.testspringboot.repository;

import com.example.testspringboot.entity.Image;
import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<Image, Long> {
}
