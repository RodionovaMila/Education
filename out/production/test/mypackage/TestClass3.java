package mypackage;

import java.sql.SQLOutput;

public class TestClass3 {

    public static void main(String[] args) {

        //HW Week 1 п.3 : Логические и условные операторы (if, if-else, switch )

        int a1 = 21;
        int b2 = 36;
        int c3 = 45;
        int d4 = 54;
        int e5 = 69;


        System.out.println();
        System.out.println("Даны 5 чисел (тип int).Вывести вначале наименьшее,а затем наибольшее из данных чисел.");

        if (a1 < b2 && a1 < c3 && a1 < d4 && a1 < e5) {
            System.out.println("Min value - " + a1);
        } else if (b2 < a1 && b2 < c3 && b2 < d4 && b2 < e5) {
            System.out.println("Min value - " + b2);
        } else if (c3 < a1 && c3 < b2 && c3 < d4 && c3 < e5) {
            System.out.println("Min value - " + c3);
        } else if (d4 < a1 && d4 < b2 && d4 < c3 && d4 < e5) {
            System.out.println("Min value - " + d4);
        } else if (e5 < a1 && e5 < b2 && e5 < c3 && e5 < d4) {
            System.out.println("Min value - " + e5);
        }

        if (a1 > b2 && a1 > c3 && a1 > d4 && a1 > e5) {
            System.out.println("Max value - " + a1);
        } else if (b2 > a1 && b2 > c3 && b2 > d4 && b2 > e5) {
            System.out.println("Max value - " + b2);
        } else if (c3 > a1 && c3 > b2 && c3 > d4 && c3 > e5) {
            System.out.println("Max value - " + c3);
        } else if (d4 > a1 && d4 > b2 && d4 > c3 && d4 > e5) {
            System.out.println("Max value - " + d4);
        } else if (e5 > a1 && e5 > b2 && e5 > c3 && e5 > d4) {
            System.out.println("Max value - " + e5);
        }

        int minVal = Math.min(Math.min(Math.min(a1, b2), Math.min(c3, d4)), e5);
        System.out.println(minVal);
        int maxVal = Math.max(Math.max(Math.max(a1, b2), Math.max(c3, d4)), e5);
        System.out.println(maxVal);
    }

}