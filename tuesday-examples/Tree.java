package com.amigoscode;

import java.util.Objects;

public class Tree {
    private TreeType type;
    private int age;
    private double height;

    public Tree() {}

    public Tree(TreeType type, int age, double height) {

        this.type = type;
        this.age = age;
        this.height = height;
    }

    public Tree(TreeType type) {
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public TreeType getType() {
        return type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setType(TreeType type) {
        this.type = type;
    }

    public void grow() {
        System.out.println("growing...");
    }

    public void wither() {
        System.out.println("withering...");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "type=" + type +
                ", age=" + age +
                ", height=" + height +
                '}';
    }


}
