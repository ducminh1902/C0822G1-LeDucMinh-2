package ss11_stack_queue.excercise;

import java.util.Stack;

public class bai_3 {
    public static void main(String[] args) {
        Stack<Integer> number = new Stack<>();

        int n =11;

        while (n>0){
           number.push(n%2);
           n /= 2;
        }
        System.out.println("kết quả");
        while (!number.isEmpty()){
            System.out.println(number.pop());
        }
    }
}
