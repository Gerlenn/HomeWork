package com.example.homework;

public class Task {
    public static void main(String[] args) {
        int[] array = new int[10];
        int step = 2;

        for (int i = 0; i < array.length; i++, step += 2) {
            array[i] = step;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int mass : array) {
            System.out.println(mass + "\n");
        }
    }
}

class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 1; i <= array.length; i += 2) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i -= 2) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
    }
}

class Task3 {
    public static void main(String[] args) {

        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            int min = 0;
            int max = 99;
            int random = min + (int) (Math.random() * ((max - min) + 1));
            array[i] = random;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int evenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println("Number of even elements = " + evenNumbers);
    }
}

class Task4 {
    public static void main(String[] args) {

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            int min = 0;
            int maxValue = 20;
            int random = min + (int) (Math.random() * ((maxValue - min) + 1));
            array[i] = random;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}

class Task5 {
    public static void main(String[] args) {

        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            int min = 0;
            int max = 15;
            int random = min + (int) (Math.random() * ((max - min) + 1));
            array[i] = random;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int maxValue = array[0];
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxValue) {
                maxValue = array[i];
                indexMax = i;
            }
        }
        System.out.println("Maximum value = " + maxValue);
        System.out.println("Index maximum value = "+ indexMax);
    }
}
