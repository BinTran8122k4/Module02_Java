package ss12_hashmap_treemap_linkedhashmap.bai_tap.quan_ly_san_pham;

import java.util.Comparator;

public class DescPriceProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()){
            return -1;
        }else if (o1.getPrice() == o2.getPrice()){
            return 0;
        }else {
            return 1;
        }
    }
}
