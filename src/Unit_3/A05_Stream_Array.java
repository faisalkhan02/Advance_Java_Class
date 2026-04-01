package Unit_3;

import java.util.List;

public class A05_Stream_Array {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(10,20,31,10,25,50,20,40,40);

        long c = l1.stream().count();
    }
}
