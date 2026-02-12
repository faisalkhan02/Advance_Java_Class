package Unit_2;


interface inter1{   //default method ke liye

    default void def1() {
        System.out.println("Default method inside the interface1");
    }
}
interface inter3{   //static method ke liye
    static int add(int x,int y) {
        return x+y;
    }
}
interface inter2{   //default method ka hi hai

    default void def1() {
        System.out.println("Default method inside the interface2");
    }
}
public class A05_DefaultMethod implements inter1,inter2,inter3 {

    public void def1() {
        inter1.super.def1();
        inter2.super.def1();
    }
    public static void main(String[] args) {
        A05_DefaultMethod d=new A05_DefaultMethod();
        d.def1();
        System.out.println(inter3.add(4, 5)); //yaha pe static method ko call kiya




    }
}
