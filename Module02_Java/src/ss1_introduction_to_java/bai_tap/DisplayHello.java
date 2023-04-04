package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter Ur Name:");
        String urName = name.nextLine();
        System.out.println("Hello " + urName);
    }
}
