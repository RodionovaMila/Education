package mypackage;

public class TestClassOperator {

    public static void main(String args[]) {

        //HW Week 1 п.3 : ОПЕРАТОРЫ ЦИКЛА (FOR, WHILE, DO-WHILE), ОПЕРАТОР BREAK

        System.out.println();
        System.out.println("При помощи цикла for вывести на экран нечетные числа от 1 до 99.");

        for(int x = 1; x < 100; x = x+2) {
            System.out.print("Значение x: " + x );
            System.out.print("\n");
        }
    }
}

