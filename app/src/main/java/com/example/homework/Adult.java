package com.example.homework;

public class Adult{

    private int age;
    private String name;
    private int height;
    String str = "The child became an adult";

    public String getStr() {
        return str;
    }

    public Adult(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
