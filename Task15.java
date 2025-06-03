interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

    class Circle extends AbstractShape {
        private double radius;

        public Circle(String color, double radius) {
            super(color, 0, 0);
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
    
    @Override
        public String toString() {
            return "Circle [Color: " + color + ", Radius: " + radius + "]";
    }
}

    class Rectangle extends AbstractShape {
    
        public Rectangle(String color, double length, double width) {
            super(color, length, width);
    }
    
    @Override
        public String toString() {
            return "Rectangle [Color: " + color + ", Length: " + length + ", Width: " + width + "]";
    }
}

    public class Task15 {
        public static void main(String[] args) {
            
            Circle circle = new Circle("Purple", 12.0);
            Rectangle rectangle = new Rectangle("Pink", 8.0, 4.0);
        
            System.out.println(circle);
            System.out.println("Area: " + circle.calculateArea());
            System.out.println("Perimeter: " + circle.calculatePerimeter());
            System.out.println();
            System.out.println(rectangle);
            System.out.println("Area: " + rectangle.calculateArea());
            System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}