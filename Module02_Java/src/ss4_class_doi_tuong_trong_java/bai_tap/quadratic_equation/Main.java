package ss4_class_doi_tuong_trong_java.bai_tap.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter a,b,c: ");
        a = Double.parseDouble(scanner.nextLine());
        b = Double.parseDouble(scanner.nextLine());
        c = Double.parseDouble(scanner.nextLine());
        TinhToan tinhtoan = new TinhToan(a,b,c);
        if (tinhtoan.getDiscriminant() >= 0){
            System.out.printf("Hiển thị 2 nghiệm : Nghiệm 1 là %f nghiệm 2 là %f  " , tinhtoan.getRoot1() , tinhtoan.getRoot2());
        }else if (tinhtoan.getDiscriminant() == 0){
            System.out.printf("Hiển thị 1 nghiệm : Nghiệm 1 là %f ",tinhtoan.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
