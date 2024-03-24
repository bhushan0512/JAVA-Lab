abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method to calculate the area of the shape
    public abstract double calculateArea();

    // Concrete method
    public void display() {
        System.out.println("This is a " + color + " shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class a4prog2 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.display();
        System.out.println("Area: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        rectangle.display();
        System.out.println("Area: " + rectangle.calculateArea());
    }
}

