package Unit_1;

abstract class Shape{
    abstract public void calculation(int x,int y); // abstract method

    // normal method (with body)
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Rectangle extends Shape{
    @Override
    public void calculation(int l,int b) {
        int area = l*b;
        System.out.println("area is: "+area);
    }
}
public class A07_Abstraction {
    public static void main(String[] args) {
        Shape r = new Rectangle(); // upcasting (parent reference and child object)
        r.calculation(5,4);
    }
}
