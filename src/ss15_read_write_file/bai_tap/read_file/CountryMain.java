package ss15_read_write_file.bai_tap.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountryMain {
    public static void main(String[] args) {
        String PATH = "src/ss15_read_write_file/bai_tap/read_file/countries.csv";
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Country> list = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            String[] tempArr;
            Country country;
            while ((temp = bufferedReader.readLine()) != null) {
                tempArr = temp.split(",");
                country = new Country(Integer.parseInt(tempArr[0]), tempArr[1], tempArr[2]);
                list.add(country);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (Country c : list) {
            System.out.println(c);
        }
    }
}

