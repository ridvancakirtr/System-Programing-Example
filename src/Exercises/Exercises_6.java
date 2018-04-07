package Exercises;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercises_6 {
    private String StudentID;
    private String StudentName;
    HashMap<Integer, Student> studentHashMap = new HashMap<>();
    Exercises_6(){
        String studentNumber=JOptionPane.showInputDialog(null,"How Many Student Enter the System ?");
        int totalStudent=Integer.parseInt(studentNumber);
        for (int i=0;i<totalStudent;i++){
            String studentNumberName=JOptionPane.showInputDialog(null,"Please Enter Student ID , Name Sperate with Comma ?");
            splitComma(studentNumberName);
            studentHashMap.put(i,new Student(StudentID,StudentName));
        }
        listData();
        updateStudentName();
        listData();
    }

    private void updateStudentName() {
        String studentNumberName=JOptionPane.showInputDialog(null,"Please Enter Student ID for Update ?");
        for (Map.Entry<Integer, Student> entry:studentHashMap.entrySet()){
            if (entry.getValue().StudentID.equals(studentNumberName)){
                String studentNewName=JOptionPane.showInputDialog(null,"Please Enter New Name ?");
                entry.getValue().StudentName=studentNewName;
                JOptionPane.showMessageDialog(null,"Student Name is Updated");
                break;
            }

        }

    }

    private void splitComma(String studentNumberName) {
        ArrayList<String> stdNumberName=new ArrayList<>(Arrays.asList(studentNumberName.split(",")));
        StudentID=stdNumberName.get(0);
        StudentName=stdNumberName.get(1);
    }

    private void listData(){
        for (Map.Entry<Integer, Student> entry:studentHashMap.entrySet()){
            System.out.println("Student ID  Name : "+entry.getValue().StudentID+" "+entry.getValue().StudentName);
        }
    }
}

class Student{

     String StudentID;
     String StudentName;

    public Student() {
    }

    public Student(String studentID, String studentName) {
        StudentID = studentID;
        StudentName = studentName;
    }
}