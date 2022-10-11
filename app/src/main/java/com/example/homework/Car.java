package com.example.homework;

public class Car {

    private String nameCAr;
    private int speed;
    private int price;

    public Car(String nameCAr, int speed, int price) {
        this.nameCAr = nameCAr;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String getNameCAr() {
        return nameCAr;
    }

    public void setNameCAr(String nameCAr) {
        this.nameCAr = nameCAr;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    void tryStart() throws carException {
        final int min = 0;
        final int max = 20;
        final int random = min + (int) (Math.random() * ((max - min) + 1));
        if (random % 2 == 0) {
            throw new carException("The car won't start");
        } else
            System.out.println("The car " + nameCAr + " is already started");
    }

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 300, 10000);
        Car car2 = new Car("Lada", 200, 3000);
        Car car3 = new Car("Bugatti", 400, 20000);

        try {
            car1.tryStart();
        } catch (carException e) {
            System.out.println(e.getMessage());
        }
        try {
            car2.tryStart();
        } catch (carException e) {
            System.out.println(e.getMessage());
        }
        try {
            car3.tryStart();
        } catch (carException e) {
            System.out.println(e.getMessage());
        }
    }
}

class carException extends Exception {

    private String message;

    carException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}