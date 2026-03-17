package Unit_2;

public class A11_SwitchNew {
    public static void main(String[] args) {
            int a = 20,b = 5;

            char ch = '-';

            int res = switch (ch){
                case '+' -> a+b;
                case '-' -> a-b;
                case '*' -> a*b;
                case '/' -> a/b;
                default -> -1;
            };
        System.out.println("Clculation is :"+res);

        String day = "monday";

        int d = switch (day){
            case "monday","friday","sunday" -> 6;
            case "tuesday" -> 7;
            case "wednesday" ->9;
            case "thursday","saturday" ->8;
            default -> -1;
        };
//        System.out.print();
        System.out.println("Day count is: "+d);
    }
}
