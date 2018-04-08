package FileExercises;

class Exercises_1 {
    Exercises_1(){
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
