import java.util.Scanner;
class mergeArray{
    public static void main(String args[]){
       firstArray ob1=new firstArray();
       ob1.display();
    }
}
class firstArray{
    Scanner number=new Scanner(System.in);
    void display(){
    System.out.println("Enter the size of the array");
    int n1=number.nextInt();
    System.out.println("Enter the elements to array");
    int[] array1 = new int[n1];
    for(int i=0;i<n1;i++){
        array1[i]=number.nextInt();
    }
    System.out.println("Enter the size of second array");
    int n2=number.nextInt();
    System.out.println("Enter the elements to array");
    int[] array2 = new int[n2];
    for(int i=0;i<n2;i++){
        array2[i]=number.nextInt();
    }
    System.out.println("merged array:");
    int[] merge=new int[n1+n2];
    for(int i=0;i<n1;i++){
         merge[i]=array1[i];
    }
      for(int i=0;i<n2;i++){
         merge[n1+i]=array2[i];
    }
    for(int i=0;i<n1+n2;i++){
        System.out.println(merge[i]+" ");
    }
    }
}