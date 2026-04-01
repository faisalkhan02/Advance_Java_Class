package Unit_3;

import java.util.Comparator;
import java.util.List;

public class A04_Sort_List {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(12,43,25,75,48,50);

        // 1st method
        List <Integer> l2 = l1.stream().sorted().toList(); // this will sort in ascending order
        List <Integer> l3 = l1.stream().sorted(Comparator.reverseOrder()).toList(); // this will sort in descending order
        System.out.println(l3);

        // 2nd method
        List <Integer> l4 = l1.stream().sorted((x,y) -> y.compareTo(x)).toList();
        System.out.println("2nd method: "+l4);

    }
}
