package Unit_3_Practice_Q;


import java.util.*;

public class QList12 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(12,43,25,75,48,50);

        List<Integer> res = l1.stream().map(x->x+10).toList();
        System.out.println(res);
    }
}
