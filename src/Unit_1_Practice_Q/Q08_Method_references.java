package Unit_1_Practice_Q;

/*
Create a class Greeter with a method sayHello(String name)
and call it via method reference.
 */
interface MyInterface{
    void print(String name);
}
class Greeter{
    void sayHello(String name){
        System.out.println("Hello "+name+" I am method reference");
    }

}
public class Q08_Method_references {
    public static void main(String[] args) {
        Greeter g =new Greeter();

        // Method Reference
        MyInterface m = g :: sayHello;

        m.print("Faisal");
    }
}
