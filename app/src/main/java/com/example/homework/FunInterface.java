package com.example.homework;

public class FunInterface {

    public static void main(String[] args) {
        Child child = new Child(10 , "Alisa", 123);
        Adult adult = new Adult(40, "Alisa", 160);

        FromChildToAdult<Child> fromChildToAdult;
        fromChildToAdult = (x) -> adult;
        Adult childToAdult = fromChildToAdult.transform(child);

        System.out.println(childToAdult.getStr());
        System.out.println("Age:" + childToAdult.getAge() + ", Name: " + childToAdult.getName() + ", Height: "+ childToAdult.getHeight());
    }
}

@FunctionalInterface
interface FromChildToAdult<T> {
    Adult transform(T t);
}

