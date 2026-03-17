package Unit_1;

class A{
    void show(){
        System.out.println("Parent class A");
    }
}
class B extends A{      // Single Inheritance
    void display(){
        System.out.println("Child class B");
    }
}

class C extends B{      //Multilevel Inheritance
    void check(){
        System.out.println("Child class C");
    }
}

class D extends A{          //  hierarchical inheritance
    void print(){           //  Ek Parent → Multiple Child
        System.out.println("I am hierarchical inheritance");
    }
}
public class A04_Inheritance {
    public static void main(String[] args) {
//        B b = new B();
//        b.show();
//        b.display();

        C c = new C();
        c.check();
        c.display();
        c.show();

        D d = new D();
        d.print();
        d.show();
    }
}
