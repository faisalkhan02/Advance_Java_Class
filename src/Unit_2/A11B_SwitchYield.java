package Unit_2;

public class A11B_SwitchYield {
    public static void main(String[] args) {
        String month = "january";
        String season = switch (month){
            case "january","february","november","december" ->{
                System.out.println("Greeting of the day");
                yield month + " is winter";
            }
            case "june","july"->{
                System.out.println("Greeting of the day");
                yield "summer";
            }
            default -> {
                yield "invalid month";
            }
        };
        System.out.println(season);

        int num = 2;
        String output = switch (num){
            case 1 :{
                yield "one";
            }
            case 2:{
                yield "two";
            }
            default:{
                yield "invalid";
            }
        };
        System.out.println(output);
    }
}

