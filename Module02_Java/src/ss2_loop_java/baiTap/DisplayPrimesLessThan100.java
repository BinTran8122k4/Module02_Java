package ss2_loop_java.baiTap;

public class DisplayPrimesLessThan100 {
    public static boolean check (int a){
        if (a < 2){
            return false;
        }else{
            for(int i = 2; i <= Math.sqrt(a) ; i++){
                if (a % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numbers = 100;
        int count = 0;
        int n = 2;
        while (count < 100){
            if (check(n)){
                System.out.println(n);
            }
            n++;
            count++;
            if (n == 100){
                break;
            }
        }
    }
}
