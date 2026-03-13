public import java.util.Scanner;
class removeVowel{
	public static void main(String args[]){
		vowel obj=new vowel();
		obj.findVowel();
	}
}
class vowel{
	void findVowel(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
    String line=sc.nextLine();
	
	for(int i=0;i<line.length();i++){  
	    char ch = line.charAt(i);
	    
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            continue;
            
         }
         
        System.out.print(ch);
	    
	}
	
	}
} removeVowel_java {
    
}
