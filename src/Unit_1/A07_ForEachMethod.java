package Unit_1;

import java.util.ArrayList;
import java.util.List;

public class A07_ForEachMethod {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        l.add(34);
        l.add(36);
        l.add(25);
        l.add(55);
        l.add(12);
        l.add(43);

        l.forEach(i ->{
            if(i%2 ==0){
                System.out.println(i);
            }
        });

        List<String > l2 = new ArrayList<>();
        l2.add("faisal");
        l2.add("khan");
        l2.add("Faisal Khan");
        l2.add("free");

        System.out.println("=====Print name with ! mark=====");
        l2.forEach(s -> System.out.println(s +"!")
        );

        System.out.println("=====Print name with Upper case=====");
        l2.forEach(s -> System.out.println(s.toUpperCase())); //

        System.out.println("=====Print name with Hello =====");
        l2.forEach(s -> System.out.println("Hello "+s));

        System.out.println("=====Print element (length > 5)=====");
        l2.forEach(s -> {
            if(s.length() >5 ) System.out.println(s);
        });

        System.out.println("===== print name starting with 'f' =====" );
        l2.forEach(s ->{
            if(s.startsWith("f")) System.out.println(s);
        });
    }
}
