public class Abstraction {
    public static void main(String[] args) {
        Car cr = new Car();

        cr.start();

        cr.color = "white";
        System.out.println("This is my name");
    }
}

// start, stop, acceleration, applyBreaks

//// 0-100 abstraction;

// abstract class Vehicle {
// int height;
// int weight;
// String color;
// int topSpeed;
// int torque;
// int seats;

// // All children must have its implementation.
// abstract void start();

// abstract void stop();

// abstract void acceleration();

// void applyBreaks() {
// System.out.println("Vehicle is applying breaks");
// };

// }

//// 100% abstraction.
interface Vehicle {

    // All children must have its implementation.
    abstract void start();

    abstract void stop();

    abstract void acceleration();

}

class Car implements Vehicle {
    Boolean haveSunroof;

    @Override
    public void start() {
        System.out.println("Car is started");
    }

    @Override
    public void stop() {
        System.out.println("Car is stoped");
    }

    @Override
    public void acceleration() {
        System.out.println("Car is accelerating");
    }

}

class Truck extends Vehicle {
    int maxLoad;

    @Override
    void start() {
        System.out.println("Truck is started");
    }

    @Override
    void stop() {
        System.out.println("Truck is stoped");
    }

    @Override
    void acceleration() {
        System.out.println("Truck is accelerating");
    }

    @Override
    void applyBreaks() {
        System.out.println("Truck is applying breaks.");
    }

}
