package mypackage;

public class Arrays1 {

    public static void main(String[] args) {


        //HW Week 1 п.4 : МАССИВЫ

        System.out.println();
        System.out.println("Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести их все");


        int[] arr = {20, 2, 1, 15, 1, 9, 1};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        for (int var : arr) {
            if (var == min) {
                System.out.println(min);
            }
        }
    }
}
