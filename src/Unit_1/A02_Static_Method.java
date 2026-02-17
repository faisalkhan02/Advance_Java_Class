package Unit_1;

class Student1{
    int id;
    String name;
    static String college = "KIET"; // we can access it anywhere, we don't need to initialize everytime

    Student1(int id , String name){
        this.name = name;
        this.id= id;
    }
    void display (){
        System.out.println("id= "+id+" name= "+name+" college= "+college);
    }

    static void show(){
        System.out.println("I am a static method");
    }
}
public class A02_Static_Method {
    public static void main(String[] args) {
        Student1 s1 = new Student1(10,"Faisal");
        s1.display();

        Student1 s2 = new Student1(12,"Khan");
        s2.display();
        s1.college = "KIET Deemed to be University"; // if we change static variable's value, this will change for everyone
        s1.display();
        s2.display(); // now kiet is changed for s2 also

        System.out.println(Student1.college); // we can call static without object creation directly with class name

        Student1.show(); // call static method without creating  object

    }
}
