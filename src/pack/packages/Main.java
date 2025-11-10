//package pack.packages;
//
//class Shape {
//    public double area(double radius) { 
//        return Math.PI * radius * radius;
//    }
//    public double area(double length, double width) { 
//        return length * width;
//    }
//    public double area(double radius, double height) { 
//        return 2 * Math.PI * radius * height;
//    }
//    public void displayShapeType() {
//        System.out.println("This is a generic shape.");
//    }
//}
//
//class Circle extends Shape {
//    @Override
//    public double area(double radius) {
//        return Math.PI * radius * radius;
//    }
//    @Override
//    public void displayShapeType() {
//        System.out.println("This is a Circle.");
//    }
//}
//
//class Rectangle extends Shape {
//    @Override
//    public double area(double length, double width) {
//        return length * width;
//    }
//    @Override
//    public void displayShapeType() {
//        System.out.println("This is a Rectangle.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Shape shape = new Shape();
//        Circle circle = new Circle();
//        Rectangle rectangle = new Rectangle();
//        System.out.println("Area of Circle with radius 5: " + shape.area(5));
//        System.out.println("Area of Rectangle with length 5 and width 10: " + shape.area(5, 10));
//        System.out.println("Area of Cylinder with radius 5 and height 7: " + shape.area(5, 7));
//        shape.displayShapeType();
//        circle.displayShapeType();
//        rectangle.displayShapeType();
//        System.out.println("Area of Circle with radius 5 (using Circle class): " + circle.area(5));
//        System.out.println("Area of Rectangle with length 5 and width 10 (using Rectangle class): " + rectangle.area(5, 10));
//    }
//}
