package ss12_hashmap_treemap_linkedhashmap.bai_tap.quan_ly_san_pham;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManager product = new ProductManager();
        product.addNewProduct(new Product(1,"Washing powder",5));
        product.addNewProduct(new Product(2,"Snack",3));
        product.addNewProduct(new Product(3,"Refreshment",2));
        product.displayProductList();
        product.fixIn4Product(2);
        product.displayProductList();
        product.removeProduct(2);
        product.displayProductList();
        System.out.println("San Pham ban Tim Kiem");
        product.searchProduct("Refreshment");
        product.addNewProduct(new Product(4,"Laptop",20));
        product.sortAscPriceProduct();
        product.displayProductList();
        product.sortDescPriceProduct();
        product.displayProductList();
    }
}
