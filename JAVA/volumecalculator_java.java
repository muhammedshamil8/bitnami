import java.util.Scanner;

interface Volume {
    double PI = 3.1415;
    void readdata();
    void dispvolume();
}

class Sphere implements Volume {
    private double radius;

    public void readdata() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere:");
        radius = scanner.nextDouble();
    }

    public void dispvolume() {
        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3); 
        System.out.println("Volume of the sphere: " + volume);
    }
}

class Cylinder implements Volume {
    private double radius;
    private double height;

    public void readdata() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder:");
        radius = scanner.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        height = scanner.nextDouble();
    }

    public void dispvolume() {
        double volume = PI * Math.pow(radius, 2) * height; 
        System.out.println("Volume of the cylinder: " + volume);
    }
}

public class volumecalculator_java {
    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        sphere.readdata();
        sphere.dispvolume();

        Cylinder cylinder = new Cylinder();
        cylinder.readdata();
        cylinder.dispvolume();
    }
}