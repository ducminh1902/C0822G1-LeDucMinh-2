package ss15_sinh_ngoai_le_debug.bai_tap;


import java.util.Scanner;

public class ILegalTriangleException {
    public static void main(String[] args) throws Exception_Triangle {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cạnh thứ 1 của tam giác");
        int canhA = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập cạnh thứ 2 của tam giác ");
        int canhB = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập cạnh thứ 3 của tam giác");
        int canhC = Integer.parseInt(scanner.nextLine());

        ILegalTriangleException iLegalTriangleException = new ILegalTriangleException();
        ILegalTriangleException.checkTriangle(canhA, canhB, canhC);
        System.out.println("tam giác này có cạnh là :" + canhA + "," + canhB + "," + canhC);

    }


    public static void checkTriangle(int canhA, int canhB, int canhC) throws Exception_Triangle {
        if (canhA + canhB > canhC && canhB + canhC > canhA && canhA + canhC > canhB) {
            return;
        } else {
            throw new Exception_Triangle("tam giác không tồn tại");
        }
    }
}
