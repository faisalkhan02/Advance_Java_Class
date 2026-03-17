package Unit_1_Paractice_Q;

/*
    Create a class Vehicle with:

instance variable speed
parameterized constructor

Create a class Car that:

calls parent constructor using super
adds brand variable
displays both values
 */
class Vehicle{
    int speed;
    Vehicle(int speed){
        this.speed = speed;
    }
}
class Car extends Vehicle{
    String brand;
    Car(String brand, int speed){
        super(speed);
        this.brand = brand;

    }
    void print(){
        System.out.println("Brand is: "+brand);
        System.out.println("Speed is: "+speed);
    }

}
public class Q01 {
    public static void main(String[] args) {
    Car c = new Car("TATA",50);
    c.print();
    }
}
