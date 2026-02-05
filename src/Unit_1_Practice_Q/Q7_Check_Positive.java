package Unit_1_Practice_Q;
/*
Write a lambda expression that implements IsPositive and returns true if the integer is positive.
 */

interface IsPositive{
    boolean check(int x);
}
public class Q7_Check_Positive {
    public static void main(String[] args) {
        IsPositive c = x -> (x>=0) ? true : false;

        System.out.println(c.check(-10));
    }
}
