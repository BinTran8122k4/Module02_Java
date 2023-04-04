package ss3_array_method.bai_tap;

import java.util.Scanner;

public class TinhTongDuongCheoCuaMaTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = {
                {3,5,7,1,2},
                {8,9,5,2,1},
                {2,3,6,5,2},
                {9,4,2,1,4},
                {2,1,5,3,2}};
        int sum =0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if (i == j){
                  sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng Của Đường Chéo Trong Ma Trận: " + sum);
    }

}
