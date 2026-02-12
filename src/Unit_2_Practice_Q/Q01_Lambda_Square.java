package Unit_2_Practice_Q;

/*
Write a lambda expression to implement the MathOperation functional
 interface that returns the square of a given integer.
 */
interface MathOperation{
    public int display(int x);
}
public class Q01_Lambda_Square {
    public static void main(String[] args) {
        MathOperation mo = x -> x*x;

        System.out.println("Square is: "+mo.display(5));
    }
}
