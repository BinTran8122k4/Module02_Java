package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class Square extends Shape implements Colorable {
    private double edge = 1.0;
    public Square(){

    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return " A Square With Edge :" +
                  edge +"Area: " + getArea() +
                '}';
    }

    @Override
    public double getArea() {
        return edge*edge;
    }

    @Override
    public void howtoColor() {
        System.out.println("Square , Color all four sides");
    }
}
