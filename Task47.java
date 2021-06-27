package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task47 {

    public static void maine(String []args) throws FileNotFoundException {

        /**Task47*/

        File file2 = new File("file.txt");
        int countOfPunctuationMarks = 0;
        int countWorld = 0;

        Scanner scan = new Scanner(file2);
        while (scan.hasNextLine()) {

            String[] gh = scan.next().split("\t[,.-?;!:]+");

            countWorld++;

            System.out.println(countWorld);

        }
        Scanner scr = new Scanner(file2);
        String scanText = scr.nextLine();

        StringTokenizer st = new StringTokenizer(scanText);

        while (st.hasMoreTokens()) {
            String str = st.nextToken("[,.-?!;:]");
            countOfPunctuationMarks++;
        }
        scan.close();
        System.out.println("world= " + countWorld);
        System.out.println("punktuation= " + countOfPunctuationMarks);



    }
}
