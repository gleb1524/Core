package Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 2, 5, 1, 4, 9};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    protected static void sortArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    max = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = max;
                }
            }
        }
    }
}
