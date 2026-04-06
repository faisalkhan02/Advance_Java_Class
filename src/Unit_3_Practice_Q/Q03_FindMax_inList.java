package Unit_3_Practice_Q;

import java.util.List;
import java.util.Optional;

public class Q03_FindMax_inList {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(10,20,31,10,25,50,20,40,40);

        Optional pro = l1.stream().reduce((e1, e2) -> e1*e2);

        System.out.println(pro);

        // find maximum
        Optional max = l1.stream().reduce((e1,e2) -> (e1>e2) ? e1:e2);
        System.out.println(max);

        // count element

//        Optional co = l1.stream().reduce(0,(x, y) -> x);
//
//        System.out.println(co);

//         even sum

        Optional sum = l1.stream().filter(x -> x%2==0).reduce((e1, e2) ->e1+e2);

        System.out.println(sum);

        List<Integer> l2 = List.of(10,-20,31,-10,25,50,20,-40,40);

//        Optional n = l2.stream().map(a<0 ?0<b)

    }

    public static class QList10 {
    }
}
