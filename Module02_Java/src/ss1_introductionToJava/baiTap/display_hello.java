package ss1_introductionToJava.baiTap;

import java.util.Scanner;

public class display_hello {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter Ur Name:");
        String urName = name.nextLine();
        System.out.println("Hello " + urName);
    }
}