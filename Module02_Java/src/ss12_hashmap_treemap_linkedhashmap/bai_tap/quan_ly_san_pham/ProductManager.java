package ss12_hashmap_treemap_linkedhashmap.bai_tap.quan_ly_san_pham;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {

    ArrayList<Product> product1;

    public ProductManager() {
        this.product1 = new ArrayList<>();
    }

    public ProductManager(ArrayList<Product> product1) {
        this.product1 = product1;
    }


    public void addNewProduct(Product product) {
        this.product1.add(product);
        System.out.println("Add New Product is Successfully!!:");
    }

    public void fixIn4Product(int id) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < product1.size(); i++) {
            if (product1.get(i).getId() == id) {
                System.out.println("Nhap ten moi San Pham");
                String name = sc.nextLine();
                System.out.println("Nhap Gia Tien:");
                int price = sc.nextInt();
                product1.get(i).setName(name);
                product1.get(i).setPrice(price);
                System.out.println("Da Sua Thanh Cong tai vi tri : " + i);
                return;
            }
        }
        System.out.println("Khong tim thay Id:");
    }

    public void displayProductList() {
        for (Product product : product1) {
            System.out.println(product);
        }
    }

    public void removeProduct(int id) {
        for (int i = 0; i < product1.size(); i++) {
            if (product1.get(i).getId() == id) {
                product1.remove(i);
                System.out.println("Da Xoa Thanh Cong");
                return;
            }
        }
        System.out.println("Khong tim thay Id");
    }
    public void searchProduct(String name){
        for (int i = 0; i < product1.size(); i++) {
            if (product1.get(i).getName() == name){
                System.out.println(product1.get(i));
                return;
            }
        }
        System.out.println("Khong tim thay ten san pham");
    }
    public void sortAscPriceProduct(){
        AscPriceProduct ascPriceProduct = new AscPriceProduct();
        System.out.println("Sap Xep Tang Dan:");
        product1.sort(ascPriceProduct);
    }
    public void sortDescPriceProduct(){
        DescPriceProduct descPriceProduct = new DescPriceProduct();
        System.out.println("Sap Xep Giam Dan: ");
        product1.sort(descPriceProduct);
    }
}

