package Unit_3;

import java.util.List;

public class A02_UniqueList {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(10,20,31,10,25,50,20,40,40);

        l1.stream().distinct().forEach(System.out::println);

        System.out.println("== another method ==");

        List<Integer>l2 = l1.stream().distinct().toList(); // add unique element into list
        System.out.println(l2); // print list

         List<Integer>l3 = l1.stream().distinct().skip(3).toList(); // skip first 3 element
        System.out.println(l3); // print list


         List<Integer>l4 = l1.stream().distinct().skip(1).limit(3).toList(); // limit give only limited value
        System.out.println(l4); // print list

        List<Integer>l5 = l1.stream().toList();
        long c = l5.stream().count(); // count element


        long c2 = l5.stream().skip(1).limit(4).count(); // count element
        System.out.println(c2);

        long c3 = l5.stream().filter(x->x%2==0).limit(3).count(); // count first 3 even element
        System.out.println("Even element:"+c3);

    }
}
