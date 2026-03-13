import java.util.Scanner;

class ComplexNumber {
    double real;  
    double imag;  

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public ComplexNumber add(ComplexNumber other) {
        double resultReal = this.real + other.real;  
        double resultImag = this.imag + other.imag;  
        return new ComplexNumber(resultReal, resultImag);
    }
    public void display() {
        if (imag < 0) {
            System.out.println(real + " - " + Math.abs(imag) + "i");
        } else {
            System.out.println(real + " + " + imag + "i");
        }
    }
}

public class Complex_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imag1 = scanner.nextDouble();

        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imag2 = scanner.nextDouble();

        ComplexNumber num1 = new ComplexNumber(real1, imag1);
        ComplexNumber num2 = new ComplexNumber(real2, imag2);

        System.out.print("First Complex Number: ");
        num1.display();
        System.out.print("Second Complex Number: ");
        num2.display();

        ComplexNumber sum = num1.add(num2);

        System.out.print("Sum of the Complex Numbers: ");
        sum.display();
        scanner.close();
    }
}