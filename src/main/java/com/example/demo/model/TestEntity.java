package com.example.demo.model;

import java.util.Date;
import org.springframework.data.annotation.Id;

public class TestEntity {

  @Id
  private String id;
  private String name;
  private Date creationDate;

  public TestEntity() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }
}
