package ss4_class_doi_tuong_trong_java.bai_tap.stop_watch;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Watch watch = new Watch();
        watch.start();
        System.out.println("Do u wanna Stop Watch!!!");
        String input = scanner.nextLine();
        if (Objects.equals(input, "ok")){
            watch.stop();
        }
        System.out.println(watch.getElapsedTime());
    }
}
