package Unit_2;

sealed class Vehicle permits Car, Bike{     // if we make a class sealed than his child class
    public void start(){                    // should be sealed/final/non-sealed
        System.out.println("Vehicle started");
    }
}

final class Car extends Vehicle{    // we extends sealed class here so
    public void run(){
        System.out.println("Car is running");
    }
}
// if we make a sealed child class than we must make a child class of this sealed child class which permit to his sub class
// this process will continue whether we make sub class final/non-sealed
non-sealed class Bike extends Vehicle{
    public void run(){
        System.out.println("Bike is running");
    }
}
public class A10_SealedClass {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.start();
        Car c = new Car();
        c.run();
        Bike b = new Bike();
        b.run();
    }
}
