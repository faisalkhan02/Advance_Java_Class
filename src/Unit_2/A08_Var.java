package Unit_2;

class Test2{
    Test2(){
        var x =23;
        System.out.println("constructor value "+x);
    }
    void check(){
        var s ="hello";
//        return s;
        System.out.println(s);

    }
}
public class A08_Var {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.check();

        for(var i =0;i<=4;i++){
            System.out.println(i);
        }
    }
}
