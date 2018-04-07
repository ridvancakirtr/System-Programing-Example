package Exercises2_1;

public class Main {
    public static void main(String[] args) {
        Book book_1 = new Book("AZRA",15,5);
        Book book_2 = new Book("MAYRA",22,1);
        Book book_3 = new Book("KANCA",35,2);

        System.out.println(book_1.getName() +" "+book_1.getPrice());
        System.out.println(book_2.getName() +" "+book_2.getPrice());
        System.out.println(book_3.getName() +" "+book_3.getPrice());


    }
}
