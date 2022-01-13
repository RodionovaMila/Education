package mypackage;

public class TestClassOperatorWhile {
    public static void main(String args[]) {

        //HW Week 1 п.3 : ОПЕРАТОРЫ ЦИКЛА (FOR, WHILE, DO-WHILE), ОПЕРАТОР BREAK
        int x = 0;

        System.out.println();
        System.out.println("При помощи цикла while вывести на экран нечетные числа от 1 до 99.");

        while( x >= 0 && x <= 99 ) {
            x++;
            if (x % 2 != 0) {
                System.out.print(x + " ");
                System.out.print("\n");
            }
        }
    }
}
