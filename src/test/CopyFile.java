package test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\test\\source.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<String> array = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null){
            array.add(line);
        }
        bufferedReader.close();

        File file1 = new File("src\\test\\target.txt");
        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);

        for (int i = 0; i <array.size() ; i++) {
           bufferedWriter.write(array.get(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
