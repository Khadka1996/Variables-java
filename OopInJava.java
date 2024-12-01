// Base class
class Shape {
    public void area() {
        System.out.println("Area of shape are listed below");
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    public void area(int l, int b) {
        System.out.println("Area of Triangle: " + (0.5 * l * b));
    }
}

// Square class extending Shape
class Square extends Shape {
    public void area(int l) {
        System.out.println("Area of Square: " + (l * l));
    }
}

// Circle class extending Shape
class Circle extends Shape {
    public void area(int r) {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

// Main class
public class OopInJava {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(); 
        
        Triangle triangle = new Triangle();
        triangle.area(5, 10); // Example: base = 5, height = 10
        
        Square square = new Square();
        square.area(4); // Example: side length = 4
        
        Circle circle = new Circle();
        circle.area(7); // Example: radius = 7
    }
}
