package FileExercises;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Exercises_4 {
    Exercises_4(){
        int readASCII;
        try{
            FileInputStream fin=new FileInputStream("JavaFile.txt");
            BufferedInputStream br = new BufferedInputStream(fin);
            while((readASCII=br.read())!=-1){
                char readChar=(char)readASCII;
                    System.out.print(readChar);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
