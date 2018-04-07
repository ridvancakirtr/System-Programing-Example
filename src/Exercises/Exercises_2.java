package Exercises;

class Exercises_2 {
    Exercises_2(){
        boolean t=false;
        String value="I like (Java) Programing ";
        for (int i=0;i<value.length();i++) {
            if (value.charAt(i) == '('){
                t=true;
                continue;
            }
            if (value.charAt(i) == ')')
                t=false;
            if (t)
                System.out.println(value.charAt(i));
        }
    }
}
