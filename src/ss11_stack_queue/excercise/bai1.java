package ss11_stack_queue.excercise;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class bai1 {
    public static void main(String[] args) {
        Stack<String>string1 = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập chuỗi");
        String string= scanner.nextLine();
        String[] array = string.split("");
        string1.push(array);
        System.out.println(string1.pop());
    }
}
