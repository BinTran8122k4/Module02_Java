package ss10_arraylist_linklist.thuc_hanh.simple_arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ml = new MyList<Integer>();
        ml.add(1);
        ml.add(2);
        ml.add(3);
        ml.add(4);
        System.out.println("Element 1:" + ml.get(1));
        System.out.println("Element 2:" + ml.get(2));
        System.out.println("Element 3:" + ml.get(3));
    }
}
