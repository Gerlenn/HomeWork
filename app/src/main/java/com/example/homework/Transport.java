package com.example.homework;

abstract class Transport{
    abstract void drive();//ехать
    abstract void honk();//сигналить
}

interface mechanicFeatures{
    void startEngine();//заводить двигатель
}

class Bicycle extends Transport{

    @Override
    void drive() {

    }

    @Override
    void honk() {

    }
}

class Car extends Transport implements mechanicFeatures{

    @Override
    void drive() {

    }

    @Override
    public void honk() {

    }

    @Override
    public void startEngine() {

    }
}

class Tractor extends Transport implements mechanicFeatures{

    @Override
    void drive() {

    }

    @Override
    public void honk() {

    }

    @Override
    public void startEngine() {

    }
}