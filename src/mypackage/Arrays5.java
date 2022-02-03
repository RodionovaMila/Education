package mypackage;
import java.util.Arrays;


public class Arrays5 {


    public static void main(String[] args) {
        int[] arr = {15, 26, 144, 716, 999, 155, 326, 845, 632, 956, 125, 426, 746, 255, 9, 1, 150, 328, 856, 789};

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
