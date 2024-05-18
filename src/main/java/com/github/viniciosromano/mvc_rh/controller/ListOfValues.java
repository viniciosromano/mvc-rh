package com.github.viniciosromano.mvc_rh.controller;

public class ListOfValues {
    private Long value;
    private String text;

    public ListOfValues(Long value, String text) {
        this.value = value;
        this.text = text;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
