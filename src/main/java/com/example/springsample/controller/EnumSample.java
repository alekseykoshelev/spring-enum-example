package com.example.springsample.controller;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EnumSample {

    XS(32),
    S(34);

    private final int size;

    EnumSample(int size) {
        this.size = size;
    }

    @JsonValue
    public int getSize() {
        return size;
    }
}
