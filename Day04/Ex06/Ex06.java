import java.util.Scanner;
public class Ex06{
   public static void main(String args[]){
	 Scanner s=new Scanner(System.in);

     System.out.println("Enter the size of array : ");
     int size=s.nextInt();

     int numbers[]=new int[size];

     for(int i=0;i<size;i++)
     {
	     System.out.print("Enter the element "+(i+1)+" : ");
	     numbers[i]=s.nextInt();
     }
	 System.out.println();
	 System.out.println("Elements of the Array: ");
	 for(int number:numbers)
	 {
		 System.out.print(number+"\t");
	 }	 
   }
}   