package OOPs;

interface GeometricShape {
    double calculateArea();
    double calculatePerimeter();
}

class Circles implements GeometricShape {
    private double radius;

    public Circles(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangles implements GeometricShape {
    private double width;
    private double height;

    public Rectangles(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        GeometricShape circle = new Circles(5.0);
        GeometricShape rectangle = new Rectangles(4.0, 6.0);

        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());
    }
}