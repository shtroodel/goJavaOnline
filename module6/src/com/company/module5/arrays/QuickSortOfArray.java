package com.company.module5.arrays;

public class QuickSortOfArray {

    public static int[] sort(int[] array) {
        quickSort(array, 0, array.length - 1);

        return array;
    }

    private static void quickSort(int[] array, int first, int last)
    {
        int i = first, j = last, x = array[(first + last) / 2];
        do {
            while (array[i] < x) i++;
            while (array[j] > x) j--;

            if(i <= j) {
                if (i < j) {
                    int temp = array[i];
                    array[i] = array [j];
                    array[j] = temp;
                }
                i++;
                j--;
            }
        } while (i <= j);
        if (i < last)
            quickSort(array, i, last);
        if (first < j)
            quickSort(array, first, j);

    }

}
