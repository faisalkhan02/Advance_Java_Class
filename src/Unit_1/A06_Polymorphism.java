package Unit_1;

class Test{
    public int sum(int x,int y){
        System.out.println("parent class");
        return x+y;
    }
    public int sum(int x,int y,int z){
        return x+y+z;
    }

}
class Test2 extends Test{
    public int sum(int x,int y){
        System.out.println("child class");
        return x+y;
    }
}
public class A06_Polymorphism {
    public static void main(String[] args) {
//        Test t = new Test();
//        System.out.println("sum: "+t.sum(1,2));
//        System.out.println("sum: "+t.sum(1,2,4));

//        ParentClass pc = new ChildClass();    //Upcasting

//        obj.show(1,2)   // Dynamic Method Dispatch

        Test2 t2 = new Test2();
        System.out.println("sum: "+t2.sum(1,2));
    }
}
