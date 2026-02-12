package Unit_2_Practice_Q;
// Create a interface MathUtil with static methods and use method reference to:
// add numbers
// find maximum
// check even/odd


interface addOperate{
    int operate(int a,int b);
}
interface maxOperate{
    int findMax(int a,int b);
}
interface evenOdd{
    boolean isEven(int a);
}

interface MathUtil{
    static int add(int x,int y){
        return x+y;
    }
    static int maximum(int x,int y){
        return (x>y)?x:y;
    }
    static boolean evenOddCheck(int x){
        return (x % 2 == 0);
    }
}
public class Q12_MR_staticMethod {
    public static void main(String[] args) {
        addOperate a1 = MathUtil::add;
        maxOperate max = MathUtil::maximum;
        evenOdd check1 = MathUtil::evenOddCheck;

        System.out.println("addition: "+a1.operate(5,3));
        System.out.println("maximum: "+max.findMax(5,8));
        System.out.println("Is even: "+check1.isEven(7));
    }
}
