package mypackage;

import java.util.Arrays;

public class Arrays2 {

       public static void main(String[] args) {

           //HW Week 1 п.4 : МАССИВЫ

           System.out.println();
           System.out.println("В массиве из задания 2. найти наибольший элемент");


        int[] arr = {20, 2, 1, 15, 1, 9, 1};
        int max = arr[0];
        for (int i = 1; i > arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
        }
        for (int var : arr) {
            if (var == max) {
                System.out.println(max);
            }
        }
    }
}



