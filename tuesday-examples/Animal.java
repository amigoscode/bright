package com.amigoscode;

public abstract class Animal {

    protected String eyeColor;

    protected Animal(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }
}
