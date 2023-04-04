package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class ReverseElementsInArray {
    public static void main(String[] args) {
        int size;
        int arr[] ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ur Length Array:");
        do {
           size = Integer.parseInt(scanner.nextLine());
             if (size > 10){
                 System.out.println("Size does not exceed 10 ");
             }
        }while (size > 10);
        arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.printf("Enter Elements %d in Array " , i);
            arr[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
       for (int a : arr){
           System.out.println(a);
       }
        for (int k = 0; k < arr.length / 2; k++) {
            int reversee = arr[arr.length - 1 -k];
            arr[arr.length -1 -k] = arr[k];
            arr[k] = reversee;
        }
        for (int afterReverse: arr){
            System.out.println("Reverse Arrays:" + afterReverse);
        }
    }
}
