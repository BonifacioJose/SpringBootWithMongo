package com.example.demo.endpoint;

import com.example.demo.model.TestEntity;
import com.example.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEndpoint {

  @Autowired
  private TestRepository testRepository;

  @RequestMapping(value = "/tests", method = RequestMethod.GET)
  public ResponseEntity getTests() {
    return ResponseEntity.ok(testRepository.findAll());
  }

  @RequestMapping(value = "/test/{name}", method = RequestMethod.GET)
  public ResponseEntity getTestByName(
      @PathVariable(value="name") String name) {
    return ResponseEntity.ok(testRepository.findByName(name));
  }

  @RequestMapping(value = "/test", method = RequestMethod.POST)
  public ResponseEntity postTest() {
    TestEntity testEntity = new TestEntity();
    testEntity.setName("newName12345");
    testRepository.save(testEntity);
    return ResponseEntity.ok().build();
  }
}
