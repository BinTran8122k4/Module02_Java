package ss1_introductionToJava.baiTap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("Enter ur USD: ");
        int usd = money.nextInt();
        int changeToVND = usd * 23000;
        System.out.println("Số Tiền Chuyển Đổi Từ USD Là : " + changeToVND);
    }
}
