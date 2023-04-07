package ss6_inheritance.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(String color, int radius, int height) {
        super(color, radius);
        this.height = height;
    }

    public double cylindricalVolume() {
        return (getRadius() * 2) * Math.PI * this.height;
    }

    public String toString() {
        return "Circle{" +
                "color='" + super.getColor() + '\'' +
                ", radius=" + super.getRadius() +
                ", height=" + this.height +
                '}';
    }
}
