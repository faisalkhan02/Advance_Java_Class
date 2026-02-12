package Unit_2_Practice_Q;
/*
Write a method reference to check if a string is empty using String class.
 */

interface MyInterface3{
    boolean check(String str);
}
public class Q10_MF_checkEmptyString {
    public static void main(String[] args) {
        MyInterface3 mi = String :: isEmpty;

        System.out.println("Is String empty? = "+mi.check(""));

        System.out.println("Is String empty? = "+mi.check("faisal"));
    }
}
