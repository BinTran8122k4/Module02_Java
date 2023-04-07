package ss5_access_modifier_static_method_static_property.thuc_hanh;

public class StaticMethod {
    private int id;
    private String name;
    private static String classes = "A1222I1";


    public StaticMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    static void change(){
        classes = "A0323I1 :DDD";
    }

    @Override
    public String toString() {
        return "StaticMethod{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "/ class='" + classes +'\'' +
                '}';
    }
    public static void main(String[] args) {
        StaticMethod staticMethod1 = new StaticMethod(123,"Tuan");
        StaticMethod staticMethod2 = new StaticMethod(321,"Duy");
        StaticMethod.change();
        System.out.println(staticMethod1.toString());
        System.out.println(staticMethod2.toString());
    }
}

