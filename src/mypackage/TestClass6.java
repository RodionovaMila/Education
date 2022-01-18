package mypackage;

import java.util.Scanner;

public class TestClass6 {

    public static void main(String args[]) {

        //HW Week 1 п.3 : ОПЕРАТОРЫ ЦИКЛА (FOR, WHILE, DO-WHILE), ОПЕРАТОР BREAK


        System.out.println();
        System.out.println("Даны переменные x и n вычислить x^n.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1:");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("Enter 2:");
        int n = Integer.parseInt(sc.nextLine());

        int j = 1;
        for(int i=0;i<n;i++) j*=x;
        System.out.println(j);
    }

}

