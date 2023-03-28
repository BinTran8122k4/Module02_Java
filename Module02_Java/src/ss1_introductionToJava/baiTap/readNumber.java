package ss1_introductionToJava.baiTap;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class readNumber {
    static int chuc;
    static int tram;
    static int donVi;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Số Bất Kì Lớn Hơn 0 và <= 999");
        int number = scanner.nextInt();
        if (number < 0 && number > 999){
            System.out.println("out of ability");
        }else if (number >= 0 && number < 20){
            switch (number){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eightteen ");
                    break;
                case 19:
                    System.out.println("nineteen ");
                    break;
            }
        }else if(number > 20 && number <= 99){
            donVi = number / 10;
            chuc = number % 10;
            switch (donVi){
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }
            switch (chuc){
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
            }
        }else if (number >= 100 && number <= 999){
            tram = number / 100;
            chuc = (number % 100) / 10;
            donVi = (number % 100) % 10;
            switch (tram){
                case 1:
                    System.out.println("One hundred");
                    break;
                case 2:
                    System.out.println("Two Hundred");
                    break;
                case 3:
                    System.out.println("Three Hundred");
                    break;
                case 4:
                    System.out.println("Four Hundred");
                    break;
                case 5:
                    System.out.println("Five Hundred");
                    break;
                case 6:
                    System.out.println("Six Hundred");
                    break;
                case 7:
                    System.out.println("Seven Hundred");
                    break;
                case 8:
                    System.out.println("Eight Hundred");
                    break;
                case 9:
                    System.out.println("Nine Hundred");
                    break;
            }
            switch (chuc){
                case 1:
                    if (donVi == 1){
                        System.out.println("Eleven");
                        break;
                    }else if (donVi == 0){
                        System.out.println("Ten");
                        break;
                    }else if (donVi == 2){
                        System.out.println("Twelve");
                        break;
                    }else if (donVi == 3){
                        System.out.println("Thirteen");
                        break;
                    }else if (donVi == 4){
                        System.out.println("Fourteen");
                        break;
                    }else if (donVi ==5){
                        System.out.println("Fifteen");
                        break;
                    }else if (donVi == 6){
                        System.out.println("sixteen");
                        break;
                    }else if (donVi == 7){
                        System.out.println("Seventeen");
                        break;
                    }else if (donVi == 8){
                        System.out.println("Eighteen");
                        break;
                    }else if (donVi == 9){
                        System.out.println("nineteen");
                        break;
                    }
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }
            switch (donVi){
                case 1:
                    if (chuc ==1){
                        break;
                    }
                    System.out.print("One ");
                    break;
                case 2:
                    if (chuc ==1){
                        break;
                    }
                    System.out.print("Two ");
                    break;
                case 3:
                    if (chuc ==1){
                        break;
                    }
                    System.out.print("Three ");
                    break;
                case 4:
                    if (chuc ==1){
                        break;
                    }
                    System.out.print("four ");
                    break;
                case 5:
                    if (chuc ==1){
                        break;
                    }
                    System.out.print("five ");
                    break;
                case 6:
                    if (chuc ==1){
                        break;
                    }
                    System.out.print("six ");
                    break;
                case 7:
                    if (chuc ==1){
                        break;
                    }
                    System.out.print("seven ");
                    break;
                case 8:
                    if (chuc ==1){
                        break;
                    }
                    System.out.print("eight ");
                    break;
                case 9:
                    if (chuc ==1){
                        break;
                    }
                    System.out.print("nine ");
                    break;
            }
        }
    }
}
