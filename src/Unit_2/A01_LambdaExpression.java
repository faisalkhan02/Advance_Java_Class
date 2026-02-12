package Unit_2;


interface noparameter{
    String display();

}
public class A01_LambdaExpression {
    public static void main(String[] args) {
//                noparameter n = () -> {
//                    System.out.println("hello");
//                    System.out.println("java");
//                };
//                n.display();

        noparameter n2 = () -> { return "hello world";};
        String s= n2.display();
        System.out.println(s);



    }
}
