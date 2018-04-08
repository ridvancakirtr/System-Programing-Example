package Laboratory_Exercises_1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercises_1 {
    private String Name;
    private int Midterm,Final;
    private double Avarage;
    private double TotalAvarage=0.0;
    Exercises_1(){
        for (int i=0;i<2;i++){
            //Separate with commas by entering values
            String studentNameMidtermFinal= JOptionPane.showInputDialog(null,"Student Name,Midterm,Final ?");
            separeteComma(studentNameMidtermFinal);
            System.out.println("Name : "+Name+"   Avarage : "+Avarage);
        }
        TotalAvarage=TotalAvarage/2;
        JOptionPane.showMessageDialog(null,"Total Avarage : "+TotalAvarage);
    }


    private void separeteComma(String studentNameMidtermFinal) {
        String[] data=studentNameMidtermFinal.split(",");
        Name=data[0];
        Midterm=Integer.parseInt(data[1]);
        Final=Integer.parseInt(data[2]);
        Avarage=Midterm*0.40+Final*0.60;
        TotalAvarage+=Avarage;
    }
}
class student{
    private String sname;
    private Double savg;

    public student(String name, Double avarage) {
        this.sname = name;
        this.savg = avarage;
    }
}
