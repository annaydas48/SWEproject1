class Vehicle {
    protected String brand = "Generic Vehicle";

    void start() {
        System.out.println(brand + " is starting...");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Riding the " + brand);
    }
}

public class Inheritance_and_Protected_Access {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.start();  // Inherited method
        myBike.ride();   // Bike's own method
    }
}
