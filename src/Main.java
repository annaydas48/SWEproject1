class bmw {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving at 180 KMH...");
    }
}

public class Main {
    public static void main(String[] args) {
        bmw myCar = new bmw(); // object creation
        myCar.color = "Red";
        myCar.speed = 100;
        myCar.drive();
    }
}
