package com.example.springsample.controller;

public class EntitySample {

    private String name;
    private EnumSample size;

    public EntitySample(String name, EnumSample size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumSample getSize() {
        return size;
    }

    public void setSize(EnumSample size) {
        this.size = size;
    }
}
