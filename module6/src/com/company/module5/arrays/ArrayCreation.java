package com.company.module5.arrays;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayCreation {

    public static int[] create(int size) {

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(size + 100);
        }

        return array;
    }

    public static int[] createNewArrayOfSize(){

        System.out.println("Input array's size:");
        final Scanner scanner = new Scanner(System.in);

        int[] array = null;

        try {
            array = create(scanner.nextInt());
        } catch (InputMismatchException | NegativeArraySizeException ex) {

            System.out.println("Error occured: " + ex.toString());
            System.out.println("Try again:");
            return createNewArrayOfSize();
        }

        return array;
    }

}
