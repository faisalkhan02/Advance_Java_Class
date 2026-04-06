package Unit_3_Practice_Q;

import java.util.List;

public class QList04 {
    public static void main(String[] args) {

        List<String> list = List.of("ABC","XYZ","AAA","BDC","Arr");
        List<String> res = list.stream().filter(s -> s.startsWith("A")).toList();

        System.out.println(res);
    }
}
