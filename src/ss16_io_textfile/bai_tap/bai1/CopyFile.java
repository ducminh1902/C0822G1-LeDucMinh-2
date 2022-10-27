package ss16_io_textfile.bai_tap.bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_io_textfile\\bai_tap\\bai1\\source.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        List<String> array = new ArrayList();

        String line;
        String[] array1;
        int sum =0;
        while ((line = bufferedReader.readLine()) != null){
            array.add(line);
            array1= line.split("");
            sum +=array1.length;
        }
        System.out.println("tổng số ký tự trong tệp:"+sum);
        bufferedReader.close();


        File file1 = new File("src\\ss16_io_textfile\\bai_tap\\bai1\\target.txt");
        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

//        for (String c : array) {
//            bufferedWriter.write(c);
//            bufferedWriter.newLine();
//        }
        for (int i = 0; i <array.size() ; i++) {
            bufferedWriter.write(array.get(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }




}
