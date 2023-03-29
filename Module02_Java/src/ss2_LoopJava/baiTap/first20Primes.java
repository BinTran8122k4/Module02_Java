package ss2_LoopJava.baiTap;

import java.time.chrono.MinguoDate;

public class first20Primes {
    public static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
        public static void main (String[]args){
            int numbers = 20;
            int count = 0;
            int n = 2;
            while (count <= numbers) {
                if (isPrime(n)) {
                    System.out.println(n);
                    count++;
                }
                n++;

            }

        }

    }



