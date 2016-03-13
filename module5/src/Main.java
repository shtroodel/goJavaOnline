import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input array's size:");
        final Scanner scanner = new Scanner(System.in);
        int[] array = ArraysMagic.createNewIntArray(scanner.nextInt());

        System.out.println("Our new array: ");

        for (int value : array) {
            System.out.println(value);
        }

        System.out.println("Minimum value: " + ArraysMagic.getMinValueOfIntArray(array));
        System.out.println("Maximum value: " + ArraysMagic.getMaxValueOfIntArray(array));

        System.out.println("Sorted array: ");

        for (int value : ArraysMagic.quickSortOfIntArray(array)) {
            System.out.println(value);
        }
    }
}
