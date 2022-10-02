package com.example.homework4;

public class Phone {
    String number;
    String model;
    int weight;

    void receiveCall(String  name){
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number){
        System.out.println("Звонит - " + name + "," + " Номер: " + number);
    }

    void getNumber(){
        System.out.println(number + "\n");
    }

    void sendMessage(String number){
        System.out.println("Сообщение отправлено - " + number);
    }


    public Phone(String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){

    }

    public static void main(String[] args) {
        Phone phoneOne = new Phone("375(29)111-22-33","Iphone",200);
        System.out.println("Phone number: " + phoneOne.number);
        System.out.println("Phone model: " + phoneOne.model);
        System.out.println("Phone weight: " + phoneOne.weight + "\n");

        Phone phoneTwo = new Phone("375(33)222-33-44", "Samsung");
        System.out.println("Phone number: " + phoneTwo.number);
        System.out.println("Phone model: " + phoneTwo.model);
        System.out.println("Phone weight: " + phoneTwo.weight + "\n");

        Phone phoneThree = new Phone("375(44)333-44-55", "Huawei", 150);
        System.out.println("Phone number: " + phoneThree.number);
        System.out.println("Phone model: " + phoneThree.model);
        System.out.println("Phone weight: " + phoneThree.weight + "\n");

        phoneOne.receiveCall("Alexandr");
        phoneOne.getNumber();
        phoneTwo.receiveCall("Gleb");
        phoneTwo.getNumber();
        phoneThree.receiveCall("Roma");
        phoneThree.getNumber();

        phoneOne.receiveCall("Anonymous", "375(00)000-00-00\n");

        phoneOne.sendMessage(phoneOne.number);
        phoneTwo.sendMessage(phoneTwo.number);
        phoneThree.sendMessage(phoneThree.number);
    }
}
