package ss1_introductionToJava.thucHanh;

import java.util.Scanner;

public class tinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Enter Your Weight(In Kilogram)");
        weight = scanner.nextDouble();

        System.out.println("Enter Your Height(In Meter)");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height,2);

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}


