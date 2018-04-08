package Laboratory_Exercises_1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

class Exercises_5 {
    private int numberOfStudents=2;
    private int StudentNumber=0;
    private int QuizNote=0;
    ArrayList<StudentDetails> arrayList = new ArrayList<>();
    Exercises_5(){
        for (int i=0;i<numberOfStudents;i++){
            String da=JOptionPane.showInputDialog(null,"Plase Enter Student Number and Quiz Note");
            splitComma(da);
            arrayList.add(new StudentDetails(StudentNumber,QuizNote));
        }
        shortData();
        selectDeleteStudent();
        listAllStudent();
    }

    private void shortData() {
        int c, d, swap;
        for (c = 0; c < ( numberOfStudents - 1 ); c++) {
            for (d = 0; d < numberOfStudents - c - 1; d++) {
                if (arrayList.get(d).QuizNote < arrayList.get(d+1).QuizNote) // For descending order use
                {
                    swap       = arrayList.get(d).QuizNote;
                    arrayList.get(d).QuizNote   = arrayList.get(d+1).QuizNote;
                    arrayList.get(d+1).QuizNote = swap;

                    swap       = arrayList.get(d).StudentNumber;
                    arrayList.get(d).StudentNumber   = arrayList.get(d+1).StudentNumber;
                    arrayList.get(d+1).StudentNumber = swap;
                }
            }
        }

        System.out.println("Sorted list of numbers");

        for (c = 0; c < numberOfStudents; c++)
            System.out.println(arrayList.get(c).StudentNumber+" "+arrayList.get(c).QuizNote);
    }

    private void listAllStudent() {
        for (int i=0;i<arrayList.size();i++){
            System.out.println("-- New List --\n"+arrayList.get(i).StudentNumber+" "+arrayList.get(i).QuizNote);
        }
    }

    private void selectDeleteStudent() {
        int dialogButton = JOptionPane.showConfirmDialog (null, "Would you like to delete the Student ?","WARNING",JOptionPane.YES_NO_OPTION);
        if (dialogButton==JOptionPane.YES_OPTION){
            String id=JOptionPane.showInputDialog(null,"Plase Enter Student ID for Delete");
            for (int i=0;i<arrayList.size();i++){
                if (arrayList.get(i).StudentNumber==Integer.parseInt(id)){
                    arrayList.remove(i);
                }
            }
        }

    }

    private void splitComma(String studentNumberQuiz) {
        ArrayList<String> stdNumberQuiz=new ArrayList<>(Arrays.asList(studentNumberQuiz.split(",")));
        StudentNumber=Integer.parseInt(stdNumberQuiz.get(0));
        QuizNote=Integer.parseInt(stdNumberQuiz.get(1));
    }

}

class StudentDetails{
    int StudentNumber;
    int QuizNote;
    public StudentDetails(int studentNumber, int quizNote) {
        StudentNumber = studentNumber;
        QuizNote = quizNote;
    }
}

