package Unit_3;

import java.util.List;

public class A03_MinMax_Method {
    public static void main(String[] args) {

        List<Integer> l1 = List.of(12,43,25,75,48,50);

        int minimum = l1.stream().min((x,y) ->x.compareTo(y)).get();
        System.out.println("minimum: "+minimum);

        int maximum = l1.stream().max((x,y) ->x.compareTo(y)).get();
        System.out.println("maximum: "+maximum);
    }
}
