package Unit_1;

interface i11{
    public void calculate(int x);
    public void check(int x);

}
class Square implements i11{
    @Override
    public void calculate(int x) {
        int square = x*x;
        System.out.println("Square is: "+square);
    }
    public void check(int x){
        if(x%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
public class A07B_FullAbstraction {
    public static void main(String[] args) {
        Square s = new Square();
        s.calculate(5);
        s.check(5);
    }
}
