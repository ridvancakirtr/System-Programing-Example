package Laboratory_Exercises_1;

import javax.swing.*;

public class Exercises_1 {
    private int TotalStudent=2;
    private String Name[]=new String[TotalStudent];
    private int Midterm,Final;
    private double[] Avarage=new double[TotalStudent];
    private double TotalAvarage=0.0;
    Exercises_1(){
        for (int i=0;i<TotalStudent;i++){
            //Separate with commas by entering values
            String studentNameMidtermFinal= JOptionPane.showInputDialog(null,"Student Name,Midterm,Final ?");
            String[] data=studentNameMidtermFinal.split(",");
            Name[i]=data[0];
            Midterm=Integer.parseInt(data[1]);
            Final=Integer.parseInt(data[2]);
            Avarage[i]=(Midterm*0.40+Final*0.60);
            TotalAvarage+= Avarage[i]/TotalStudent;
        }

        for (int i=0;i<TotalStudent;i++){
            System.out.println("Name : "+Name[i]+"\tAvg : "+Avarage[i]+"\tTotal Avg : "+TotalAvarage);
        }
    }
}
