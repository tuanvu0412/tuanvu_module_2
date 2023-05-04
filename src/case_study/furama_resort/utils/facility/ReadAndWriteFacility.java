package case_study.furama_resort.utils.facility;

import case_study.furama_resort.model.faciliti.Facility;
import case_study.furama_resort.model.faciliti.House;
import case_study.furama_resort.model.faciliti.Room;
import case_study.furama_resort.model.faciliti.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFacility {
    public static List<Facility> read(String PATH) {
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Facility> list = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            String[] newArr;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                newArr = temp.split(",");
                if (temp.startsWith("SVHO")) {
                    list.add(new House(newArr[0], newArr[1], newArr[2], newArr[3], newArr[4], newArr[5], newArr[6], newArr[7], newArr[8]));
                } else if (temp.startsWith("SVVL")) {
                    list.add(new Villa(newArr[0], newArr[1], newArr[2], newArr[3], newArr[4], newArr[5], newArr[6], newArr[7]));
                } else if (temp.startsWith("SVRO")) {
                    list.add(new Room(newArr[0], newArr[1], newArr[2], newArr[3], newArr[4], newArr[5], newArr[6], newArr[7]));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void write(List<Facility> facilities, String filePath) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Facility c : facilities) {
                if(c instanceof Villa){
                    bufferedWriter.write(c.writeToFile());
                    bufferedWriter.newLine();
                }else if( c instanceof House){
                    bufferedWriter.write(c.writeToFile());
                    bufferedWriter.newLine();
                }else if( c instanceof Room){
                    bufferedWriter.write(c.writeToFile());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
