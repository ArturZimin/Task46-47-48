package com.company;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.io.StreamTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) throws IOException {


        /**Task48*/

        File fileTx = new File("fileIntSum");
        File fileInt_48=new File("C:\\Users\\Office\\IdeaProjects\\FailWork\\data\\output_48.txt");
        int sum = 0;
        if (!fileTx.exists()) {//если не существует
            fileTx.createNewFile();
        } else {
            // System.out.println("Enter a different file name");
        }
        FileWriter fileWriter = new FileWriter(fileTx);
        FileWriter fileWriter1 = new FileWriter(fileInt_48);
        FileReader fileReader = new FileReader(fileTx);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);

        bufferedWriter.write("On Wednesday more 20 than 20 Russian aircraft and two coastguard ships shadowed the warship as it sailed about 12 miles(19km) off Crimea's coast. ");
        bufferedWriter.flush();//финализирует поток и очищает буферы вывода
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String strRead = bufferedReader.readLine();
        Pattern pattern = Pattern.compile(("(\\d+)"));
        Matcher matchers = pattern.matcher(strRead);
        HashSet<Integer> set = new HashSet<Integer>();
        while (matchers.find()) {
            String space = " ";
            System.out.print(space + matchers.group(1));//возвращает подстроку ,которая совпала в результате вызова find
            int val = Integer.parseInt(matchers.group(1));
            if (!set.contains(val)) {
                set.add(val);
            }
            sum = sum + Integer.parseInt(matchers.group(1));
        }
        bufferedWriter.newLine();
        bufferedWriter.write(String.valueOf(sum));
        bufferedWriter.flush();
        bufferedWriter1.write(" 20 20 12 19  Sum all = 71\n" +
                "Delete identical element=  [19, 20, 12]\n" +
                "Sum all, where removed are identical elements = 51");
        bufferedWriter1.flush();
        bufferedWriter1.close();
        bufferedWriter.close();
        System.out.println("  Sum all = " + sum);
        System.out.println("Delete identical element=  " + set);
        System.out.print("Sum all, where removed are identical elements = " + set.stream().mapToInt(Integer::intValue).sum());//преобразование в потоке в int ,sum() считает общую сумму


        /**Task47*/

        File file2 = new File("file.txt");
        File inputTask = new File("C:\\Users\\Office\\IdeaProjects\\FailWork\\data\\input_task47.txt");
        FileWriter fileWriter2=new FileWriter(inputTask);
        int countOfPunctuationMarks = 0;
        int countWorld = 0;

        Scanner scan = new Scanner(file2);
        while (scan.hasNextLine()) {

            String[] gh = scan.next().split("\t[,.-?;!:]+");

            countWorld++;

        }
        Scanner scr = new Scanner(file2);
        String scanText = scr.nextLine();

        StringTokenizer st = new StringTokenizer(scanText);

        while (st.hasMoreTokens()) {
            String stri = st.nextToken("[,.-?!;:]");
            countOfPunctuationMarks++;
        }
        fileWriter2.write(String.valueOf(file2));
        fileWriter2.flush();
        fileWriter2.close();
        scan.close();

        // System.out.println("world= " + countWorld);
        // System.out.println("punktuation= " + countOfPunctuationMarks);


/**Task 46*/
        File fDir = new File("E:\\Учебный материал JAVA C# JavaScript");
        Map map = new HashMap();
        Map map1 = new HashMap();
        int countDirectory = 0;
        int countFile = 0;
        if (fDir.isDirectory()) {
            for (File temp : fDir.listFiles()) {

                if (temp.isDirectory()) {
                    countDirectory++;
                    map.put(temp.getName(), countDirectory);
                    for (Object iteratingArray : map.entrySet()) {
                        // System.out.println(iteratingArray + " directory ");
                    }
                } else {
                    countFile++;
                    map1.put(temp.getName(), countFile);
                    for (Object iteratingArray1 : map1.entrySet()) {

                        // System.out.println(iteratingArray1 + " file ");
                    }
                }
            }
        }


        File path = new File("E:\\Учебный материал JAVA C# JavaScript");
        readFiles(path);

    }


    /**
     * Task 46
     */


    public static void readFiles(File directory) {
        List<File> list = new ArrayList<>();
        List<File> list1 = new ArrayList<>();

        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                if (file.isFile()) {
                    list.add(file);
                    // System.out.println(file.getName() + " file");
                }
            }
        }
        if (!directory.isFile()) {
            for (File file1 : directory.listFiles()) {
                if (file1.isDirectory()) {
                    list1.add(file1);
                    //System.out.println(file1.getName() + " directory");
                }
            }


        }
    }

    /**
     * Task48
     */


}




