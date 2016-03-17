import arrays.ArrayCreation;
import arrays.QuickSortOfArray;
import arrays.ValuesOfArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = ArrayCreation.inputSizeOfArray();
        ArrayCreation.printArray(array);

        ValuesOfArray.printMaxValue(array);
        ValuesOfArray.printMinValue(array);

        QuickSortOfArray.printSortedArray(array);
    }
}
