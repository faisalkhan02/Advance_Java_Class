package Unit_3_Practice_Q;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int salary;
    String name;

    Employee(int salary,String name){
        this.salary = salary;
        this.name = name;
    }
}
public class Q02 {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee(10000,"Faisal"),
                new Employee(70000,"Khan"),
                new Employee(15000,"Saif"),
                new Employee(150000,"kkkk")
        );
        List<String> names = emp.stream().filter(x->x.salary>60000).map(s->s.name.toUpperCase()).collect(Collectors.toList());
        System.out.println(names);
    }
}
