import java.util.Scanner;
public class Ex02{
	public static void main (String [] args)
	{
		Scanner ob = new Scanner(System.in);
		int arr [] = new int[5];
		int sum=0;
		
		for (int i=0; i<5; i++)
		{
			System.out.print("Enter a number: ");
			arr [i] = ob.nextInt();
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of the numbers: "+sum);
	}
}