package ss4_class_doi_tuong_trong_java.thuc_hanh;

public class Person {
    static class ChuNhat {
        public int rong, dai;

        public ChuNhat(int rong, int dai) {
            this.rong = rong;
            this.dai = dai;
        }
    }

    static class MyClass {
         void method(ChuNhat x) {
            x.rong = 5;
            x.dai = 5;
        }

        public static void main(String[] args) {
            MyClass o = new MyClass();
            ChuNhat cn = new ChuNhat(1, 1);
            o.method(cn);
            System.out.printf("x=%d, y=%d", cn.rong, cn.dai);
        }
    }
}
