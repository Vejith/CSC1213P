import java.util.Scanner;
class ElseIf{
	public static void main (String [] args)
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double num = ob.nextDouble();
		
		if (num > 0)
		{
			System.out.println("It is a positive number");
		}
		else if (num < 0)
		{
			System.out.println("It is a negative number");
		}
		else
		{
			System.out.println("The number is zero");
		}
	}
}