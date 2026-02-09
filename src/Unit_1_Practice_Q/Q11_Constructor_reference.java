package Unit_1_Practice_Q;

/*
Create a constructor reference for a class Book.
 */

interface MyInterface4{
    void print ();
}
class Book{
    Book(){
        System.out.println("Book is good");
    }
}
public class Q11_Constructor_reference {
    public static void main(String[] args) {
        MyInterface4 mi = Book ::new;
        mi.print();
    }
}
