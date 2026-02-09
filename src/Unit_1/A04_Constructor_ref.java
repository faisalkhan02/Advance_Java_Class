package Unit_1;
interface Int4{
    Student get();
}
class Student{
    Student(){
        System.out.println("creating student");
    }
}
public class A04_Constructor_ref {
    public static void main(String[] args) {
        Int4 i4 = Student::new;
        i4.get();
    }
}
