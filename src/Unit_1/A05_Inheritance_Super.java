package Unit_1;

import java.sql.SQLOutput;

class AA{
    int y =10;
    void show(){
        System.out.println("Parent class AA");
    }
    AA(){
        System.out.println("class AA constructor");
    }
    AA(int x){
        System.out.println("parameterized constructor of AA");
    }

}
class BB extends AA{
    int y = 67;

    BB(){
        super(5); // call parent parameterized constructor
        System.out.println("Inside child constructor");
    }

    void print(){
        System.out.println("Child class BB y value: "+y);
        System.out.println("Parent class AA y value: "+super.y);  // ( parent variable ) use super for variable access
    }
}
public class A05_Inheritance_Super {
    public static void main(String[] args) {
        BB b = new BB();
        b.print();
//        b.show();
    }
}
