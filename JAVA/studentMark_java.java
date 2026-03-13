import java.util.Scanner;

class Student {
    String name;
    int rollNumber;

      public void readStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
    }

       public void displayStudentDetails() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Mark extends Student {
    int[] marks = new int[5]; // Array to store marks of 5 subjects
    int total;
    double average;

    public void readMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter marks for 5 subjects: ");
        total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i]; 
        }
    }

        public void calculateAverage() {
        average = total / 5.0; 
    }

       public void displayMarksAndResult() {
               for (int i = 0; i < 5; i++) {
            System.out.println("Marks for Subject " + (i + 1) + ": " + marks[i]);
        }
               System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}


public class studentMark_java {
    public static void main(String[] args) {
              Mark student = new Mark();

               student.readStudentDetails();
        student.displayStudentDetails();

        
        student.readMarks();
        student.calculateAverage();
        student.displayMarksAndResult();
    }
}