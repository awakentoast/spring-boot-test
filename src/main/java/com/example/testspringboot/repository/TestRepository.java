package com.example.testspringboot.repository;

import com.example.testspringboot.entity.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<Test, Long> {
}
