package Unit_3_Practice_Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student2{
    int marks;
    String name;

    Student2(int marks,String name){
        this.marks=marks;
        this.name = name;
    }
}
public class QList01 {
    public static void main(String[] args) {

        List<Student2> l2 = Arrays.asList(
                new Student2(45,"Faisal"),
                new Student2(45,"Gaurav"),
                new Student2(45,"Hemant"),
                new Student2(45,"Harsh")
                );

        List<String> names = l2.stream().map(s->s.name).collect(Collectors.toList());

        System.out.println(names);

    }
}
