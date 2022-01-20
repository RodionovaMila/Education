package mypackage;

import java.sql.SQLOutput;

public class TestClass7 {


    public static void main(String args[]) {
        //HW Week 1 п.3 : ОПЕРАТОРЫ ЦИКЛА (FOR, WHILE, DO-WHILE), ОПЕРАТОР BREAK

        int x = 5;

        System.out.println();
        System.out.println("Вывести 10 первых чисел последовательности 0, -5,-10,-15");

        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                x -= 5;
                System.out.print(x + "\n ");
            } else {
                x -= 5;
                System.out.print(x);

            }
        }
    }
}

