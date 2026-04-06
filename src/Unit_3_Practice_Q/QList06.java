package Unit_3_Practice_Q;

import java.util.List;

public class QList06 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(-12,43,0,25,-75,48,50);
        List<Integer> res = l1.stream().filter(x -> x>0).toList();

        System.out.println(res);
    }
}
