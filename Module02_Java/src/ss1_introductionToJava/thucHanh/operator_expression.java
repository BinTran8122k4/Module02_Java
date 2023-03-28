package ss1_introductionToJava.thucHanh;

import java.util.Scanner;

public class operator_expression
{
    public static void main(String[] args) {
        float width;
        float heigh;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width:");
        width = scanner.nextFloat();
        System.out.println("Enter Height:");
        heigh = scanner.nextFloat();
        float area = width * heigh;
        System.out.println("Result = " + area);
    }
}
