import java.util.Random;

public class ArraysMagic {

    public static int[] createNewIntArray(int size) {

        int[] array = new int[size];
        for (int value : array) {
            value = new Random().nextInt(size + 100);
        }

        return array;
    }

    public static int getMinValueOfIntArray(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    public static int getMaxValueOfIntArray(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }
}
