import java.util.Scanner;
class triangle{
	public static void main(String args[]){
		Scanner value=new Scanner(System.in);
		System.out.println("Enter the sides of the triangle");
		int a=value.nextInt();
		int b=value.nextInt();
		int c=value.nextInt();
		if(a+b < c || b+c < a || a+c < b){
			System.out.println("We can't make a triangle with this values");
		}
		else{
		if(a==b && b==c){
			System.out.println("The triangle is equilatoral ");
		}
		else if(a==b || b==c || a==c){
			System.out.println("The triangle is isoceles");
		}
		else{
			System.out.println("The triangle is scalene");
		}
		double s=(a+b+c)/2.0;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area of the triangle is:"+area);
		}
	}
}