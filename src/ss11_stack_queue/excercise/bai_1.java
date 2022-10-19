package ss11_stack_queue.excercise;

import java.util.ArrayList;
import java.util.Stack;

public class bai_1 {
    public static void main(String[] args) {
        Stack<Integer> array = new Stack<>();
        Stack<Integer> array2 = new Stack<>();
        array.push(10);
        array.push(20);
        array.push(30);
        array.push(40);
        array.push(50);

        System.out.println(array);

       /* System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.pop());*/

        array2.push(array.pop());
        array2.push(array.pop());
        array2.push(array.pop());
        array2.push(array.pop());
        array2.push(array.pop());

        System.out.println(array2);
    }
}
