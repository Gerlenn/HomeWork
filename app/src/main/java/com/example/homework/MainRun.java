package com.example.homework4;

public class MainRun {
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon();
        Crow crow = new Crow();
        pigeon.fly();
        crow.fly();
    }
}

class Pigeon extends Bird{
    @Override
    void fly() {
        System.out.println("The pigeon is flying");
    }
}

class Crow extends Bird{
    @Override
    void fly() {
        System.out.println("The crow is flying");
    }
}

abstract class Bird {
    abstract void fly();
}

