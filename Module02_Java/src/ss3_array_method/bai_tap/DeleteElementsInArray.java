package ss3_array_method.bai_tap;

import java.util.Scanner;

public class DeleteElementsInArray {
    public static void main(String[] args) {
        int arr[] = {10,4,6,8,7,2,5,0,0,0};
        int count = 0;
        boolean exit = false;
        Scanner deleteElement = new Scanner(System.in);
        System.out.println("Chose Element u wanna delete:");
        int x = Integer.parseInt(deleteElement.nextLine());
        for (int i = 0;i < arr.length; i++) {
            if (x == arr[i]){
              count = i;
              exit = true;
            }
        }
        for ( int i = count; i < arr.length-1 ; i++) {
            arr[i] = arr[i + 1];
            arr[arr.length -1] = 0;
        }
        if (!exit){
            System.out.println("Not found " + x + " in the Array");
        }
        System.out.println("Array After Delete");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.printf("Element was deleted %d in index %d",x,count);

    }
}
