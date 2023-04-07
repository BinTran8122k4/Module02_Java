package ss4_class_doi_tuong_trong_java.bai_tap.fan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan fan1 = new Fan(3,true,10,"yellow");
        Fan fan2 = new Fan(2,false,5,"Blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
