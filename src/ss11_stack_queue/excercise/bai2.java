package ss11_stack_queue.excercise;

import java.util.*;

public class bai2 {
    public static void main(String[] args) {
       Map<String,Integer>stringIntegerMap= new TreeMap<>();
       Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi bất kỳ");
        String input = scanner.nextLine();
        String inputLowerCase = input.toLowerCase();
        String[] stringArr= inputLowerCase.split("");
        for (int i = 0; i <stringArr.length ; i++) {
            if (stringIntegerMap.containsKey(stringArr[i])){
                //cộng giá trị tăng thêm 1
              stringIntegerMap.put(stringArr[i], stringIntegerMap.get(stringArr[i]) + 1);
            }else {
             stringIntegerMap.put(stringArr[i],1);
            }
        }
//xuất kết qả
        for (String key : stringIntegerMap.keySet()) {
            System.out.println(key + ":");
            System.out.println(stringIntegerMap.get(key));
        }
    }
}
