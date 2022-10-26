package ss16_io_textfile.bai_tap.bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_io_textfile\\bai_tap\\bai2\\Country.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader =  new BufferedReader(fileReader);

        List<Country> countryList = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine() ) != null){
           String[] array = line.split(",")   ;
           Country country = new Country(Integer.parseInt(array[0]),array[1],array[2]);
           countryList.add(country);
        }
        bufferedReader.close();

        for (Country c:countryList) {
            System.out.println(c);
        }
    }
}
