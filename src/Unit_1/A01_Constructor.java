package Unit_1;

class Student{
    int id;
    String name;

    Student(){      //  A constructor is a block of codes similar to the method
                    //  A constructor name must be the same as its class name
        System.out.println("No argument Constructor");
        id = 23;
    }

    Student(int id, String name){       //parameterised constructor
        this.id = id;
        this.name = name;

        System.out.println(id+" "+name);
    }
    Student(Student s){         // Copy constructor
        this.id = s.id;
        this.name = s.name;

        System.out.println("Copy value: "+id+" "+name);
    }


}
public class A01_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.id);
        Student s2 = new Student(105,"Faisal");
        Student s3 = new Student(s2);
    }
}
