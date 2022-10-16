package com.example.homework;

import java.util.Arrays;

public class SortingByInserts {

    public static void main(String[] args) {
        int[] array = {88, 39, 22, 44, 65, 1, 12, 54, 67, 20, 2, 9, 39};
        System.out.println("Initial array: " + Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
            System.out.println(Arrays.toString(array));
        }
    }
}