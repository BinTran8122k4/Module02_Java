package ss3_Array_Method.baiTap;

import java.util.Scanner;

public class minElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of Array");
        int size = Integer.parseInt(scanner.nextLine());
        int arr[] = new int [size];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter Element in index  " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Min Element in array is : " + min);
    }
}
