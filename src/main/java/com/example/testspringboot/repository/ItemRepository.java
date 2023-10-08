package com.example.testspringboot.repository;

import com.example.testspringboot.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
