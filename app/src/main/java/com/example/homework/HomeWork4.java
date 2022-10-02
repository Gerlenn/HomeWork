package com.example.homework;

import java.util.Scanner;
public class HomeWork4 {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello World!";
        String str3 = "Hello, I am android developer!";
        int s1Length = str1.length();
        int s2Length = str2.length();
        int s3Length = str3.length();
        int max = 0;
        String maxStr = "";
        int min = 0;
        String minStr = "";
        if (s1Length > s2Length && s1Length > s3Length){
            max = s1Length;
            maxStr = str1;
        }else if (s1Length < s2Length && s1Length < s3Length){
            min = s1Length;
            minStr = str1;
        }
        if (s2Length > s1Length && s2Length > s3Length){
            max = s2Length;
            maxStr = str2;
        }else if (s2Length < s1Length && s2Length < s3Length){
            min = s2Length;
            minStr = str2;
        }
        if (s3Length > s1Length && s3Length > s2Length){
            max = s3Length;
            maxStr = str3;
        }else if (s3Length < s1Length && s3Length < s2Length){
            min = s3Length;
            minStr = str3;
        }
        System.out.println("Максимальная строка - ("+ maxStr + ") - её длина составляет " + max);
        System.out.println("Минимальная строка - ("+ minStr + ") - её длина составляет " + min);
    }
}

class HomeWorkTask2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        String str4 = sc.nextLine();

        StringBuilder strBulder1 = new StringBuilder(str1);
        StringBuilder strBulder2 = new StringBuilder(str2);
        StringBuilder strBulder3 = new StringBuilder(str3);
        StringBuilder strBulder4 = new StringBuilder(str4);

        int averageLength = (strBulder1.length() + strBulder2.length() + strBulder3.length() + strBulder4.length()) / 4;
        System.out.println("Средняя длина строки = " + averageLength);

        if (strBulder1.length() >= averageLength){
            System.out.println("Строка " + strBulder1 +" имеет длину "+ strBulder1.length() + " - это больше средней длины");
        }

        if (strBulder2.length() >= averageLength){
            System.out.println("Строка " + strBulder2 +" имеет длину "+ strBulder2.length() + " - это больше средней длины");
        }

        if (strBulder3.length() >= averageLength){
            System.out.println("Строка " + strBulder3 +" имеет длину "+ strBulder3.length() + " - это больше средней длины");
        }

        if (strBulder4.length() >= averageLength){
            System.out.println("Строка " + strBulder4 +" имеет длину "+ strBulder4.length() + " - это больше средней длины");
        }
    }
}

class PracticeTask3{
    //Task 3
    public static void main(String[] args) {
        StringBuffer strBuffer1 = new StringBuffer("I am learning programming").reverse();
        String str2 = "i like programming".toUpperCase();
        StringBuffer strBuffer2 = new StringBuffer(str2);
        StringBuffer strBuffer3 = new StringBuffer("Programming is cool");

        System.out.println(strBuffer3);
        System.out.println(strBuffer2);
        System.out.println(strBuffer1);
    }
}


