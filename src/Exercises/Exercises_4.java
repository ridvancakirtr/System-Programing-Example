package Exercises;

import java.io.FileOutputStream;

public class Exercises_4 {
    Exercises_4(){
        //Read File Data
        String data ="Cyprus International University";
        try {
            FileOutputStream fout=new FileOutputStream("JavaFile.txt");
            //fout.write(data.getBytes()); //different method for writing files
            for (int i=0;i< data.length() ;  i++ ) {
                fout.write( data.charAt(i));
            }
            fout.flush();
            fout.close();
            System.out.println("success...");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
