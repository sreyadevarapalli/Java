package OOPS_Programs.Inheritance;
class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is Driving");
    }
}

class Bike extends Vehicle {

    void ride() {
        System.out.println("Bike is Riding");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.drive();

        Bike b = new Bike();
        b.start();
        b.ride();
    }
}