// Abstract class Shape
abstract class Shape {
    abstract void calculateArea(); // Abstract method to be implemented by subclasses
}

// Circle class
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius; // Formula for circle area
        System.out.println("Area of Circle: " + area);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width; // Formula for rectangle area
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;

    // Constructor
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void calculateArea() {
        double area = 0.5 * base * height; // Formula for triangle area
        System.out.println("Area of Triangle: " + area);
    }
}

// Main class
public class AbstractionMathShapes {
    public static void main(String[] args) {
        // Create instances of different shapes
        Shape circle = new Circle(5); // Circle with radius 5
        Shape rectangle = new Rectangle(10, 4); // Rectangle with length 10 and width 4
        Shape triangle = new Triangle(6, 8); // Triangle with base 6 and height 8

        // Calculate and display areas
        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();
    }
}
