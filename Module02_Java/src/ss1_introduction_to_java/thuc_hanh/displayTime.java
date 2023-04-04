package ss1_introduction_to_java.thuc_hanh;

import java.util.Date;

public class displayTime {
    public static void main(String[] args) {
        long now = new Date().getTime();
        System.out.println("Time:" + now);
    }
}
