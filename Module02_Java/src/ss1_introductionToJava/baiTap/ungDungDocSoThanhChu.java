package ss1_introductionToJava.baiTap;

import java.util.Arrays;
import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public int readNumber(int a , int b , int c) {
        Scanner scanner = new Scanner(System.in);

        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nhap = scanner.nextInt();
        String[] number1to10 = {"Không", "Một ", "Hai ", "Ba ", " Bốn ",
                "Năm ", "Sáu ", "Bảy ", "Tám ", "Chín ", "Mười"};
        switch (nhap) {
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
            case 10:
                System.out.println("Mười");
                break;
        }
    }
}
