package Unit_3_Practice_Q;
import java.util.*;
import java.util.stream.Collectors;

// Write a Java program to extract the names of all students
// from a list of Student objects using map().

class Student{
    int id;
    String name;

    Student(int id,String name){
        this.id = id;
        this.name=name;
    }
}
public class Q01_ {
    public static void main(String[] args) {
        List<Student> std  = Arrays.asList(
                new Student (1,"faisal"),
                new Student (2,"abcd"),
                new Student (3,"xyza")
        );

        List<String> names = std.stream().map(s->s.name).collect(Collectors.toList());
        System.out.println(names);
    }
}
