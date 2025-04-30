abstract class Shape {
    abstract void draw(); // abstract method

    void info() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class abstruct_class {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();  // Implemented abstract method
        c.info();  // Concrete method from abstract class
    }
}
