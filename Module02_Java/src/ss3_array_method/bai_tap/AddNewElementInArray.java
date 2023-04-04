package ss3_array_method.bai_tap;

import java.util.Scanner;

public class AddNewElementInArray {
    public static void main(String[] args) {
        Scanner addNew = new Scanner(System.in);
        int arr[] = {10, 4, 6, 7, 8, 0, 0, 0, 0};
        System.out.println("Array:");
        for (int oldArray : arr) {
            System.out.print(oldArray + " ");
        }
        System.out.println(" ");
        System.out.println("Enter Number ur Wanna Add in the Array:");
        int x = Integer.parseInt(addNew.nextLine());
        int count = 0;
        System.out.println("Enter Index In Array:");
        int index = Integer.parseInt(addNew.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (index <= 1 || index >= arr.length - 1) {
                System.out.println("Can not Add In The Array !!!");
                index = i;
                break;
            }
        }
        int[] newArray = new int[arr.length + 1];
        for (int j = 0; j < index; j++) {
            newArray[j] = arr[j];
        }
        int countt = 1;
        for (int i = newArray.length; i > index; i--) {
            newArray[newArray.length - countt] = arr[arr.length - countt];
            countt++;
        }
        newArray[index] = x;

        System.out.println("New Array:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
