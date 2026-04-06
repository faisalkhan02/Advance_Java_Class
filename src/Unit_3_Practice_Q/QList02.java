package Unit_3_Practice_Q;

import java.util.List;

public class QList02 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(12,43,25,75,48,50);

        List<Integer> res = l1.stream()
                .filter(x ->x>50)
                .toList();
        System.out.println(res);
    }
}
