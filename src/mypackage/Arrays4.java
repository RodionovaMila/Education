package mypackage;

import java.util.Arrays;
import java.util.Random;

public class Arrays4 {


    public static void main(String[] args) {
        int[] array = { 4, -5, 0, 6, 8 };

         System.out.println((Arrays.stream(array).sum())/array.length);


    }
}
