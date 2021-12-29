package mypackage;

import java.sql.SQLOutput;

public class TestClass {

    public static void main(String[] args) {

                      //HW Week 1 п.1 : Логические и условные операторы (if, if-else, switch )
        int a = 10;
        int b = 15;
        int c = 20;
        int d = 25;

        System.out.println();
        System.out.println("Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль");

        if (a < b && a < c && a < d) {
            System.out.println("Min value - " + a);
        } else if (b > a && b > c && b > d) {
            System.out.println("Min value - " + b);
        } else if (c > a && c > b && c > d) {
            System.out.println("Min value - " + c);
        } else if (d > a && d > b && d > c) {
            System.out.println("Min value - " + d);
        }

        int answer = Math.min( Math.min(a,b), Math.min(c,d) );
        System.out.println(answer);
    }

}
