package Unit_1;

import org.w3c.dom.ls.LSOutput;

interface Int1{
    void show();
}
interface Int2{
    int cal(String s);
}
interface Int3{
    String print(String s);
}
public class A3_Method_Ref {
    public static void main(String[] args) {
        Int2  i2 = String :: length;
        Int3 i3 = String ::toUpperCase;

        System.out.println(i2.cal("Faisal"));
        System.out.println(i3.print("faisal"));
    }
}
