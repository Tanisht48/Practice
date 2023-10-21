package OOPs;

class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping.");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    public void drive() {
        System.out.println("The car is driving with " + numberOfDoors + " doors.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);

        System.out.println("Brand: " + myCar.brand);
        System.out.println("Number of doors: " + myCar.numberOfDoors);

        myCar.start();
        myCar.drive();
        myCar.stop();
    }
}
