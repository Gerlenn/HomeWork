package com.example.homework;
// не совсем получилось, не могу понять, почему остаётся 1 товар в остатке
public class MultiThreadsShop_Task2 {
    public static void main(String[] args) {
        SecondStore store = new SecondStore();
        ProducerSecond producer = new ProducerSecond(store);
        ConsumerSecond consumer = new ConsumerSecond(store);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

class ProducerSecond implements Runnable{

    SecondStore store;
    ProducerSecond(SecondStore store){
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            store.put();
        }
    }
}

class ConsumerSecond implements Runnable{

    SecondStore store;
    ConsumerSecond(SecondStore store){
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            store.get();
        }
    }
}

class SecondStore {
    private int product = 0;
    private int productPrice = 10;
    private int wallet = 0;

    synchronized void get(){
        while (product < 2){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("get interrupted");
            }
        }
        product--;
        wallet += productPrice;
        System.out.println("consumer bought 1 product");
        System.out.println("product available: " + product);
        System.out.println("The seller has " + wallet + " dollars in his wallet");
        System.out.println("the product was thrown away " + product);
        product--;
        notify();
    }

    synchronized void put(){
        while (product == 2){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("get interrupted");
            }
        }
        product++;
        System.out.println("producer made 1 product");
        System.out.println("product available: " + product);
        notify();
    }
}