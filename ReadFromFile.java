package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {


    public static List<String> readFile(String path) throws IOException {


        File file = new File(path);

        BufferedReader br = new BufferedReader(new FileReader(file));

        List list = new ArrayList<>();
        String line = br.readLine();

        while (line != null) {
            list.add(line);
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        return list;
    }
}