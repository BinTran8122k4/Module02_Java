package ss6_inheritance.bai_tap.lop_point2d_lop_point3d;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 3);
        System.out.println(point2D.toString());
        point2D.setXY(6, 7);
        System.out.println(point2D.toString());
        Point3D point3D = new Point3D(1,4,5);
        System.out.println(point3D.toString());
        point3D.setXYZ(10,11,12);
        System.out.println(point3D.toString());
    }
}
