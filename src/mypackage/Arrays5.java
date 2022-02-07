package mypackage;
import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {
        int [] arr = new int[10];


        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] =  (int)(Math.random() * 100);
                if(arr[i] < arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}