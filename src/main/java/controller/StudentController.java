package controller;
import entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private ArrayList<Student> list = new ArrayList<>();
    public void addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter enrolID");
        String enrolID = scanner.nextLine();
        System.out.println("Enter firstName");
        String firstName = scanner.nextLine();
        System.out.println("Enter lastName");
        String lastName = scanner.nextLine();
        System.out.println("Enter age");
        Integer age = scanner.nextInt();
        Student student = new Student(enrolID,firstName, lastName, age);
        list.add(student);

    }
    public void  saveFile()throws IOException{
        FileWriter fileWriter = new FileWriter("src/main/resources/students.dat");
        fileWriter.write(  "enrolID\t" +"    "+ "FullName\t" +"    "+ "Age\t" +  "\n");
        System.out.println("---------------" + "--------------------------" + "---------");
        for(Student student: list){
            fileWriter.write(student.getEnrolID() +"          " + student.getFirstName() +" "+ student.getLastName() + "          " + student.getAge() + "\n");
        }
        fileWriter.close();
    }
    public void readFile() throws IOException{
        FileReader fileReader = new FileReader("src/main/resources/students.dat");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
    }
}