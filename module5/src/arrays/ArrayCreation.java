package arrays;

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
        int[] array = create(scanner.nextInt());

        return array;
    }

}
