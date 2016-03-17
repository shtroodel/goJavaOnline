package arrays;

public class ValuesOfArray {

    public static int getMinValueOfArray(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    public static int getMaxValueOfArray(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public static void printMinValue(int[] array){
        System.out.println("Minimum value: " + getMinValueOfArray(array));
    }

    public static void printMaxValue(int[] array){
        System.out.println("Maximum value: " + getMaxValueOfArray(array));
    }

}
