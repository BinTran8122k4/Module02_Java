package bai_tap_them;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        System.out.println(oddNumbers());
    }

    public static int[] oddNumbers() {
        int arr[] = new int [5];
        int count = 0;
        for (int i = 1; i <= 10 ; i++) {
            if (i % 2 != 0){
                arr[count] = i;
                count++;
            }
        }
        for (int a:arr) {
            System.out.println(a);
        }
        return arr;
    }
}
