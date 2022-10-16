package com.example.homework;
import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {
        int[] array = {21, 71, 55, 20, 29, 5, 7, 10, 19, 18, 23, 70};
        System.out.println("Initial array: " + Arrays.toString(array));

        boolean isSorted = false;
        int counter = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}