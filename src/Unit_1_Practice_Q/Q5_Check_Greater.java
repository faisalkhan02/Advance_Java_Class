package Unit_1_Practice_Q;

interface CheckGreaterOf10{
    boolean check(int x);
}
public class Q5_Check_Greater {
    public static void main(String[] args) {
        CheckGreaterOf10 c = x ->(x>10) ? true :false;

        System.out.println( c.check(7));

    }
}
