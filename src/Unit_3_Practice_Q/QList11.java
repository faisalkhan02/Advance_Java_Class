package Unit_3_Practice_Q;

import java.util.List;

public class QList11 {
    public static void main(String[] args) {

        List<String> list = List.of("aaa","bbb","AAA","ccc","edA","AadC");

        List<String> res = list.stream().map(x -> x.toUpperCase()).toList();

        System.out.println(res);
    }
}
