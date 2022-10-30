package com.example.homework;

import static java.lang.Thread.sleep;

public class HomeWorkThreads {

    public static void main(String[] args) {
        //creating and running two threads(Thread and Runnable) - Task 1
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();

        ThreadClass1 threadClass1 = new ThreadClass1();
        Thread thread1 = new Thread(threadClass1);
        thread1.start();

        //creating and running two threads by anonymous classes - Task 2
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Running (Thread) in anonymous class. Name thread is " + Thread.currentThread().getName());
            }
        };
        thread.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running (Runnable) in anonymous class. Name thread is " + Thread.currentThread().getName());
            }
        };
        //Passing a Runnable thread to another thread for execution and starting it - Task 3
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}

class ThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("First Thread(Thread). Name thread is " + Thread.currentThread().getName());
    }
}

class ThreadClass1 implements Runnable {

    @Override
    public void run() {
        try {
            sleep(5000);
            System.out.println("I run this code in: Name thread is " + Thread.currentThread().getName());
        } catch (Exception e) {}
    }
}
