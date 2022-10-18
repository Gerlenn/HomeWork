package com.example.homework;

import java.util.Arrays;
import java.util.Random;

public class MultidimensionalArrays {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random randomNumber = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumber.nextInt(10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}

class Tasks2 {

    public static void main(String[] args) {
        int[][][] array = {{{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}}, {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
    }
}

class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random randomNumber = new Random();
        System.out.println("The original array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumber.nextInt(10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        Arrays.sort(array[0]);
        System.out.println("The first row of the array is sorted in ascending order:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        //I use the bubble sorting method to sort in descending order.
        System.out.println("The second row of the array is sorted in descending order:");
        int secondRow = array[1].length;
        for (boolean sorted = secondRow == 0; !sorted; --secondRow) {
            sorted = true;
            for (int i = 1; i < secondRow; ++i) {
                if (array[1][i - 1] < array[1][i]) {
                    sorted = false;
                    int temp = array[1][i - 1];
                    array[1][i - 1] = array[1][i];
                    array[1][i] = temp;
                }
            }
        }
        //It was difficult, but it worked out
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    void arrayOutput(){
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}

class Tasks4 {

    public static void main(String[] args) {
        Random random = new Random();
        int[][][] array = new int[3][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    array[i][j][k] = random.nextInt(10);
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}