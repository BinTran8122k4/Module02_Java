package ss10_arraylist_linklist.thuc_hanh.simple_arraylist;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
       elements = new Object[DEFAULT_CAPACITY];
    }

    void ensureCapacity(){
        if (size >= elements.length){
            E[] newArr = (E[]) new Object[size * 2 +1];
            System.arraycopy(elements,0,newArr,0,size);
            elements = newArr;
        }
    }
    void  add(E e){
        if (size >= elements.length){
            ensureCapacity();
        }
        elements[size++] = e;
    }
    public E get(int i){
        if (i>= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

}
