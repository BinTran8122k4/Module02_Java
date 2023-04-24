package ss10_arraylist_linklist.thuc_hanh.test_linekedlist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/=/=/=/Testing/=/=/=/=/=/=");
        MyLinkedList ml = new MyLinkedList(0);
        System.out.println("Array List:");
        ml.add(1,1);
        ml.add(2,2);
        ml.add(3,3);
        ml.add(4,4);
        ml.add(5,5);
        ml.add(6,6);
        ml.printList();
        ml.get(3);
        ml.addFirst(100);
        ml.printList();
    }
}
