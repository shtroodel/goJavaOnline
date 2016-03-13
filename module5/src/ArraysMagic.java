import java.util.Random;

public class ArraysMagic {

    public static int[] createNewIntArray(int size) {

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(size + 100);
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

    public static int[] quickSortOfIntArray(int[] array) {
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
