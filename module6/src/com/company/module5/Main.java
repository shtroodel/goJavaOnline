package com.company.module5;

import com.company.module5.arrays.ArrayCreation;
import com.company.module5.arrays.QuickSortOfArray;
import com.company.module5.arrays.ValuesOfArray;

public class Main {
    public static void main(String[] args) {

        int[] array = ArrayCreation.createNewArrayOfSize();

        System.out.println("Our new array:");
        print(array);

        System.out.println("Minimum value: " + ValuesOfArray.getMinValue(array));
        System.out.println("Maximum value: " + ValuesOfArray.getMaxValue(array));

        System.out.println("Sorted array: ");
        print(QuickSortOfArray.sort(array));
    }

    private static void print(int[] array){
        for (int value : array) {
            System.out.println(value);
        }
    }
}
