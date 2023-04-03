package ss3_Array_Method.baiTap;

import java.util.Scanner;

public class sumColumnInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] ={{3,6,32,65,32},{25,6,43,76,21},{432,12,321,32,554}};
        System.out.println("Enter Column: ");
        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (input == j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of this Column is: " + sum );
    }
}
