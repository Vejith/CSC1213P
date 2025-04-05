import java.util.Scanner;

public class Ex02{
	public static void main(String args[]){
		char c;
		Scanner s=new Scanner(System.in); 
		int sum=0;
		do{
			System.out.println("Enter the number to find the summation : ");
			int n=s.nextInt();
			sum+=n;
			System.out.println("Do you want to continue (Y/N) : ");
			c=s.next().charAt(0);
		}while(c=='Y');
		System.out.println("Summation of numbers : "+sum);
	}
}