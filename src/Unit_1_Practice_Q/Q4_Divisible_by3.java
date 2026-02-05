package Unit_1_Practice_Q;

/*

Use a lambda to Check if a Number is Divisible by 3.
 */

interface CheckDivisibility{
    public boolean check(int x);
}
public class Q4_Divisible_by3 {
    public static void main(String[] args) {
        CheckDivisibility d1 = x -> (x%3==0) ? true : false;

        System.out.println("Is number divisible by 3: "+d1.check(9));
    }
}
