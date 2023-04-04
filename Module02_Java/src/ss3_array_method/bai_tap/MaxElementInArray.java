package ss3_array_method.bai_tap;

import java.util.Scanner;

public class MaxElementInArray {
    public static void main(String[] args) {
        Scanner enterElements = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int row = Integer.parseInt(enterElements.nextLine());
        System.out.println("Enter Column: ");
        int column = Integer.parseInt(enterElements.nextLine());
        int arr[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = Integer.parseInt(enterElements.nextLine());
                System.out.printf("Enter Element row %d and Column %d In Array:  ", i, j);
            }
        }
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column ; j++) {
                System.out.printf("Element row %d and Column %d In Array: %d ", i, j,arr[i][j]);
                System.out.println(" ");
            }
        }
        float max = arr[0][0];
        int indexRow = 0;
        int indexColumn = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] > max ){
                    max = arr[i][j];
                    indexRow = i;
                    indexColumn = j;
                }
            }
        }
        System.out.printf("Max Elements row %d column %d in array is %f : " , indexRow , indexColumn, max);
    }
}
