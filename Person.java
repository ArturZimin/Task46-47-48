package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person implements Serializable {
    private String name;
    private String surname;
    private String age;
    private String path;

    public Person(String name, String surname, String age) {
        List list = new ArrayList();
        this.name = name;
        list.add(name);
        this.surname = surname;
        list.add(surname);
        this.age = age;
        list.add(age);
        for (Object s : list)
            System.out.println(s);
    }


    public static void writeObjectInTheBinFile(String path, Object person) throws IOException {
        File file = new File(path);
        if (file.exists()) {//если не существует
            file.createNewFile();
        } else {
            System.out.println("Enter a different file name");
        }
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(person);
        oos.flush();
        oos.close();

    }


    public static void main(String[] args) throws IOException {
        Person person1 = new Person("Ivan", "Ivanov", "30");
        Person person2 = new Person("Michail", "Michailow", "30");
        Person person3 = new Person("Jon", "Born", "30");
        Person person4 = new Person("Andrey", "Andreyev", "30");
        Person person5 = new Person("Dima", "Pupkov", "30");
        Person person6 = new Person("Yura", "Okulco", "30");
        Person person7 = new Person("Rita", "Sidorova", "30");
        Person person8 = new Person("Karina", "Izmilova", "30");
        Person person9 = new Person("Alesia", "Boyko", "30");
        Person person10 = new Person("Kiril", "Komkin", "30");

        writeObjectInTheBinFile("C:\\Users\\Office\\IdeaProjects\\FailReadeWriterAndTask46,47,48\\ObjectPerson.bin",person1);
    }


}
