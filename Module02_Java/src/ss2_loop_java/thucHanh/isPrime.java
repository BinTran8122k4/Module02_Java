package ss2_loop_java.thucHanh;

import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ur Number: ");
        int n = Integer.parseInt(input.nextLine());
        boolean check = true;

        if (n < 2){
            System.out.println(n + " is Not Prime Number");
        }else {
            for (int index = 2 ; index <= Math.sqrt(n) ; index++){
                if (n % index == 0){
                    check = false;
                    break;
                }
            }
            if (!check){
                System.out.println(n + "is Not Prime Number");
            }else {
                System.out.println(n + "is Prime Number");

            }
        }
    }


}
