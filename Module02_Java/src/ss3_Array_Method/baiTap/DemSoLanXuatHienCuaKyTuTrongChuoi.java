package ss3_Array_Method.baiTap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        String chuoi = "aczx qeq dxz sdaeqw eq cz eq cxkqea bv c";
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Nhập Ký Tự Bạn Muốn Kiểm Tra: ");
        char input = scanner.nextLine().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
         if(chuoi.charAt(i) == input){
             count++;
        }
        }
        System.out.println(" Ký Tự " + input + " Xuất Hiện " + count + " Lần Trong Mảng");
    }
}
