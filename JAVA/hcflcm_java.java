import java.util.Scanner;

class hcflcm {
    
    
    public static int hcf(int num1, int num2) {
        while (num2 != 0) {
            int reminder = num1 % num2;
            num1 = num2;
            num2 = reminder;
        }
        return num1; 
    }

    public static void lcm(int num1, int num2, int hcfResult) {
        int lcm = (num1 * num2) / hcfResult;
        System.out.println("LCM of the numbers is: " + lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        int hcfResult = hcf(num1, num2);
        System.out.println("HCF of the numbers is: " + hcfResult);
        lcm(num1, num2, hcfResult);
    }
}