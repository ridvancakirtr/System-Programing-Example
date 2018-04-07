package Exercises;

import java.io.FileInputStream;

public class Exercises_5 {
    Exercises_5(){
        int readASCII;
        try{
            FileInputStream fin=new FileInputStream("JavaFile.txt");
            while((readASCII=fin.read())!=-1){
                char readChar=(char)readASCII;
                if (readChar=='e'){
                    System.out.print(readChar);
                }
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
