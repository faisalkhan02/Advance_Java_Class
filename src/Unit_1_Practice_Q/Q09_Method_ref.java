package Unit_1_Practice_Q;
/*
Create a functional interface that takes a String and returns its length.
Then, use the method reference String::length to implement this interface.
 */

interface MyInterface2{
   int calculate(String name);
}
public class Q9_Method_ref {
    public static void main(String[] args) {
        MyInterface2 mn = String::length;

        System.out.println(mn.calculate("Faisal Khan"));

    }
}
