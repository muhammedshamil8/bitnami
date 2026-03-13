import java.util.Scanner;

abstract class Shape {
    double a, b;
    abstract void area(); // Abstract method to be implemented by subclasses
}

// TwoDim class for 2D shapes
abstract class TwoDim extends Shape {}

// ThreeDim class for 3D shapes
abstract class ThreeDim extends Shape {} 

// Square Class (2D)
class Square extends TwoDim {
    Square() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        a = sc.nextDouble();
    }
    
    void area() {
        System.out.println("Area of square = " + (a * a));
    }
}

// Triangle Class (2D)
class Triangle extends TwoDim {
    Triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base and height of the triangle: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
    }

    void area() {
        System.out.println("Area of triangle = " + (0.5 * a * b));
    }
}

// Cube Class (3D)
class Cube extends ThreeDim {
    Cube() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of the cube: ");
        a = sc.nextDouble();
    }

    void area() {
        System.out.println("Surface area of cube = " + (6 * a * a));
    }
}

// Sphere Class (3D)
class Sphere extends ThreeDim {
    Sphere() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        a = sc.nextDouble();
    }

    void area() {
        System.out.println("Surface area of sphere = " + (4 * Math.PI * a * a));
    }
}

// Main Class
public class ShapeMain_java {
    public static void main(String args[]) {
        Square sq = new Square();
        sq.area();

        Triangle tri = new Triangle();
        tri.area();

        Cube cube = new Cube();
        cube.area();

        Sphere sph = new Sphere();
        sph.area();
    }
}