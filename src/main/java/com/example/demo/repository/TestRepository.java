package com.example.demo.repository;

import com.example.demo.model.TestEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository extends MongoRepository<TestEntity, String> {

  TestEntity findByName(String name);

}
