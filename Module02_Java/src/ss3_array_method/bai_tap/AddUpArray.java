package ss3_array_method.bai_tap;

import java.util.Scanner;

public class AddUpArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[7];
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Enter Element in %d in Array1: ", i);
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("Enter Element in %d in Array2: ", i);
            arr2[i] = scanner.nextInt();
        }
        int arr3[] = new int[arr1.length  + arr2.length ];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int count = 0;
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[count];
            count++;
        }

        for (int i = 0; i < arr3.length ; i++) {
            System.out.printf("Index %d in The Array3: %d" , i , arr3[i]);
            System.out.println(" ");
        }
    }
}
