class Vehicle {
    String name;
    int capacity;
    int tyre;

    Vehicle(String name, int tyre, int capacity) {
        this.name = name;
        this.tyre = tyre;
        this.capacity = capacity;
    }

    void showDetails() {
        System.out.println("company : " + name);
        System.out.println("Wheels : " + tyre);
        System.out.println("Capacity of car : " + capacity);
    }

    // if max speed not given
    void maxSpeed() {
        System.out.println("Vehicle max speed not defined");
    }
}

class Car extends Vehicle {
    int speed;

    Car(String name, int tyre, int capacity, int speed) {
        super(name, tyre, capacity);
        this.speed = speed;

    }

    void maxSpeed() {

        System.out.println("Speed of car : " + speed + "km/h");

    }
}

class Bicycle extends Vehicle {
    int speed;

    Bicycle(String name, int tyre, int capacity, int speed) {
        super(name, tyre, capacity);
        this.speed = speed;

    }

    void maxSpeed() {

        System.out.println("Speed of Bicycle : " + speed + "km/h");

    }

}

class Scooter extends Vehicle {
    int speed;

    Scooter(String name, int tyre, int capacity, int speed) {
        super(name, tyre, capacity);
        this.speed = speed;

    }

    void maxSpeed() {

        System.out.println("Speed of Scooter :  " + speed + "km/h");

    }

}

public class InnerVehicle {
    public static void main(String[] args) {
        Car c = new Car("Tuxon", 4, 5, 80);
        Bicycle b = new Bicycle("Hero", 2, 1, 30);
        Scooter s = new Scooter("Jupiter", 2, 2, 50);
        // car
        c.showDetails();
        c.maxSpeed();
        System.out.println();
        // bicycle
        b.showDetails();
        b.maxSpeed();
        System.out.println();
        // scooter
        s.showDetails();
        s.maxSpeed();

    }

}
