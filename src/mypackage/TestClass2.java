package mypackage;

import java.sql.SQLOutput;

public class TestClass2 {

    public static void main(String[] args) {

        //HW Week 1 п.2 : Логические и условные операторы (if, if-else, switch )

        int q1 = 5;
        int w2 = 9;
        int e3 = 3;
        int r4 = 9;

        System.out.println();
        System.out.println("Вывести на консоль количество максимальных чисел среди этих четырех");

        int maxvalue = Math.max(Math.max(q1, w2), Math.max(e3, r4));
        int i;
        i = 0;

        if (q1 == maxvalue) {
            i++;
        }
        if (w2 == maxvalue) {
            i++;
        }
        if (e3 == maxvalue) {
            i++;
        }
        if (r4 == maxvalue) {
            i++;
        }

        System.out.println("количество максимальных чисел:" + i);
    }
}
