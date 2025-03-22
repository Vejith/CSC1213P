import java.util.Scanner;
class Ex{
	public static void main(String [] args)
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		double num = ob.nextDouble();
		
		if (num%2==0)
		{
			System.out.println("This an even Number");
			
		}
		else
		{
			System.out.println("This an odd Number");
			
		}
	}
}