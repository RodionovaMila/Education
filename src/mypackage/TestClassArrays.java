
package mypackage;


import java.util.Arrays;
import java.util.Scanner;

public class TestClassArrays {


    public static void main(String[] args) {

        //HW Week 1 п.4 : МАССИВЫ

        System.out.println();
        System.out.println("Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.");

        Scanner Scan = new Scanner(System.in);
        int[] A = new int[10];
        for (int i = 0; i < 10; i++)
            A[i] = 2 * i + 1;
        System.out.print(Arrays.toString(A));
    }
}


