package Unit_2;

interface MyInterface8{
    private void checkbalance(){
        System.out.println("checking balance");
    }
    default void deposit(){
        System.out.println("money deposit");
        checkbalance();
    }
}
public class A06_PrivateMethod implements MyInterface8{
    public static void main(String[] args) {
        A06_PrivateMethod p = new A06_PrivateMethod();
        p.deposit();
    }
}
