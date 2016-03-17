package arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayCreation {

    public static int[] createNewArray(int size) {

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(size + 100);
        }

        return array;
    }

    public static void printArray(int[] array){
        System.out.println("Our new array: ");

        for (int value : array) {
            System.out.println(value);
        }
    }

    public static int[] inputSizeOfArray(){

        System.out.println("Input array's size:");
        final Scanner scanner = new Scanner(System.in);
        int[] array = createNewArray(scanner.nextInt());

        return array;
    }

}
