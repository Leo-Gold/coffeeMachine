package com.cofffee.demo.data;

import java.util.UUID;

public class Coffee {
    private final String id;
    private String name;

    public Coffee(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
