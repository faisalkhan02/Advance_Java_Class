package Unit_1;

//class student{
//
//}
record Student01(int id,String name){
public void show(){
    System.out.println("inside record");
}
}
public class A09_Encapsulation_Record {
    public static void main(String[] args) {
        Student01 s1 = new Student01(1,"khan");

        System.out.println(s1.id()+" "+s1.name());

        Student01 s2 = new Student01(2,"Faisal");
        System.out.println(s2.id()+" "+s2.name());
    }
}
