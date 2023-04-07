package ss6_inheritance.bai_tap.lop_circle_va_lop_cylinder;

public class Test {
    public static void main(String[] args) {
        System.out.println("Lớp Circle:");
        Circle circle = new Circle("Blue", 6);
        System.out.println(circle.toString());
        System.out.println("Lớp Cylinder:");
        Cylinder cylinder = new Cylinder("Red", 8, 5);
        System.out.println("Thể Tích Hình Trụ Là :" + cylinder.cylindricalVolume());
        System.out.println(cylinder.toString());
    }
}
