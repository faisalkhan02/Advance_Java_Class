package Unit_1;

public class A03_Static_block {

    static{ // static block run automatically when main method is run we don't need to call it

        String name = "Faisal";

        System.out.println("I am a static block");
        System.out.println(name);
    }
    public static void main(String[] args) {
        String name = "khan";
    }
}
