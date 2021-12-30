package mypackage;

import java.sql.SQLOutput;

public class TestClass4 {


    public static void main(String[] args) {

        //HW Week 1 п.3 : Логические и условные операторы (if, if-else, switch )

        String name1 = "Людмила";
        String name2 = "Людмила";

        System.out.println();
        System.out.println("Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, " +
                "что люди являются тезками.");

        if (name1 == name2) {
            System.out.println("Тезки");
        } else
            System.out.println("Разные имена");

    }
}

