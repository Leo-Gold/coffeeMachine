package com.coffee.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Random;
import java.util.UUID;


@Entity
@Table(name = "coffee")
public class Coffee {

    @Id
    private String id;
    private String name;

    public Coffee() {
    }

    public Coffee(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public Coffee(String id, String name) {
        this.id = id;
        this.name = name;
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

}
