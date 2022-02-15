package mypackage;

import java.sql.SQLOutput;

public class TestClass5 {

    public static void main(String[] args) {


        //HW Week 1 п.3 : Логические и условные операторы (if, if-else, switch )

        int month = 12;

        System.out.println();
        System.out.println("Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень)");


        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
          }

        }
    }
