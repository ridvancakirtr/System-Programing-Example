package Exercises;

import java.io.File;
import java.io.IOException;

import static com.sun.deploy.trace.Trace.flush;

class Exercises_3 {
    Exercises_3(){
        //New File Create
        try {
            File file = new File("JavaFile.txt");
            if (file.createNewFile()) {
                System.out.println("New File is created!");
                flush();
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
