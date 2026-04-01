package Unit_3;

import java.util.List;
import java.util.Optional;

public class A06_Stream_reduce {
    public static void main(String[] args) {

        List<Integer> l1 = List.of(10,20,31,10,25,50,20,40,40);

//        l1.stream().reduce((e1, e2) -> e1+e2).ifPresent(System.out::println);

        Optional x= l1.stream().reduce((e1, e2) -> e1+e2);
        System.out.println(x);

        // another method

        int sum = l1.stream().reduce(0,(e1,e2) -> e1+e2);
        System.out.println(sum);



    }
}
