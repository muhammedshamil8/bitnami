import java.util.Scanner;
class displayVolume{
	public static void main(String args[]){
	volumeCube ob1=new volumeCube();
	ob1.volume();
	volumeRectangle ob2=new volumeRectangle();
	ob2.volume();
	volumeCylinder ob3=new volumeCylinder();
	ob3.volume();
	}		
}
class volumeCube{
	Scanner number=new Scanner(System.in);
	
	void volume(){
		System.out.println("Enter the side of cube");
		int a=number.nextInt();
		int result=a*a*a;
		System.out.println("Volume of the cube:"+result);
		}
}
class volumeRectangle{
	Scanner number=new Scanner(System.in);
	
	void volume(){
		System.out.println("Enter the height,width,length of rectangle");
		int height=number.nextInt();
		int width=number.nextInt();  
		int length=number.nextInt();   
		int result=height*width*length;
		System.out.println("Volume of the rectangle:"+result);
		}
}
class volumeCylinder{
	Scanner number=new Scanner(System.in);
	void volume(){
		System.out.println("Enter the radius ,height of cylinder");
		int radius=number.nextInt();
		int height=number.nextInt();  
		   
		double result=height*radius*radius*3.14;
		System.out.println("Volume of the cylinder:"+result);
		}
}