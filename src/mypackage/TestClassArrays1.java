//package mypackage;


import java.util.Arrays;

public class TestClassArrays2 {



    public static void main(String[] args) {
        int[] arr = {20, 2, 1, 15, 1, 9, 1};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        for (int var : arr) {
            if (var == min) {
                System.out.println(min);
            }
        }
    }
}
