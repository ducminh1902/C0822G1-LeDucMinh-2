package ss2_loop.pratice;

import java.util.Scanner;

public class PrimeLess100 {
    public static void main(String[] args) {
        int n=2;
        while (n<100){
            boolean check = true;
            for (int i = 2; i <n ; i++) {
                if (n % i ==0){
                    check= false;
                }
            }
            if (check){
                System.out.println(n);
            }
            n++;
        }
    }
}
