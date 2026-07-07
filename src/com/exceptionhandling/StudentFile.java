package com.exceptionhandling;
import java.io.*;

public class StudentFile {

    public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("student.txt");

            fw.write("Student Details\n");
            fw.write("---------------\n");
            fw.write("Name : Hemanth Kumar\n");
            fw.write("Roll No : 101\n");
            fw.write("Course : B.Tech CSE\n");

            fw.close();

            FileReader fr = new FileReader("student.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("Contents of student.txt");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        }

        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        catch (IOException e) {
            System.out.println("Error while performing file operations.");
        }

    }

}