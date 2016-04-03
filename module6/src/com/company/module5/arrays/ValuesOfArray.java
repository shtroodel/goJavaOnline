package com.company.module5.arrays;

public class ValuesOfArray {

    public static int getMinValue(int[] array) {  //можно просто getMin

        int min =0;

        try {
            min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Error! array is empty" + ex.toString());
        }

        return min;
    }

    public static int getMaxValue(int[] array) {    //можно просто getMax

        int max = 0;

        try {
            max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Error! array is empty" + ex.toString());
        }

        return max;
    }

}
