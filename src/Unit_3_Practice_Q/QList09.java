package Unit_3_Practice_Q;

import java.util.List;

public class QList09 {
    public static void main(String[] args) {
        List<String> list = List.of("ABCAA5","XYA","AAADDD","BC","DDA","AAAC");

        List<String> res = list.stream().filter(x -> x.length() >5).toList();

        System.out.println(res);
    }
}
