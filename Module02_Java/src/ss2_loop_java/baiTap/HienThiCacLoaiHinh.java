package ss2_loop_java.baiTap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("1.In ra Hình Chữ Nhật");
        System.out.println("2.In ra Hình Tam Giác Vuông");
        System.out.println("3. In Ra Hình Tam Giác Cân");
        System.out.println("4. Thoát Chương Trình");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
switch (n){
    case 1:
        for (int i = 0 ; i <= 2 ; i++){
            for (int j = 0 ; j <= 5; j++){
                if (i == 0 || i == 1 || i == 2)
                    System.out.print("* ");
            }
            System.out.println(" ");
        }
        break;
    case 2:
        System.out.println("Bottom-Left");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5 ; j++) {
                if (i >= j){
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("Bottom-Right");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                 if (j <= i ){
                     System.out.print("* ");
                 }else {
                     System.out.print("  ");
                 }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Top-Left");
        for (int i = 0 ; i <= 5 ; i++){
            System.out.println(" ");
            for (int j = 0 ; j <= 5; j++){
                if (i <= j){
                    System.out.print("* ");
                }
            }
        }
        System.out.println(" ");
        System.out.println("Top-Right");
        for (int i = 0 ; i <= 5 ; i++){
            for (int j = 0 ; j <= 5; j++){
                if (i <= j){
                    System.out.print("* ");
                }
            }
            System.out.println("");
            for (int k = 0; k <= 5 ; k++) {
              if (i >= k){
                  System.out.print("  ");
              }
            }
        }
        break;
    case 3:
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j <= i ){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        break;
    case 4:
        System.out.println("Bạn Đã Thoát Chương Trình , Hẹn Gặp Lại:");
        break;
}
    }
}



