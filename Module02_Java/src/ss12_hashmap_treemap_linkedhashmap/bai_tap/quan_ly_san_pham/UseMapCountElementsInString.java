package ss12_hashmap_treemap_linkedhashmap.bai_tap.quan_ly_san_pham;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UseMapCountElementsInString {
    public static void main(String[] args) {
        Map<String,Integer> countWords = new TreeMap<String,Integer>();
        countWords.put("TUAN" , 1);
        countWords.put("TRAN" , 2);
        countWords.put("BIN" , 3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Vào Một Chuỗi Bất Kì:");
        String  ramdomString = sc.nextLine();
        String arr [] = ramdomString.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i].toUpperCase();
        }
        for (int i = 0; i < arr.length ; i++) {
            if (countWords.containsKey(arr[i])){
                countWords.put(arr[i],countWords.get(arr[i]) + 1);
            }else {
                countWords.put(arr[i],1);
            }
        }
        System.out.println("Hiển Thị Các Key và Value Của TreeMap");
    for (String showMap: countWords.keySet()){
        System.out.println("Key:"+ showMap + " " + "Value:" + countWords.get(showMap));
    }
    }
}
