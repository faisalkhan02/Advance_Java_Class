package Unit_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A01_Stream {
    public static void main(String[] args) {

        // 1st method using Array
        System.out.println("== 1st method using Array ==");
        int [] arr={3,4,5,7,8,30,29};

        IntStream s = Arrays.stream(arr);
        s.forEach(System.out::println); //s.forEach(x -> System.out.println(x));

        // 2nd method Values
        System.out.println("== 2nd method Values ==");
        Stream<Integer>s2 = Stream.of(2,6,7,9,10,54);
        s2.forEach(System.out::println); //s2.forEach(x -> System.out.println(x));

        // 3rd method Collections
        System.out.println("== 3rd method Collections ==");
        List<Integer> l3 = new ArrayList<>();
        l3.add(23);
        l3.add(20);
        l3.add(50);
        l3.add(41);

        Stream <Integer>s3 = l3.stream();

        s3.forEach(x -> System.out.println(x));


        System.out.println("== Even number print ==");
        List<Integer> l4 = l3.stream().filter(x -> x%2==0 ).collect(Collectors.toList());
        System.out.println(l4);

        System.out.println("== Even number square print ==");
        List<Integer> l5 = l3.stream().filter(x -> x%2==0 ).map(x -> x*x).collect(Collectors.toList());
        System.out.println(l5);
    }
}
