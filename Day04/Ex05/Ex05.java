import java.util.Scanner;
public class Ex05{
   public static void main(String args[]){
	 Scanner s=new Scanner(System.in);

     System.out.print("Enter the size of array : ");
     int size=s.nextInt();

     int number1[]=new int[size];

     for(int i=0;i<number1.length;i++)
     {
	     System.out.print("Enter the element "+(i+1)+" : ");
	     number1[i]=s.nextInt();
     }
	 System.out.println("\nArray Elements : ");
	 for(int i=0;i<number1.length;i++)
	 {
		 System.out.print(number1[i]+"\t");
	 }	 
	 int max=number1[0];
     int min=number1[0];
     int sum=0; 	 
     double average;
     
     for(int i=0;i<number1.length;i++)
	 {
         if(number1[i]>max)
             max=number1[i];
         if(number1[i]<min)
             min=number1[i];
         sum+=number1[i];
     }
     average=(double)sum/number1.length;
     
     System.out.println("\n\nMaximum element : "+max);	 
	 System.out.println("Minimum element : "+min);	 
	 System.out.println("Summation : "+sum);	 
	 System.out.println("Average : "+average);

     System.out.println("\nEnter the element you want to search : ");
     int SearchElement=s.nextInt();
     boolean found=false;

     for(int i=0;i<number1.length;i++)
     {
          if(number1[i]==SearchElement){
            System.out.println("Element found at position : "+(i+1));
            found=true;
            break;
	      }
     }
     if(!found)
        System.out.println("Element not found");
     
     boolean isUnique=true;
     for(int i=0;i<number1.length-1;i++)
     {
        for(int j=i+1;j<number1.length;j++)
		{
            if(number1[i]==number1[j])
			{
              isUnique=false;
              break;			  
			}	
          if(!isUnique)
              break;
		}
	 }
     if(isUnique)
        System.out.println("All elements are unique.");
     else
        System.out.println("Not unique-duplicate elements exist.");		 
	
   }
}   