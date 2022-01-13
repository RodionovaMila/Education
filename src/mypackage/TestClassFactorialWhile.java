package mypackage;

public class TestClassFactorialWhile {

    public static void main(String args[]) {

        int value = 13;
        int i = value;
        while (i > 1) {

            i--;
            value = value * i;
        }
        System.out.print(value);

    }

}