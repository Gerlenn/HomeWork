package com.example.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FunInterface {

    public static void main(String[] args) {
        Child child = new Child(10, "Alisa", 123);
        Adult adult = new Adult(40, "Alisa", 160);
        //Task1
        FromChildToAdult<Child> fromChildToAdult;
        fromChildToAdult = (x) -> adult;
        Adult childToAdult = fromChildToAdult.transform(child);

        System.out.println(childToAdult.getStr());
        System.out.println("Age:" + childToAdult.getAge() + ", Name: " + childToAdult.getName() + ", Height: " + childToAdult.getHeight());
        System.out.println();

        //Task2
        List<Adult> listAdults = new ArrayList<Adult>();
        listAdults.add(new Adult(90, "Sem", 180));
        listAdults.add(new Adult(50, "Sveta", 169));
        listAdults.add(new Adult(40, "Anna", 170));
        listAdults.add(new Adult(60, "Sergey", 178));

        String OldAdult = String.valueOf(listAdults.stream().skip(1).limit(2).max(Comparator.comparing(Adult::getAge)).get().getName());
        System.out.println("The oldest is " + OldAdult);
    }
}

@FunctionalInterface
interface FromChildToAdult<T> {
    Adult transform(T t);
}

