package Unit_1_Practice_Q;
/*
Write a lambda expression that takes no arguments and returns the string "Hello Lambda!".
 */

interface Greet{
    String print();
}
public class Q06_No_Argument {
    public static void main(String[] args) {
        Greet g = () -> "Hello Lambda";

        System.out.println(g.print());
    }
}
