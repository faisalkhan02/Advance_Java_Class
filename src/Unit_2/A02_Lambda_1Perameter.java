package Unit_2;

interface OneParameter{
    public int display(int x);
}

public class A02_Lambda_1Perameter {
    public static void main(String[] args) {
        OneParameter n = a -> a*a;

        System.out.println("Square: "+n.display(4));
    }
}
