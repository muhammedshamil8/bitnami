import java.util.Scanner;
class numberReverse{
	int number;
	numberReverse(int num) {
		number=num;
	}
	int Sum(){
		int sum=0;
		int temp=number;
		while(temp !=0) {
			sum+=temp % 10;
			temp /=10;
		}
		return sum;
	}
	 int reverseNumber() {
		int reversed=0;
		int temp=number;
		while(temp!=0){
			reversed=reversed * 10 + temp % 10;
			temp /=10;
		}
		return reversed;
	}
	public static void main(String args[]){
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sr.nextInt();
		numberOperation obj=new numberOperation(num);
		int sum=obj.Sum();
		System.out.println("Sum of digits:" +sum);
		int reversedNumber=obj.reverseNumber();
		System.out.println("Reverse number:"+reversedNumber);
	}
}