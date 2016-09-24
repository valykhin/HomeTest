package org.hometest.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ilia on 24.09.2016.
 */
public class DataLoader {

    public static List<String[]> loadData(String filepath) {
        List<String[]> operationList = new ArrayList<String[]>();
        String delimiter = ";";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] elements = line.split(delimiter);
                operationList.add(elements);
            }
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return operationList;
    }
}


