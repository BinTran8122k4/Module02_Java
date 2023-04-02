package ss3_Array_Method.thucHanh;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
int ar[] = new int [5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ar.length ; i++) {
            ar[i] = scanner.nextInt();
        }
        for (int i = 0; i < ar.length ; i++) {
            System.out.println(ar[i]);
        }

    }
}
