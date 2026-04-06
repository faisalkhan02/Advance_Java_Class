package Unit_3_Practice_Q;

import java.util.List;

public class QList05 {
    public static void main(String[] args) {
        List<String> list = List.of("ABC","XYA","AAA","BDC","DDA","AAAC");
        List<String> res = list.stream().filter(s -> s.endsWith("A")).toList();

        System.out.println(res);

    }
}
