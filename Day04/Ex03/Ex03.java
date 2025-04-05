import java.util.Scanner;
public class Ex03{
	public static void main(String args[]){
		char c;
		Scanner s=new Scanner(System.in); 
		int sum1=0,sum2=0,count1=0,count2=0;
		do{
			System.out.println("Enter the number to find the summation : ");
			int n=s.nextInt();
			if(n%2==0)
			{   count1++;
				sum1+=n;
		    }
			else
			{   count2++;
				sum2+=n;
			}
			System.out.println("Do you want to continue (Y/N) : ");
			c=s.next().charAt(0);
		}while(c=='Y');
		System.out.println("Summation of even numbers : " + sum1+ " And the count of even numbers : "+ count1);
		System.out.println("Summation of odd numbers : " + sum2 + " And the count of odd numbers : "+ count2);
	}
}