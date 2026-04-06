package Unit_3_Practice_Q;

import java.util.List;

public class QList08 {
    public static void main(String[] args) {

        List<String> list = List.of("BBBC","XYZ","AAA","BDAC","DDA","WASC");

        List<String> res = list.stream().filter(s -> s.contains("A")).toList();

        System.out.println(res);
    }
}
